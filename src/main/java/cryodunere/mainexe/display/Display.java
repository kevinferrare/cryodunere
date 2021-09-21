package cryodunere.mainexe.display;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class Display extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(Display.class);

  private DisplayGlobalsOnDs globalsOnDs;

  public Display(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "display", machine);
    globalsOnDs = new DisplayGlobalsOnDs(machine);
    defineFunction(segment, 0xC07C, "setVideoBufferSegmentDBD6", this::setVideoBufferSegmentDBD6_0x1ED_0xC07C_0xDF4C);
    defineFunction(segment, 0xC085, "setDialogueVideoBufferSegmentDC32",
        this::setDialogueVideoBufferSegmentDC32_0x1ED_0xC085_0xDF55);
    defineFunction(segment, 0xC08E, "setTextVideoBufferSegmentDBD8",
        this::setTextVideoBufferSegmentDBD8_0x1ED_0xC08E_0xDF5E);
  }

  public Runnable setVideoBufferSegmentDBD6_0x1ED_0xC07C_0xDF4C() {
    int value = globalsOnDs.getBufferSegmentDBD6();
    return setVideoBuffer(value, "setDialogueVideoBufferSegmentDC32");
  }

  public Runnable setDialogueVideoBufferSegmentDC32_0x1ED_0xC085_0xDF55() {
    int value = globalsOnDs.getBufferSegmentDialogueDC32();
    return setVideoBuffer(value, "setDialogueVideoBufferSegmentDC32");
  }

  public Runnable setTextVideoBufferSegmentDBD8_0x1ED_0xC08E_0xDF5E() {
    int value = globalsOnDs.getBufferSegmentDBD8();
    return setVideoBuffer(value, "setTextVideoBufferSegmentDBD8");
  }

  private Runnable setVideoBuffer(int value, String functionName) {
    int oldValue = globalsOnDs.getBufferSegmentDBDA();
    if (value != oldValue) {
      globalsOnDs.setBufferSegmentDBDA(value);
      LOGGER.debug("{} value:{}, oldValue:{}", functionName, value, oldValue);
    }
    return nearRet();
  }
}
