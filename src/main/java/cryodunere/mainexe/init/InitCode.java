package cryodunere.mainexe.init;

import java.util.Map;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class InitCode extends JavaOverrideHelper {
  private InitGlobalsOnDs globals;

  public InitCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "initRelated", machine);
    globals = new InitGlobalsOnDs(machine);
    defineFunction(segment, 0xDA53, "vgaInitRelated", this::vgaInitRelated_0x1ED_0xDA53_0xF923);
  }

  public Runnable vgaInitRelated_0x1ED_0xDA53_0xF923() {
    this.globals.setDC6A(0);
    this.globals.set46D7(0);
    return nearRet();
  }
}
