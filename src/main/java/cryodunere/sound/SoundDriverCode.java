package cryodunere.sound;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class SoundDriverCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(SoundDriverCode.class);
  private static final String CLEAR_AL = "clearAL";
  private int baseSegment1;
  private int baseSegment2;

  public SoundDriverCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int programStartSegment,
      Machine machine) {
    super(functionInformations, "soundDriverPcSpeaker", machine);

    baseSegment1 = 0x4635 + programStartSegment;
    defineFunction(baseSegment1, 0x100, "pcSpeakerActivationWithBXAndALCleanup",
        this::pcSpeakerActivationWithBXAndALCleanup_4822_100_48320);
    defineFunction(baseSegment1, 0x103, CLEAR_AL, this::clearAL_4822_103_48323);
    defineFunction(baseSegment1, 0x109, CLEAR_AL, this::clearAL_4822_109_48329);
    defineFunction(baseSegment1, 0x10C, CLEAR_AL, this::clearAL_4822_10C_4832C);
    defineFunction(baseSegment1, 0x115, CLEAR_AL, this::clearAL_4822_115_48335);
    defineFunction(baseSegment1, 0x182, "pcSpeakerActivationWithALCleanup",
        this::pcSpeakerActivationWithALCleanup_4822_182_483A2);
    defineFunction(baseSegment1, 0x188, "pcSpeakerActivation", this::pcSpeakerActivation_4822_188_483A8);

    baseSegment2 = 0x463E + programStartSegment;
    defineFunction(baseSegment2, 0x100, "pcSpeakerActivationWithBXAndALCleanup",
        this::pcSpeakerActivationWithBXAndALCleanup_482B_100_483B0);
    defineFunction(baseSegment2, 0x106, CLEAR_AL, this::clearAL_482B_106_483B6);
    defineFunction(baseSegment2, 0x112, CLEAR_AL, this::clearAL_482B_112_483C2);
    defineFunction(baseSegment2, 0x182, "pcSpeakerActivationWithALCleanup",
        this::pcSpeakerActivationWithALCleanup_482B_182_48432);
    defineFunction(baseSegment2, 0x188, "pcSpeakerActivation", this::pcSpeakerActivation_482B_188_48438);
  }

  public int getBaseSegment1() {
    return baseSegment1;
  }

  public int getBaseSegment2() {
    return baseSegment2;
  }

  public Runnable pcSpeakerActivationWithBXAndALCleanup_4822_100_48320() {
    pcSpeakerActivationWithALCleanup_4822_182_483A2();
    state.setBX(0);
    return farRet();
  }

  public Runnable clearAL_4822_103_48323() {
    return soundUnsupportedFarRet();
  }

  public Runnable clearAL_4822_109_48329() {
    return soundUnsupportedFarRet();
  }

  public Runnable clearAL_4822_10C_4832C() {
    return soundUnsupportedFarRet();
  }

  public Runnable clearAL_4822_115_48335() {
    return soundUnsupportedFarRet();
  }

  public Runnable pcSpeakerActivationWithALCleanup_4822_182_483A2() {
    pcSpeakerActivation_4822_188_483A8();
    return soundUnsupportedFarRet();
  }

  public Runnable pcSpeakerActivationWithBXAndALCleanup_482B_100_483B0() {
    LOGGER.debug("PC Speaker activation with BX and AL cleanup");
    pcSpeakerActivationWithALCleanup_482B_182_48432();
    state.setBX(0);
    return this.farRet();
  }

  public Runnable pcSpeakerActivation_4822_188_483A8() {
    LOGGER.debug("Other PC Speaker activation");
    return this.nearRet();
  }

  public Runnable pcSpeakerActivationWithALCleanup_482B_182_48432() {
    LOGGER.debug("PC Speaker activation with AL cleanup");
    pcSpeakerActivation_482B_188_48438();
    return soundUnsupportedFarRet();
  }

  public Runnable pcSpeakerActivation_482B_188_48438() {
    LOGGER.debug("PC Speaker activation");
    return this.nearRet();
  }

  public Runnable clearAL_482B_106_483B6() {
    return soundUnsupportedFarRet();
  }

  public Runnable clearAL_482B_112_483C2() {
    return soundUnsupportedFarRet();
  }

  private Runnable soundUnsupportedFarRet() {
    // 483A5
    state.setAL(0);
    return farRet();
  }
}
