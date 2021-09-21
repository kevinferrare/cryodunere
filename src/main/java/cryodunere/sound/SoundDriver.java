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
public class SoundDriver extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(SoundDriver.class);
  private static final String CLEAR_AL = "clearAL";
  private int baseSegment1;
  private int baseSegment2;

  public SoundDriver(Map<SegmentedAddress, FunctionInformation> functionInformations, int programStartSegment,
      Machine machine) {
    super(functionInformations, "soundDriverPcSpeaker", machine);

    baseSegment1 = 0x4635 + programStartSegment;
    defineFunction(baseSegment1, 0x100, "pcSpeakerActivationWithBXAndALCleanup",
        this::pcSpeakerActivationWithBXAndALCleanup_0x4822_0x100_0x48320);
    defineFunction(baseSegment1, 0x103, CLEAR_AL, this::clearAL_0x4822_0x103_0x48323);
    defineFunction(baseSegment1, 0x109, CLEAR_AL, this::clearAL_0x4822_0x109_0x48329);
    defineFunction(baseSegment1, 0x10C, CLEAR_AL, this::clearAL_0x4822_0x10C_0x4832C);
    defineFunction(baseSegment1, 0x115, CLEAR_AL, this::clearAL_0x4822_0x115_0x48335);
    defineFunction(baseSegment1, 0x182, "pcSpeakerActivationWithALCleanup",
        this::pcSpeakerActivationWithALCleanup_0x4822_0x182_0x483A2);
    defineFunction(baseSegment1, 0x188, "pcSpeakerActivation", this::pcSpeakerActivation_0x4822_0x188_0x483A8);

    baseSegment2 = 0x463E + programStartSegment;
    defineFunction(baseSegment2, 0x100, "pcSpeakerActivationWithBXAndALCleanup",
        this::pcSpeakerActivationWithBXAndALCleanup_0x482B_0x100_0x483B0);
    defineFunction(baseSegment2, 0x106, CLEAR_AL, this::clearAL_0x482B_0x106_0x483B6);
    defineFunction(baseSegment2, 0x112, CLEAR_AL, this::clearAL_0x482B_0x112_0x483C2);
    defineFunction(baseSegment2, 0x182, "pcSpeakerActivationWithALCleanup",
        this::pcSpeakerActivationWithALCleanup_0x482B_0x182_0x48432);
    defineFunction(baseSegment2, 0x188, "pcSpeakerActivation", this::pcSpeakerActivation_0x482B_0x188_0x48438);
  }

  public int getBaseSegment1() {
    return baseSegment1;
  }

  public int getBaseSegment2() {
    return baseSegment2;
  }

  private Runnable pcSpeakerActivationWithBXAndALCleanup_0x4822_0x100_0x48320() {
    pcSpeakerActivationWithALCleanup_0x4822_0x182_0x483A2();
    state.setBX(0);
    return farRet();
  }

  private Runnable clearAL_0x4822_0x103_0x48323() {
    return soundUnsupportedFarRet();
  }

  private Runnable clearAL_0x4822_0x109_0x48329() {
    return soundUnsupportedFarRet();
  }

  public Runnable clearAL_0x4822_0x10C_0x4832C() {
    return soundUnsupportedFarRet();
  }

  private Runnable clearAL_0x4822_0x115_0x48335() {
    return soundUnsupportedFarRet();
  }

  private Runnable pcSpeakerActivationWithALCleanup_0x4822_0x182_0x483A2() {
    pcSpeakerActivation_0x4822_0x188_0x483A8();
    return soundUnsupportedFarRet();
  }

  private Runnable pcSpeakerActivationWithBXAndALCleanup_0x482B_0x100_0x483B0() {
    LOGGER.debug("PC Speaker activation with BX and AL cleanup");
    pcSpeakerActivationWithALCleanup_0x482B_0x182_0x48432();
    state.setBX(0);
    return this.farRet();
  }

  private Runnable pcSpeakerActivation_0x4822_0x188_0x483A8() {
    LOGGER.debug("Other PC Speaker activation");
    return this.nearRet();
  }

  private Runnable pcSpeakerActivationWithALCleanup_0x482B_0x182_0x48432() {
    LOGGER.debug("PC Speaker activation with AL cleanup");
    pcSpeakerActivation_0x482B_0x188_0x48438();
    return soundUnsupportedFarRet();
  }

  private Runnable pcSpeakerActivation_0x482B_0x188_0x48438() {
    LOGGER.debug("PC Speaker activation");
    return this.nearRet();
  }

  private Runnable clearAL_0x482B_0x106_0x483B6() {
    return soundUnsupportedFarRet();
  }

  private Runnable clearAL_0x482B_0x112_0x483C2() {
    return soundUnsupportedFarRet();
  }

  private Runnable soundUnsupportedFarRet() {
    // 483A5
    state.setAL(0);
    return farRet();
  }
}
