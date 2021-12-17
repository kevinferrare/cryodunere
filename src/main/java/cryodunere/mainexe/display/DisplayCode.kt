package cryodunere.mainexe.display

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import cryodunere.vgadriver.VgaDriverCode
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import java.lang.Runnable
import org.slf4j.LoggerFactory
import spice86.emulator.cpu.SegmentRegisters

// Method names contain _ to separate addresses.
class DisplayCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int,
  machine: Machine,
  private val vgaDriver: VgaDriverCode) : JavaOverrideHelper(functionInformations, "display", machine) {
  companion object {
    private val LOGGER = LoggerFactory.getLogger(DisplayCode::class.java)
  }

  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine!!)
    defineFunction(segment, 0x0579,
      "clearVgaOffset01A3F/clear_global_y_offset_ida") { clearVgaOffset01A3F_1ED_579_2449() }
    defineFunction(segment, 0x98F5, "clearUnknownValuesAndAX") { clearUnknownValuesAndAX_1ED_98F5_B7C5() }
    defineFunction(segment, 0x9901, "set479ETo0") { set479ETo0_1ED_9901_B7D1() }
    defineFunction(segment, 0xC07C,
      "setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida") { setVideoBufferSegmentDBD6_1ED_C07C_DF4C() }
    defineFunction(segment, 0xC085,
      "setDialogueVideoBufferSegmentDC32/set_backbuffer_as_frame_buffer_ida") { setDialogueVideoBufferSegmentDC32_1ED_C085_DF55() }
    defineFunction(segment, 0xC08E,
      "setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida") { setTextVideoBufferSegmentDBD8_1ED_C08E_DF5E() }
    defineFunction(segment, 0xC0AD,
      "clearCurrentVideoBuffer/gfx_clear_frame_buffer_ida") { clearCurrentVideoBuffer_1ED_C0AD_DF7D() }
    defineFunction(segment, 0xD05F, "getCharacterCoordsXY") { getCharacterCoordsXY_1ED_D05F_EF2F() }
    defineFunction(segment, 0xD068, "setFontToIntro") { setFontToIntro_1ED_D068_EF38() }
    defineFunction(segment, 0xD075, "setFontToMenu") { setFontToMenu_1ED_D075_EF45() }
    defineFunction(segment, 0xD082, "setFontToBook") { setFontToBook_1ED_D082_EF52() }
    defineFunction(segment, 0xE270, "pushAll") { pushAll_1ED_E270_10140() }
    defineFunction(segment, 0xE283, "popAll") { popAll_1ED_E283_10153() }
  }

  // sets the gfx offset to 0
  fun clearVgaOffset01A3F_1ED_579_2449(): Runnable {
    LOGGER.debug("Clearing VGA offset")
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3939, vgaDriver.baseSegment, 0x163)
    state.ax = 0
    vgaDriver.updateVgaOffset01A3FromLineNumberAsAx_2538_163_254E3()
    return nearRet()
  }

  fun clearUnknownValuesAndAX_1ED_98F5_B7C5(): Runnable {
    // Called after screen change (video, room, dialogue, map ...).
    // When set to 255, cannot enter orni and enter palace instead
    LOGGER.debug("Before: 1C06:{}, 1BF8:{}, 1BEA:{}", globals.word16_1138_1C06,
      globals.word16_1138_1BF8, globals.word16_1138_1BEA)
    globals.word16_1138_1C06 = 0
    // 128 after end of dialogue if character is in the room
    globals.word16_1138_1BF8 = 0
    // 128 after end of dialogue
    globals.word16_1138_1BEA = 0
    // If not done, book videos will show a character on screen instead
    state.ax = 0
    return nearRet()
  }

  fun set479ETo0_1ED_9901_B7D1(): Runnable {
    // Called in intro when skipping scenes and in the book when clicking subjects or quitting.
    // Screen in intro becomes garbled when setting something else than 0.
    globals.word16_1138_479E = 0
    return nearRet()
  }

  fun setVideoBufferSegmentDBD6_1ED_C07C_DF4C(): Runnable {
    val value: Int = globals.word16_1138_DBD6_framebufferFront
    return setVideoBuffer(value, "setVideoBufferSegmentDBD6")
  }

  fun setDialogueVideoBufferSegmentDC32_1ED_C085_DF55(): Runnable {
    val value: Int = globals.word16_1138_DC32_framebufferBack
    return setVideoBuffer(value, "setDialogueVideoBufferSegmentDC32")
  }

  fun setTextVideoBufferSegmentDBD8_1ED_C08E_DF5E(): Runnable {
    val value: Int = globals.word16_1138_DBD8_screenBuffer
    return setVideoBuffer(value, "setTextVideoBufferSegmentDBD8")
  }

  private fun setVideoBuffer(value: Int, functionName: String): Runnable {
    val oldValue: Int = globals.word16_1138_DBDA_framebufferActive
    if (value != oldValue) {
      globals.word16_1138_DBDA_framebufferActive = value
      LOGGER.debug("{} value:{}, oldValue:{}", functionName, value, oldValue)
    }
    return nearRet()
  }

  fun clearCurrentVideoBuffer_1ED_C0AD_DF7D(): Runnable {
    state.es = globals.word16_1138_DBDA_framebufferActive
    vgaDriver.fillWithZeroFor64000AtES_2538_118_25498()
    return nearRet()
  }

  /**
   * Reads coordinates from memory and puts them in DX/BX.<br></br>
   * Output:
   *
   *  * DX: Character X coordinate
   *  * BX: Character Y coordinate
   *
   */
  fun getCharacterCoordsXY_1ED_D05F_EF2F(): Runnable {
    val x: Int = globals.word16_1138_D82C_CharacterXCoord
    val y: Int = globals.word16_1138_D82E_CharacterYCoord
    state.dx = x
    state.bx = y
    LOGGER.debug("getCharacterCoordsXY x:{} y:{}", state.dx, state.bx)
    return nearRet()
  }

  // intro and map fonts
  fun setFontToIntro_1ED_D068_EF38(): Runnable {
    globals.word16_1138_2518_FontRelated = 0xD096
    globals.word16_1138_47A0_FontRelated = 0xCEEC
    return nearRet()
  }

  // menu fonts related
  fun setFontToMenu_1ED_D075_EF45(): Runnable {
    globals.word16_1138_2518_FontRelated = 0xD12F
    globals.word16_1138_47A0_FontRelated = 0xCF6C
    return nearRet()
  }

  // book fonts related
  fun setFontToBook_1ED_D082_EF52(): Runnable {
    globals.word16_1138_2518_FontRelated = 0xD0FF
    globals.word16_1138_47A0_FontRelated = 0xCEEC
    return nearRet()
  }

  fun pushAll_1ED_E270_10140(): Runnable {
    LOGGER.debug("pushAll")
    stack.push(state.bx)
    stack.push(state.cx)
    stack.push(state.dx)
    stack.push(state.si)
    stack.push(state.di)
    stack.push(state.bp)
    val stackTop: Int = stack.peek(0)
    // XCHG AX <-> Stack[0x0C]
    val stackPeek: Int = stack.peek(0x0C)
    stack.poke(0x0C, state.ax)
    // In the original assembly code, AX seems modified but it's not the case as it's restored to its original value
    // later.
    stack.push(stackPeek)
    state.bp = stackTop
    return nearRet()
  }

  fun popAll_1ED_E283_10153(): Runnable {
    LOGGER.debug("popAll")
    // Called in most changes related to display like scene change, displaying map, clicking on map, clicking on
    // characters ...
    // XCHG AX <-> Stack[0x0C] (or 0x0E if done before the pop)
    val ax: Int = stack.pop()
    val stackPeek: Int = stack.peek(0x0C)
    stack.poke(0x0C, ax)
    state.ax = stackPeek
    // Regular pops
    state.bp = stack.pop()
    state.di = stack.pop()
    state.si = stack.pop()
    state.dx = stack.pop()
    state.cx = stack.pop()
    state.bx = stack.pop()
    return nearRet()
  }
}