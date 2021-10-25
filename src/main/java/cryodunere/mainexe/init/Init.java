package cryodunere.mainexe.init;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class Init extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(Init.class);

  private InitGlobalsOnDs globalsOnDs;

  public Init(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "initRelated", machine);
    globalsOnDs = new InitGlobalsOnDs(machine);
    defineFunction(segment, 0xDA53, "vgaInitRelated", this::vgaInitRelated_0x1ED_0xDA53_0xF923);
  }

  public Runnable vgaInitRelated_0x1ED_0xDA53_0xF923() {
    this.globalsOnDs.setDC6A(0);
    this.globalsOnDs.set46D7(0);
    return nearRet();
  }
}
