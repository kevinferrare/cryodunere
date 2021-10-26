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
    defineFunction(segment, 0x98F5, "clearUnknownValuesAndAX", this::clearUnknownValuesAndAX_0x1ED_0x98F5_0xB7C5);
    defineFunction(segment, 0xC07C, "setVideoBufferSegmentDBD6", this::setVideoBufferSegmentDBD6_0x1ED_0xC07C_0xDF4C);
    defineFunction(segment, 0xC085, "setDialogueVideoBufferSegmentDC32",
        this::setDialogueVideoBufferSegmentDC32_0x1ED_0xC085_0xDF55);
    defineFunction(segment, 0xC08E, "setTextVideoBufferSegmentDBD8",
        this::setTextVideoBufferSegmentDBD8_0x1ED_0xC08E_0xDF5E);
    defineFunction(segment, 0xC0AD, "clearCurrentVideoBuffer", this::clearCurrentVideoBuffer_0x1ED_0xC0AD_0xDF7D);
    defineFunction(segment, 0xD05F, "getCharacterCoordsXY", this::getCharacterCoordsXY_0x1ED_0xD05F_0xEF2F);
    defineFunction(segment, 0xD068, "setFontToIntro", this::setFontToIntro_0x1ED_0xD068_0xEF38);
    defineFunction(segment, 0xD075, "setFontToMenu", this::setFontToMenu_0x1ED_0xD075_0xEF45);
    defineFunction(segment, 0xD082, "setFontToBook", this::setFontToBook_0x1ED_0xD082_0xEF52);
    defineFunction(segment, 0xE270, "pushAll", this::pushAll_0x1ED_0xE270_0x10140);
    defineFunction(segment, 0xE283, "popAll", this::popAll_0x1ED_0xE283_0x10153);
  }

  public Runnable clearUnknownValuesAndAX_0x1ED_0x98F5_0xB7C5() {
    // Called after screen change (video, room, dialogue, map ...).
    // When set to 255, cannot enter orni and enter palace instead
    LOGGER.debug("Before: 1C06:{}, 1BF8:{}, 1BEA:{}", globalsOnDs.get1C06(), globalsOnDs.get1BF8(),
        globalsOnDs.get1BEA());
    globalsOnDs.set1C06(0);
    // 128 after end of dialogue if character is in the room
    globalsOnDs.set1BF8(0);
    // 128 after end of dialogue
    globalsOnDs.set1BEA(0);
    // If not done, book videos will show a character on screen instead
    state.setAX(0);
    return nearRet();
  }

  public Runnable setVideoBufferSegmentDBD6_0x1ED_0xC07C_0xDF4C() {
    int value = globalsOnDs.getBufferSegmentDBD6();
    return setVideoBuffer(value, "setVideoBufferSegmentDBD6");
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

  // intro and map fonts
  public Runnable setFontToIntro_0x1ED_0xD068_0xEF38() {
    globalsOnDs.setFontRelated2518(0xD096);
    globalsOnDs.set47A0(0xCEEC);
    return nearRet();
  }

  // menu fonts related
  public Runnable setFontToMenu_0x1ED_0xD075_0xEF45() {
    globalsOnDs.setFontRelated2518(0xD12F);
    globalsOnDs.set47A0(0xCF6C);
    return nearRet();
  }

  // book fonts related
  public Runnable setFontToBook_0x1ED_0xD082_0xEF52() {
    globalsOnDs.setFontRelated2518(0xD0FF);
    globalsOnDs.set47A0(0xCEEC);
    return nearRet();
  }

  public Runnable pushAll_0x1ED_0xE270_0x10140() {
    LOGGER.debug("pushAll");
    stack.push(state.getBX());
    stack.push(state.getCX());
    stack.push(state.getDX());
    stack.push(state.getSI());
    stack.push(state.getDI());
    stack.push(state.getBP());
    int stackTop = stack.peek(0);
    // XCHG AX <-> Stack[0x0C]
    int stackPeek = stack.peek(0x0C);
    stack.poke(0x0C, state.getAX());
    // In the original assembly code, AX seems modified but it's not the case as it's restored to its original value
    // later.
    stack.push(stackPeek);
    state.setBP(stackTop);
    return nearRet();
  }

  public Runnable popAll_0x1ED_0xE283_0x10153() {
    LOGGER.debug("popAll");
    // Called in most changes related to display like scene change, displaying map, clicking on map, clicking on
    // characters ...
    // XCHG AX <-> Stack[0x0C] (or 0x0E if done before the pop)
    int ax = stack.pop();
    int stackPeek = stack.peek(0x0C);
    stack.poke(0x0C, ax);
    state.setAX(stackPeek);
    // Regular pops
    state.setBP(stack.pop());
    state.setDI(stack.pop());
    state.setSI(stack.pop());
    state.setDX(stack.pop());
    state.setCX(stack.pop());
    state.setBX(stack.pop());
    return nearRet();
  }
}
