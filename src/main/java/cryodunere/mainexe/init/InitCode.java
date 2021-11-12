package cryodunere.mainexe.init;

import java.util.Map;

import cryodunere.globals.ExtraGlobalsOnDs;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class InitCode extends JavaOverrideHelper {
  private ExtraGlobalsOnDs globals;

  public InitCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "initRelated", machine);
    globals = new ExtraGlobalsOnDs(machine);
    defineFunction(segment, 0xDA53, "vgaInitRelated", this::vgaInitRelated_1ED_DA53_F923);
  }

  public Runnable vgaInitRelated_1ED_DA53_F923() {
    this.globals.set1138_DC6A_Word16(0);
    this.globals.set1138_46D7_Byte8(0);
    return nearRet();
  }
}
