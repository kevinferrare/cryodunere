package cryodunere.mainexe.display;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cryodunere.vgadriver.VgaDriver;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class Display extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(Display.class);
  private VgaDriver vgaDriver;
  private DisplayGlobalsOnDs globalsOnDs;

  public Display(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine,
      VgaDriver vgaDriver) {
    super(functionInformations, "display", machine);
    this.vgaDriver = vgaDriver;
    globalsOnDs = new DisplayGlobalsOnDs(machine);
    defineFunction(segment, 0x98F5, "clearUnknownValues", this::clearUnknownValues_0x1ED_0x98F5_0xB7C5);
    defineFunction(segment, 0xC07C, "setVideoBufferSegmentDBD6", this::setVideoBufferSegmentDBD6_0x1ED_0xC07C_0xDF4C);
    defineFunction(segment, 0xC085, "setDialogueVideoBufferSegmentDC32",
        this::setDialogueVideoBufferSegmentDC32_0x1ED_0xC085_0xDF55);
    defineFunction(segment, 0xC08E, "setTextVideoBufferSegmentDBD8",
        this::setTextVideoBufferSegmentDBD8_0x1ED_0xC08E_0xDF5E);
    defineFunction(segment, 0xC0AD, "clearCurrentVideoBuffer", this::clearCurrentVideoBuffer_0x1ED_0xC0AD_0xDF7D);
    defineFunction(segment, 0xD05F, "getCharacterCoordsXY", this::getCharacterCoordsXY_0x1ED_0xD05F_0xEF2F);
  }

  public Runnable clearUnknownValues_0x1ED_0x98F5_0xB7C5() {
    // Called after screen change (video, room, dialogue, map ...).
    // When set to 255, cannot enter orni and enter palace instead
    LOGGER.debug("Before: 1C06:{}, 1BF8:{}, 1BEA:{}", globalsOnDs.get1C06(), globalsOnDs.get1BF8(),
        globalsOnDs.get1BEA());
    globalsOnDs.set1C06(0);
    // 128 after end of dialogue if character is in the room
    globalsOnDs.set1BF8(0);
    // 128 after end of dialogue
    globalsOnDs.set1BEA(0);
    return nearRet();
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
    int oldValue = globalsOnDs.getCurentVideoBufferSegmentDBDA();
    if (value != oldValue) {
      globalsOnDs.setCurrentVideoBufferSegmentDBDA(value);
      LOGGER.debug("{} value:{}, oldValue:{}", functionName, value, oldValue);
    }
    return nearRet();
  }

  public Runnable clearCurrentVideoBuffer_0x1ED_0xC0AD_0xDF7D() {
    state.setES(globalsOnDs.getCurentVideoBufferSegmentDBDA());
    vgaDriver.fillWithZeroFor64000AtES_0x2538_0x118_0x25498();
    return nearRet();
  }

  /**
   * Reads coordinates from memory and puts them in DX/BX.<br/>
   * Output:
   * <ul>
   * <li>DX: Character X coordinate</li>
   * <li>BX: Character Y coordinate</li>
   * </ul>
   */
  public Runnable getCharacterCoordsXY_0x1ED_0xD05F_0xEF2F() {
    int x = globalsOnDs.getCharacterXCoordD82C();
    int y = globalsOnDs.getCharacterYCoordD82E();
    state.setDX(x);
    state.setBX(y);
    LOGGER.debug("getCharacterCoordsXY x:{} y:{}", state.getDX(), state.getBX());
    return nearRet();
  }
}
