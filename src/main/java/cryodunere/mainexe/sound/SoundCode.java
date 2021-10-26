package cryodunere.mainexe.sound;

import java.util.Map;

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
  private SoundGlobalsOnDs globals;

  public SoundCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine,
      SoundDriverCode soundDriver) {
    super(functionInformations, "sound", machine);
    this.soundDriver = soundDriver;
    this.globals = new SoundGlobalsOnDs(machine);
    defineFunction(segment, 0xAC30, "soundDriverUnknownClearAL", this::soundDriverUnknownClearAL_0x1ED_0xAC30_0xCB00);
    defineFunction(segment, 0xAEB7, "checkSoundPresent", this::checkSoundPresent_0x1ED_0xAEB7_0xCD87);
  }

  public Runnable soundDriverUnknownClearAL_0x1ED_0xAC30_0xCB00() {
    // Called at scene change
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3999, soundDriver.getBaseSegment1(), 0x10C);
    soundDriver.clearAL_0x4822_0x10C_0x4832C();
    return nearRet();
  }

  public Runnable checkSoundPresent_0x1ED_0xAEB7_0xCD87() {
    // Called before videos
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3975, soundDriver.getBaseSegment2(), 0x106);
    globals.setDBCB(0);
    soundDriver.clearAL_0x482B_0x106_0x483B6();
    globals.setIsSoundPresentDBCD(state.getAL());
    return nearRet();
  }
}
