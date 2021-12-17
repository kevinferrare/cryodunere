package cryodunere.vgadriver

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnCsSegment0x2538
import java.lang.Runnable
import org.slf4j.LoggerFactory
import spice86.emulator.memory.MemoryMap
import spice86.emulator.memory.MemoryUtils
import spice86.utils.ConvertUtils
import spice86.emulator.devices.video.InvalidColorIndexException
import spice86.emulator.devices.video.VgaCard
import spice86.emulator.errors.UnrecoverableException

// Method names contain _ to separate addresses.
class VgaDriverCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, programStartSegment: Int,
  machine: Machine) : JavaOverrideHelper(functionInformations, "vgaDriver", machine) {

  companion object {
    private val LOGGER = LoggerFactory.getLogger(VgaDriverCode::class.java)
    private const val MEMCPY_DS_TO_ES_FOR64000 = "memcpyDSToESFor64000"
    private const val IMAGE_UNDER_MOUSE_CURSOR_START = 0xFA00
  }

  val baseSegment: Int
  private val globals: ExtraGlobalsOnCsSegment0x2538

  init {
    baseSegment = programStartSegment + 0x234B
    globals = ExtraGlobalsOnCsSegment0x2538(machine)
    defineFunction(baseSegment, 0x100, "setMode")
    defineFunction(baseSegment, 0x103, "getInfoInAxCxBp") { getInfoInAxCxBp_2538_103_25483() }
    defineFunction(baseSegment, 0x109, "drawMouseCursor")
    defineFunction(baseSegment, 0x10C, "restoreImageUnderMouseCursor") { restoreImageUnderMouseCursor_2538_10C_2548C() }
    defineFunction(baseSegment, 0x10F, "blit")
    defineFunction(baseSegment, 0x118, "fillWithZeroFor64000AtES") { fillWithZeroFor64000AtES_2538_118_25498() }
    defineFunction(baseSegment, 0x121, MEMCPY_DS_TO_ES_FOR64000) { memcpyDSToESFor64000_2538_121_254A1() }
    defineFunction(baseSegment, 0x124, "copyRectangle")
    defineFunction(baseSegment, 0x12A,
      "copySquareOfPixelsSiIsSourceSegment") { copySquareOfPixelsSiIsSourceSegment_2538_12A_254AA() }
    defineFunction(baseSegment, 0x12D, MEMCPY_DS_TO_ES_FOR64000) { memcpyDSToESFor64000_2538_12D_254AD() }
    defineFunction(baseSegment, 0x130, "copySquareOfPixels") { copySquareOfPixels_2538_130_254B0() }
    defineFunction(baseSegment, 0x133, "copyframebufferExplodeAndCenter")
    defineFunction(baseSegment, 0x13C, "noOp") { noOp_2538_13C_254BC() }
    defineFunction(baseSegment, 0x13F, "setPixel")
    defineFunction(baseSegment, 0x163,
      "updateVgaOffset01A3FromLineNumberAsAx") { updateVgaOffset01A3FromLineNumberAsAx_2538_163_254E3() }
    defineFunction(baseSegment, 0x16C, "generateTextureOutBP") { generateTextureOutBP_2538_16C_254EC() }
    defineFunction(baseSegment, 0x17B, "copyPalette2toPalette1")
    defineFunction(baseSegment, 0x9B8, "waitForRetrace") { waitForRetrace_2538_9B8_25D38() }
    defineFunction(baseSegment, 0xA21, "setBxCxPaletteRelated") { setBxCxPaletteRelated_2538_A21_25DA1() }
    defineFunction(baseSegment, 0xA58, "copyCsRamB5FToB2F") { copyCsRamB5FToB2F_2538_A58_25DD8() }
    defineFunction(baseSegment, 0xB68, "loadPalette") { loadPaletteInVgaDac_2538_B68_25EE8() }
    defineFunction(baseSegment, 0xC10, "setDiFromXYCordsDxBx") { setDiFromXYCordsDxBx_2538_C10_25F90() }
    defineFunction(baseSegment, 0x1B7C, MEMCPY_DS_TO_ES_FOR64000) { memcpyDSToESFor64000_2538_1B7C_26EFC() }
    defineFunction(baseSegment, 0x1B8E, "moveSquareOfPixels") { moveSquareOfPixels_2538_1B8E_26F0E() }
    // called in globe, without it globe rotation works but stutters when clicking
    defineFunction(baseSegment, 0x1D07, "unknownGlobeRelated")
    defineFunction(baseSegment, 0x1D5A, "unknownGlobeInitRelated") { unknownGlobeInitRelated_2538_1D5A_270DA() }
    defineFunction(baseSegment, 0x2025, "unknownMapRelated")
    defineFunction(baseSegment, 0x2343, "copyMapBlock") { copyMapBlock_2538_2343_276C3() }
    defineFunction(baseSegment, 0x253D,
      "retraceRelatedCalledOnEnterGlobe") { retraceRelatedCalledOnEnterGlobe_2538_253D_278BD() }
    defineFunction(baseSegment, 0x2572, "waitForRetraceInTransitions") { waitForRetraceInTransitions_2538_2572_278F2() }
    defineFunction(baseSegment, 0x261D,
      "waitForRetraceDuringIntroVideo") { waitForRetraceDuringIntroVideo_2538_261D_2799D() }
    defineFunction(baseSegment, 0x32C1, "generateMenuTransitionFrame")
  }

  // 25D59
  fun getInfoInAxCxBp_2538_103_25483(): Runnable {
    // 25D59
    LOGGER.debug("getInfoInAxCxBp")
    state.ax = MemoryMap.GRAPHIC_VIDEO_MEMORY_SEGMENT
    state.cx = IMAGE_UNDER_MOUSE_CURSOR_START
    state.bp = 0
    return farRet()
  }

  fun unknown_2538_109_25489_notyet(): Runnable {
    // 26C08, 80 lines in ghidra
    return farRet()
  }

  /**
   * Restores image under mouse cursor. No input apart from globals and no output.
   */
  fun restoreImageUnderMouseCursor_2538_10C_2548C(): Runnable {
    // 26CC0
    val mouseCursorAddressInVram: Int = globals.word16_2538_018A_MouseCursorAddressInVram
    val columns: Int = globals.word16_2538_018C_ColumnsOfMouseCursorCount
    val lines: Int = globals.word16_2538_018E_LinesOfMouseCursorCount
    LOGGER.debug(
      "restoreImageUnderMouseCursor mouseCursorAddressInVram:{},columns:{},lines:{}",
      mouseCursorAddressInVram, columns, lines)
    val sourceAddress: Int =
      MemoryUtils.toPhysicalAddress(MemoryMap.GRAPHIC_VIDEO_MEMORY_SEGMENT, IMAGE_UNDER_MOUSE_CURSOR_START)
    val destinationAddress: Int =
      MemoryUtils.toPhysicalAddress(MemoryMap.GRAPHIC_VIDEO_MEMORY_SEGMENT, mouseCursorAddressInVram)
    for (i: Int in 0 until lines) {
      memory.memCopy(sourceAddress + columns * i, destinationAddress + 320 * i, columns)
    }
    return farRet()
  }

  fun unknown_2538_10F_2548F(): Runnable {
    // 262DB, 600 lines in ghidra
    return farRet()
  }

  fun unknown_2538_112_25492(): Runnable {
    // 267D2, 1200 lines in ghidra
    return farRet()
  }

  fun unknown_2538_115_25495(): Runnable {
    // 26F75, 88 lines in ghidra
    return farRet()
  }

  fun fillWithZeroFor64000AtES_2538_118_25498(): Runnable {
    // 26D77
    val address: Int = MemoryUtils.toPhysicalAddress(state.es, 0)
    LOGGER.debug("fillWithZeroFor64000AtES address:{}", address)
    memory.memset(address, 0, 64000)
    return farRet()
  }

  fun unknown_2538_11B_2549B(): Runnable {
    // 26CF9, 70 lines in ghidra, calls unknown_2538_11E_2549E with AX=0
    return farRet()
  }

  fun unknown_2538_11E_2549E(): Runnable {
    // 26CFB, 70 lines in ghidra
    return farRet()
  }

  fun memcpyDSToESFor64000_2538_121_254A1(): Runnable {
    return memcpyDSToESFor64000_2538_1B7C_26EFC()
  }

  fun copySquareOfPixelsSiIsSourceSegment_2538_12A_254AA(): Runnable {
    // 26F0C
    state.ds = state.si
    return moveSquareOfPixels_2538_1B8E_26F0E()
  }

  fun memcpyDSToESFor64000_2538_12D_254AD(): Runnable {
    // 26EFC, seems used when moving rooms
    return memcpyDSToESFor64000_2538_1B7C_26EFC()
  }

  fun copySquareOfPixels_2538_130_254B0(): Runnable {
    // 26F0E
    return moveSquareOfPixels_2538_1B8E_26F0E()
  }

  fun noOp_2538_13C_254BC(): Runnable {
    return farRet()
  }

  fun unknown_2538_148_254C8(): Runnable {
    // 27087, 117 lines in ghidra
    return farRet()
  }

  fun unknown_2538_14B_254CB(): Runnable {
    // 54 lines in ghidra, calls out
    return farRet()
  }

  // line number in AX, offset address in 01A3
  fun updateVgaOffset01A3FromLineNumberAsAx_2538_163_254E3(): Runnable {
    // 25F86
    val lineNumber: Int = state.ax
    globals.word16_2538_01A3_VgaOffset = lineNumber * 320
    LOGGER.debug("updateVgaOffset01A3FromLineNumberAsAx lineNumber:{},vgaOffset01A3:{}", lineNumber,
      globals.word16_2538_01A3_VgaOffset)
    return farRet()
  }

  fun unknown_2538_169_254E9(): Runnable {
    // 26105, 70 lines in ghidra
    return farRet()
  }

  /**
   * Inputs:
   *
   *  * ES: Segment with the VRAM buffer (starting a 0?)
   *  * DX / BX: line start x/y coords (for setDiFromXYCordsDxBx_2538_C10_25F90)
   *  * Direction flag: whether to increment or decrement when iterating pixels
   *  * CX: number of pixels to generate
   *  * DI: color increment
   *  * AX: inital color
   *  * BP: initial noise
   *  * SI: value to xor to noise
   *
   * Output:
   *
   *  * BP with last value of noise
   *
   */
  fun generateTextureOutBP_2538_16C_254EC(): Runnable {
    // 28D69, 30 lines in ghidra
    val destinationBaseAddress: Int = MemoryUtils.toPhysicalAddress(state.es, 0)
    var initialColor: Int = state.ax
    val colorIncrement: Int = state.di
    var xorNoise: Int = state.bp
    val xorNoisePattern: Int = state.si
    val length: Int = state.cx
    setDiFromXYCordsDxBx_2538_C10_25F90()
    val destinationOffsetAddress: Int = state.di
    val direction: Int = if (state.directionFlag) -1 else 1
    if (LOGGER.isDebugEnabled) {
      LOGGER.debug("generateFloors xy:{},{} destinationBaseAddress:{},destinationOffsetAddress:{},"
          + "colorIncrement:{},initialColor:{},xorNoise:{},xorNoisePattern:{},length:{},direction:{}",
        state.dx, state.bx,
        destinationBaseAddress, destinationOffsetAddress, colorIncrement, initialColor, xorNoise,
        xorNoisePattern, length, direction)
    }
    val destinationAddress: Int = destinationBaseAddress + destinationOffsetAddress
    for (i in 0 until length) {
      val shouldXor: Boolean = xorNoise and 1 == 1
      xorNoise = xorNoise ushr 1
      if (shouldXor) {
        xorNoise = xorNoise xor xorNoisePattern
      }
      val valueToStore: Int = ConvertUtils.uint8((xorNoise and 0x3) - 1) + ConvertUtils.uint8(initialColor ushr 8)
      memory.setUint8(destinationAddress + i * direction, valueToStore)
      initialColor += colorIncrement
    }

    // Needed for next calls
    state.bp = xorNoise
    return farRet()
  }

  /**
   * Wait for retrace.<br></br>
   * Output: carry flag = true
   */
  fun waitForRetrace_2538_9B8_25D38(): Runnable {
    // no jump, 28 lines in ghidra, part of the function is not executed in the logs and DX is always 3DA.
    // Wait for retrace.
    val vgaCard: VgaCard = machine.vgaCard
    while (!vgaCard.tickRetrace());
    state.carryFlag = true
    return nearRet()
  }

  fun setBxCxPaletteRelated_2538_A21_25DA1(): Runnable {
    // No jump
    state.bx = state.bx / 3
    val unknownValue: Int = state.cx
    if (unknownValue < 0x300) {
      state.cx = unknownValue / 3
      return nearRet()
    }
    // crashes when executed, but never reached...
    state.cx = 0x100
    return nearRet()
  }

  /**
   * Called before switch to video scene. Does not seem to have any effect:<br></br>
   * - Setting the source / destination to 0 does not change anything so far in the game<br></br>
   * - Removing the body of the function does not have any noticeable effect<br></br>
   * All values in the copied block seem to be below 64, looks like a 6bit color
   */
  fun copyCsRamB5FToB2F_2538_A58_25DD8(): Runnable {
    LOGGER.debug("copyCsRamB5FToB2F")
    // No jump
    val sourceAddress: Int = MemoryUtils.toPhysicalAddress(state.cs, 0x5BF)
    val destinationAddress: Int = MemoryUtils.toPhysicalAddress(state.cs, 0x2BF)
    // 768 times (3 blocks of 256)
    memory.memCopy(sourceAddress, destinationAddress, 768)
    return nearRet()
  }

  /**
   * Inputs:
   *
   *  * ES:DX: Base address of palette
   *  * PaletteLoadMode01BD: how to read the data
   *  * BL: index in vga DAC
   *  * CX: number of rgb data to load
   *
   */
  fun loadPaletteInVgaDac_2538_B68_25EE8(): Runnable {
    // No jump, 49 lines in ghidra
    return try {
      val vgaCard: VgaCard = machine.vgaCard
      val baseAddress: Int = MemoryUtils.toPhysicalAddress(state.es, state.dx)
      val writeIndex: Int = state.bl
      val numberOfColors: Int = state.cx
      val loadMode: Int = globals.byte8_2538_01BD_PaletteLoadMode
      LOGGER.debug("loadPaletteInVgaDac, baseAddress:{}, writeIndex:{}, loadMode:{}, numberOfColors:{}", baseAddress,
        writeIndex, loadMode, numberOfColors)
      vgaCard.setVgaWriteIndex(writeIndex)
      if (loadMode == 0) {
        for (i in 0 until numberOfColors * 3) {
          val value: Int = memory.getUint8(baseAddress + i)
          vgaCard.rgbDataWrite(value)
        }
      } else {
        // Untested ... 25f29 in ghidra, 2538:BA9 in dosbox, probably wrong
        failAsUntested("This palette code path was converted to java but never executed...")
        var i: Int = 0
        while (i < numberOfColors * 3) {
          val r: Int = memory.getUint8(baseAddress + i) and 0x3F
          val g: Int = memory.getUint8(baseAddress + i + 1) and 0x3F
          val b: Int = memory.getUint8(baseAddress + i + 2) and 0x3F
          val value: Int = (r * 5 + g * 9 + b * 2) ushr 4
          vgaCard.rgbDataWrite(value)
          vgaCard.rgbDataWrite(value)
          vgaCard.rgbDataWrite(value)
          i += 3
        }
      }
      nearRet()
    } catch (e: InvalidColorIndexException) {
      throw UnrecoverableException(e)
    }
  }

  /**
   * Converts x/y coordinates to a linear index to access vram or video buffers. Lines are hardcoded to 320 pixels.
   * Inputs:
   *
   *  * DX / BX: x/y coordinates
   *
   * Output:
   *
   *  * DI contains the converted linear index
   *
   */
  private fun setDiFromXYCordsDxBx_2538_C10_25F90(): Runnable {
    val x: Int = state.dx
    var y: Int = state.bx
    val offset: Int = globals.word16_2538_01A3_VgaOffset
    if (y >= 200) {
      y = 199
    }
    val res: Int = 320 * y + x + offset
    state.di = res
    LOGGER.debug("setDiFromXYCordsDxBx x:{},y:{},offset:{},res:{}", x, y, offset, res)
    return nearRet()
  }

  fun unknown_2538_1ADC_26E5C(): Runnable {
    LOGGER.debug("unknown")
    // No jump, 125 lines in ghidra
    return nearRet()
  }

  fun memcpyDSToESFor64000_2538_1B7C_26EFC(): Runnable {
    // No jump, 22 lines in ghidra
    val sourceAddress: Int = MemoryUtils.toPhysicalAddress(state.ds, 0)
    val destinationAddress: Int = MemoryUtils.toPhysicalAddress(state.es, 0)
    LOGGER.debug("memcpyDSToESFor64000 sourceAddress:{},destinationAddress:{}", sourceAddress, destinationAddress)
    memory.memCopy(sourceAddress, destinationAddress, 64000)
    return farRet()
  }

  /**
   * When disabled no dialogue, and popups are not removed from screen.<br></br>
   * Inputs:
   *
   *  * DX / BX: line start x/y coords (for setDiFromXYCordsDxBx_2538_C10_25F90)
   *  * AX: columnCount
   *  * BP: rowCount
   *  * DS: source segment
   *  * ES: destination segment
   *
   */
  fun moveSquareOfPixels_2538_1B8E_26F0E(): Runnable {
    // No jump, 30 instructions 67 lines in ghidra
    // warning: we dont set registers at the end but no idea if their values are used or not.
    setDiFromXYCordsDxBx_2538_C10_25F90()
    val baseOffsetDi: Int = state.di
    val sourceAddress: Int = MemoryUtils.toPhysicalAddress(state.ds, baseOffsetDi)
    val destinationAddress: Int = MemoryUtils.toPhysicalAddress(state.es, baseOffsetDi)
    val rowCount: Int = state.bp
    val columnCount: Int = state.ax
    LOGGER.debug(
      "moveSquareOfPixels sourceBuffer:{}, destinationBuffer:{},startX:{},startY:{},columnCount:{},rowCount:{}",
      state.ds, state.es, state.dx, state.bx,
      columnCount, rowCount)
    for (y: Int in 0 until columnCount) {
      for (x: Int in 0 until rowCount) {
        val value: Int = memory.getUint8(sourceAddress + y * 320 + x)
        memory.setUint8(destinationAddress + y * 320 + x, value)
      }
    }
    return farRet()
  }

  /**
   * Inputs:
   *
   *  * DI: unknown
   *  * SS: sets to DS
   *
   * Outputs:
   *
   *  * DS: points to SS
   *  * Carry flag set
   *
   */
  fun unknownGlobeInitRelated_2538_1D5A_270DA(): Runnable {
    // no jump
    globals.word16_2538_1CA6_UnknownGlobeRelated = state.di
    globals.word16_2538_1EA6_UnknownGlobeRelated = 0xFEDD
    globals.word16_2538_1F29_UnknownGlobeRelated = 0xFE5A
    globals.word16_2538_1CAE_UnknownGlobeRelated = 0x6360 - 1
    globals.word16_2538_1CB0_UnknownGlobeRelated = 0x6360
    globals.word16_2538_1CB2_UnknownGlobeRelated = 0x6360
    state.ds = state.ss
    state.carryFlag = true
    return farRet()
  }

  /**
   * Inputs:
   *
   *  * CX: size of a block to copy
   *  * DS:SI: source for copy
   *  * ES:DI: destination for copy
   *
   * Outputs:
   *
   *  * SI: points to next block
   *  * DI: points to next block
   *
   */
  fun copyMapBlock_2538_2343_276C3(): Runnable {
    // 37 lines in ghidra
    val blockSize: Int = state.cx
    val baseSourceAddress: Int = MemoryUtils.toPhysicalAddress(state.ds, state.si)
    val baseDestinationAddress: Int = MemoryUtils.toPhysicalAddress(state.es, state.di)
    LOGGER.debug("unknownMapCopyMapBlock blockSize={}, baseSourceAddress:{},baseDestinationAddress:{}", blockSize,
      baseSourceAddress, baseDestinationAddress)
    for (i: Int in 0..3) {
      for (j: Int in 0 until blockSize) {
        var value: Int = memory.getUint8(baseSourceAddress + j + 400 * i)
        value = (value ushr 4 and 0xF) + 0x10
        memory.setUint8(baseDestinationAddress + j + 320 * i, value)
      }
    }
    // point to next block
    state.si = state.si + 4 * 400
    state.di = state.di + 4 * 320
    return nearRet()
  }

  fun retraceRelatedCalledOnEnterGlobe_2538_253D_278BD(): Runnable {
    return nearRet()
  }

  fun waitForRetraceInTransitions_2538_2572_278F2(): Runnable {
    // Calls part of 0x2538_253D_278BD which we dont need
    return nearRet()
  }

  fun waitForRetraceDuringIntroVideo_2538_261D_2799D(): Runnable {
    // Calls 0x2538_2572_278F2 when 01A1 is not 0 which we dont need
    return nearRet()
  }
}