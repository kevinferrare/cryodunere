package cryodunere.mainexe.sound;

import java.util.Map;

import cryodunere.globals.ExtraGlobalsOnDs;
import cryodunere.sound.SoundDriverCode;
import spice86.emulator.cpu.SegmentRegisters;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class SoundCode extends JavaOverrideHelper {
  private SoundDriverCode soundDriver;
  private ExtraGlobalsOnDs globals;

  public SoundCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine,
      SoundDriverCode soundDriver) {
    super(functionInformations, "sound", machine);
    this.soundDriver = soundDriver;
    this.globals = new ExtraGlobalsOnDs(machine);
    defineFunction(segment, 0xAC30, "soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida", this::soundDriverUnknownClearAL_1ED_AC30_CB00);
    defineFunction(segment, 0xAEB7, "checkSoundPresent/midi_func_2_0_ida", this::checkSoundPresent_1ED_AEB7_CD87);
  }

  public Runnable soundDriverUnknownClearAL_1ED_AC30_CB00() {
    // Called at scene change
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3999, soundDriver.getBaseSegment1(), 0x10C);
    soundDriver.clearAL_4822_10C_4832C();
    return nearRet();
  }

  public Runnable checkSoundPresent_1ED_AEB7_CD87() {
    // Called before videos
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3975, soundDriver.getBaseSegment2(), 0x106);
    globals.set1138_DBCB_Byte8(0);
    soundDriver.clearAL_482B_106_483B6();
    globals.set1138_DBCD_Byte8_IsSoundPresent(state.getAL());
    return nearRet();
  }
}
