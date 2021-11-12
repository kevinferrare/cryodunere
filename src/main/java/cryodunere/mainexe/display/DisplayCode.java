package cryodunere.mainexe.display;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cryodunere.globals.ExtraGlobalsOnDs;
import cryodunere.vgadriver.VgaDriverCode;
import spice86.emulator.cpu.SegmentRegisters;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class DisplayCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(DisplayCode.class);
  private VgaDriverCode vgaDriver;
  private ExtraGlobalsOnDs globals;

  public DisplayCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine,
      VgaDriverCode vgaDriver) {
    super(functionInformations, "display", machine);
    this.vgaDriver = vgaDriver;
    globals = new ExtraGlobalsOnDs(machine);
    defineFunction(segment, 0x0579, "clearVgaOffset01A3F/clear_global_y_offset_ida",
        this::clearVgaOffset01A3F_1ED_579_2449);
    defineFunction(segment, 0x98F5, "clearUnknownValuesAndAX", this::clearUnknownValuesAndAX_1ED_98F5_B7C5);
    defineFunction(segment, 0x9901, "set479ETo0", this::set479ETo0_1ED_9901_B7D1);
    defineFunction(segment, 0xC07C, "setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida",
        this::setVideoBufferSegmentDBD6_1ED_C07C_DF4C);
    defineFunction(segment, 0xC085, "setDialogueVideoBufferSegmentDC32/set_backbuffer_as_frame_buffer_ida",
        this::setDialogueVideoBufferSegmentDC32_1ED_C085_DF55);
    defineFunction(segment, 0xC08E, "setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida",
        this::setTextVideoBufferSegmentDBD8_1ED_C08E_DF5E);
    defineFunction(segment, 0xC0AD, "clearCurrentVideoBuffer/gfx_clear_frame_buffer_ida",
        this::clearCurrentVideoBuffer_1ED_C0AD_DF7D);
    defineFunction(segment, 0xD05F, "getCharacterCoordsXY", this::getCharacterCoordsXY_1ED_D05F_EF2F);
    defineFunction(segment, 0xD068, "setFontToIntro", this::setFontToIntro_1ED_D068_EF38);
    defineFunction(segment, 0xD075, "setFontToMenu", this::setFontToMenu_1ED_D075_EF45);
    defineFunction(segment, 0xD082, "setFontToBook", this::setFontToBook_1ED_D082_EF52);
    defineFunction(segment, 0xE270, "pushAll", this::pushAll_1ED_E270_10140);
    defineFunction(segment, 0xE283, "popAll", this::popAll_1ED_E283_10153);
  }

  // sets the gfx offset to 0
  public Runnable clearVgaOffset01A3F_1ED_579_2449() {
    LOGGER.debug("Clearing VGA offset");
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3939, vgaDriver.getBaseSegment(), 0x163);
    state.setAX(0);
    vgaDriver.updateVgaOffset01A3FromLineNumberAsAx_2538_163_254E3();
    return nearRet();
  }

  public Runnable clearUnknownValuesAndAX_1ED_98F5_B7C5() {
    // Called after screen change (video, room, dialogue, map ...).
    // When set to 255, cannot enter orni and enter palace instead
    LOGGER.debug("Before: 1C06:{}, 1BF8:{}, 1BEA:{}", globals.get1138_1C06_Word16(),
        globals.get1138_1BF8_Word16(), globals.get1138_1BEA_Word16());
    globals.set1138_1C06_Word16(0);
    // 128 after end of dialogue if character is in the room
    globals.set1138_1BF8_Word16(0);
    // 128 after end of dialogue
    globals.set1138_1BEA_Word16(0);
    // If not done, book videos will show a character on screen instead
    state.setAX(0);
    return nearRet();
  }

  public Runnable set479ETo0_1ED_9901_B7D1() {
    // Called in intro when skipping scenes and in the book when clicking subjects or quitting.
    // Screen in intro becomes garbled when setting something else than 0.
    globals.set1138_479E_Word16(0);
    return nearRet();
  }

  public Runnable setVideoBufferSegmentDBD6_1ED_C07C_DF4C() {
    int value = globals.get1138_DBD6_Word16_framebufferFront();
    return setVideoBuffer(value, "setVideoBufferSegmentDBD6");
  }

  public Runnable setDialogueVideoBufferSegmentDC32_1ED_C085_DF55() {
    int value = globals.get1138_DC32_Word16_framebufferBack();
    return setVideoBuffer(value, "setDialogueVideoBufferSegmentDC32");
  }

  public Runnable setTextVideoBufferSegmentDBD8_1ED_C08E_DF5E() {
    int value = globals.get1138_DBD8_Word16_screenBuffer();
    return setVideoBuffer(value, "setTextVideoBufferSegmentDBD8");
  }

  private Runnable setVideoBuffer(int value, String functionName) {
    int oldValue = globals.get1138_DBDA_Word16_framebufferActive();
    if (value != oldValue) {
      globals.set1138_DBDA_Word16_framebufferActive(value);
      LOGGER.debug("{} value:{}, oldValue:{}", functionName, value, oldValue);
    }
    return nearRet();
  }

  public Runnable clearCurrentVideoBuffer_1ED_C0AD_DF7D() {
    state.setES(globals.get1138_DBDA_Word16_framebufferActive());
    vgaDriver.fillWithZeroFor64000AtES_2538_118_25498();
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
  public Runnable getCharacterCoordsXY_1ED_D05F_EF2F() {
    int x = globals.get1138_D82C_Word16_CharacterXCoord();
    int y = globals.get1138_D82E_Word16_CharacterYCoord();
    state.setDX(x);
    state.setBX(y);
    LOGGER.debug("getCharacterCoordsXY x:{} y:{}", state.getDX(), state.getBX());
    return nearRet();
  }

  // intro and map fonts
  public Runnable setFontToIntro_1ED_D068_EF38() {
    globals.set1138_2518_Word16_FontRelated(0xD096);
    globals.set1138_47A0_Word16_FontRelated(0xCEEC);
    return nearRet();
  }

  // menu fonts related
  public Runnable setFontToMenu_1ED_D075_EF45() {
    globals.set1138_2518_Word16_FontRelated(0xD12F);
    globals.set1138_47A0_Word16_FontRelated(0xCF6C);
    return nearRet();
  }

  // book fonts related
  public Runnable setFontToBook_1ED_D082_EF52() {
    globals.set1138_2518_Word16_FontRelated(0xD0FF);
    globals.set1138_47A0_Word16_FontRelated(0xCEEC);
    return nearRet();
  }

  public Runnable pushAll_1ED_E270_10140() {
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

  public Runnable popAll_1ED_E283_10153() {
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
