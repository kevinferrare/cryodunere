package cryodunere.vgadriver;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spice86.emulator.devices.video.InvalidColorIndexException;
import spice86.emulator.devices.video.VgaCard;
import spice86.emulator.errors.UnrecoverableException;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.MemoryMap;
import spice86.emulator.memory.MemoryUtils;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;
import spice86.utils.ConvertUtils;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class VgaDriverCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(VgaDriverCode.class);
  private static final String MEMCPY_DS_TO_ES_FOR64000 = "memcpyDSToESFor64000";
  private static final int IMAGE_UNDER_MOUSE_CURSOR_START = 0xFA00;

  private int baseSegment;
  private VgaDriverGlobals globals;

  public VgaDriverCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int programStartSegment,
      Machine machine) {
    super(functionInformations, "vgaDriver", machine);
    baseSegment = programStartSegment + 0x234B;
    globals = new VgaDriverGlobals(machine.getMemory(), baseSegment * 0x10);
    defineFunction(baseSegment, 0x103, "unknownInitAxCxBp", this::unknownInitAxCxBp_0x2538_0x103_0x25483);
    defineFunction(baseSegment, 0x10C, "restoreImageUnderMouseCursor",
        this::restoreImageUnderMouseCursor_0x2538_0x10C_0x2548C);
    defineFunction(baseSegment, 0x118, "fillWithZeroFor64000AtES", this::fillWithZeroFor64000AtES_0x2538_0x118_0x25498);
    defineFunction(baseSegment, 0x121, MEMCPY_DS_TO_ES_FOR64000, this::memcpyDSToESFor64000_0x2538_0x121_0x254A1);
    defineFunction(baseSegment, 0x12A, "moveSquareOfPixelsSiIsSourceSegment",
        this::moveSquareOfPixelsSiIsSourceSegment_0x2538_0x12A_0x254AA);
    defineFunction(baseSegment, 0x12D, MEMCPY_DS_TO_ES_FOR64000, this::memcpyDSToESFor64000_0x2538_0x12D_0x254AD);
    defineFunction(baseSegment, 0x130, "moveSquareOfPixels", this::moveSquareOfPixels_0x2538_0x130_0x254B0);
    defineFunction(baseSegment, 0x13C, "noOp", this::noOp_0x2538_0x13C_0x254BC);
    defineFunction(baseSegment, 0x163, "updateVgaOffset01A3FromLineNumberAsAx",
        this::updateVgaOffset01A3FromLineNumberAsAx_0x2538_0x163_0x254E3);
    defineFunction(baseSegment, 0x16C, "generateTextureOutBP", this::generateTextureOutBP_0x2538_0x16C_0x254EC);
    defineFunction(baseSegment, 0x9B8, "waitForRetrace", this::waitForRetrace_0x2538_0x9B8_0x25D38);
    defineFunction(baseSegment, 0xA21, "setBxCxPaletteRelated", this::setBxCxPaletteRelated_0x2538_0xA21_0x25DA1);
    defineFunction(baseSegment, 0xA58, "copyCsRamB5FToB2F", this::copyCsRamB5FToB2F_0x2538_0xA58_0x25DD8);
    defineFunction(baseSegment, 0xB68, "loadPalette", this::loadPaletteInVgaDac_0x2538_0xB68_0x25EE8);
    defineFunction(baseSegment, 0xC10, "setDiFromXYCordsDxBx", this::setDiFromXYCordsDxBx_0x2538_0xC10_0x25F90);
    defineFunction(baseSegment, 0x1B7C, MEMCPY_DS_TO_ES_FOR64000, this::memcpyDSToESFor64000_0x2538_0x1B7C_0x26EFC);
    defineFunction(baseSegment, 0x1B8E, "moveSquareOfPixels", this::moveSquareOfPixels_0x2538_0x1B8E_0x26F0E);
    // called in globe, without it globe rotation works but stutters when clicking
    defineFunction(baseSegment, 0x1D07, "unknownGlobeRelated");
    defineFunction(baseSegment, 0x1D5A, "unknownGlobeInitRelated", this::unknownGlobeInitRelated_0x2538_0x1D5A_0x270DA);
    defineFunction(baseSegment, 0x2025, "unknownMapRelated");
    defineFunction(baseSegment, 0x2343, "copyMapBlock", this::copyMapBlock_0x2538_0x2343_0x276C3);
    defineFunction(baseSegment, 0x253D, "retraceRelatedCalledOnEnterGlobe",
        this::retraceRelatedCalledOnEnterGlobe_0x2538_0x253D_0x278BD);
    defineFunction(baseSegment, 0x2572, "waitForRetraceInTransitions",
        this::waitForRetraceInTransitions_0x2538_0x2572_0x278F2);
    defineFunction(baseSegment, 0x261D, "waitForRetraceDuringIntroVideo",
        this::waitForRetraceDuringIntroVideo_0x2538_0x261D_0x2799D);
    defineFunction(baseSegment, 0x32C1, "generateMenuTransitionFrame");
  }

  public int getBaseSegment() {
    return baseSegment;
  }

  public Runnable unknownInitAxCxBp_0x2538_0x103_0x25483() {
    // 25D59
    LOGGER.debug("unknownInitAxCxBp");

    state.setAX(MemoryMap.GRAPHIC_VIDEO_MEMORY_SEGMENT);
    state.setCX(IMAGE_UNDER_MOUSE_CURSOR_START);
    state.setBP(0);
    return farRet();
  }

  public Runnable unknown_0x2538_0x109_0x25489_notyet() {
    // 26C08, 80 lines in ghidra
    return farRet();
  }

  /**
   * Restores image under mouse cursor. No input apart from globals and no output.
   */
  public Runnable restoreImageUnderMouseCursor_0x2538_0x10C_0x2548C() {
    // 26CC0
    int mouseCursorAddressInVram = this.globals.getMouseCursorAddressInVram018A();
    int columns = this.globals.getColumnsOfMouseCursorCount018C();
    int lines = this.globals.getLinesOfMouseCursorCount018E();
    LOGGER.debug(
        "restoreImageUnderMouseCursor mouseCursorAddressInVram:{},columns:{},lines:{}",
        mouseCursorAddressInVram, columns, lines);
    int sourceAddress =
        MemoryUtils.toPhysicalAddress(MemoryMap.GRAPHIC_VIDEO_MEMORY_SEGMENT, IMAGE_UNDER_MOUSE_CURSOR_START);
    int destinationAddress =
        MemoryUtils.toPhysicalAddress(MemoryMap.GRAPHIC_VIDEO_MEMORY_SEGMENT, mouseCursorAddressInVram);
    for (int i = 0; i < lines; i++) {
      memory.memCopy(sourceAddress + columns * i, destinationAddress + 320 * i, columns);
    }
    return farRet();
  }

  public Runnable unknown_0x2538_0x10F_0x2548F() {
    // 262DB, 600 lines in ghidra
    return farRet();
  }

  public Runnable unknown_0x2538_0x112_0x25492() {
    // 267D2, 1200 lines in ghidra
    return farRet();
  }

  public Runnable unknown_0x2538_0x115_0x25495() {
    // 26F75, 88 lines in ghidra
    return farRet();
  }

  public Runnable fillWithZeroFor64000AtES_0x2538_0x118_0x25498() {
    // 26D77
    int address = MemoryUtils.toPhysicalAddress(state.getES(), 0);
    LOGGER.debug("fillWithZeroFor64000AtES address:{}", address);
    memory.memset(address, 0, 64000);
    return farRet();
  }

  public Runnable unknown_0x2538_0x11B_0x2549B() {
    // 26CF9, 70 lines in ghidra, calls unknown_0x2538_0x11E_0x2549E with AX=0
    return farRet();
  }

  public Runnable unknown_0x2538_0x11E_0x2549E() {
    // 26CFB, 70 lines in ghidra
    return farRet();
  }

  public Runnable memcpyDSToESFor64000_0x2538_0x121_0x254A1() {
    return memcpyDSToESFor64000_0x2538_0x1B7C_0x26EFC();
  }

  public Runnable moveSquareOfPixelsSiIsSourceSegment_0x2538_0x12A_0x254AA() {
    // 26F0C
    state.setDS(state.getSI());
    return moveSquareOfPixels_0x2538_0x1B8E_0x26F0E();
  }

  public Runnable memcpyDSToESFor64000_0x2538_0x12D_0x254AD() {
    // 26EFC, seems used when moving rooms
    return memcpyDSToESFor64000_0x2538_0x1B7C_0x26EFC();
  }

  public Runnable moveSquareOfPixels_0x2538_0x130_0x254B0() {
    // 26F0E
    return moveSquareOfPixels_0x2538_0x1B8E_0x26F0E();
  }

  public Runnable noOp_0x2538_0x13C_0x254BC() {
    return farRet();
  }

  public Runnable unknown_0x2538_0x148_0x254C8() {
    // 27087, 117 lines in ghidra
    return farRet();
  }

  public Runnable unknown_0x2538_0x14B_0x254CB() {
    // 54 lines in ghidra, calls out
    return farRet();
  }

  // line number in AX, offset address in 01A3
  public Runnable updateVgaOffset01A3FromLineNumberAsAx_0x2538_0x163_0x254E3() {
    // 25F86
    int lineNumber = state.getAX();
    this.globals.setVgaOffset01A3(lineNumber * 320);
    LOGGER.debug("updateVgaOffset01A3FromLineNumberAsAx lineNumber:{},vgaOffset01A3:{}", lineNumber,
        globals.getVgaOffset01A3());
    return farRet();
  }

  public Runnable unknown_0x2538_0x169_0x254E9() {
    // 26105, 70 lines in ghidra
    return farRet();
  }

  // when disabled floors disappear in some rooms.
  /**
   * Inputs:
   * <ul>
   * <li>ES: Segment with the VRAM buffer (starting a 0?)</li>
   * <li>DX / BX: line start x/y coords (for setDiFromXYCordsDxBx_0x2538_0xC10_0x25F90)</li>
   * <li>Direction flag: whether to increment or decrement when iterating pixels</li>
   * <li>CX: number of pixels to generate</li>
   * <li>DI: color increment</li>
   * <li>AX: inital color</li>
   * <li>BP: initial noise</li>
   * <li>SI: value to xor to noise</li>
   * </ul>
   * Output:
   * <ul>
   * <li>BP with last value of noise</li>
   * </ul>
   */
  public Runnable generateTextureOutBP_0x2538_0x16C_0x254EC() {
    // 28D69, 30 lines in ghidra
    int destinationBaseAddress = MemoryUtils.toPhysicalAddress(state.getES(), 0);
    int initialColor = state.getAX();
    int colorIncrement = state.getDI();
    int xorNoise = state.getBP();
    int xorNoisePattern = state.getSI();
    int length = state.getCX();
    setDiFromXYCordsDxBx_0x2538_0xC10_0x25F90();
    int destinationOffsetAddress = state.getDI();
    int direction = state.getDirectionFlag() ? -1 : 1;
    if (LOGGER.isDebugEnabled()) {
      LOGGER.debug(
          "generateFloors xy:{},{} destinationBaseAddress:{},destinationOffsetAddress:{},"
              + "colorIncrement:{},initialColor:{},xorNoise:{},xorNoisePattern:{},length:{},direction:{}",
          state.getDX(), state.getBX(),
          destinationBaseAddress, destinationOffsetAddress, colorIncrement, initialColor, xorNoise,
          xorNoisePattern, length, direction);
    }
    int destinationAddress = destinationBaseAddress + destinationOffsetAddress;
    for (int i = 0; i < length; i++) {
      boolean shouldXor = (xorNoise & 1) == 1;
      xorNoise >>>= 1;
      if (shouldXor) {
        xorNoise ^= xorNoisePattern;
      }
      int valueToStore =
          ConvertUtils.uint8((xorNoise & 0x3) - 1) + ConvertUtils.uint8(initialColor >>> 8);
      memory.setUint8(destinationAddress + i * direction, valueToStore);
      initialColor += colorIncrement;
    }

    // Needed for next calls
    state.setBP(xorNoise);

    return farRet();
  }

  /**
   * Wait for retrace.<br/>
   * Output: carry flag = true
   */
  public Runnable waitForRetrace_0x2538_0x9B8_0x25D38() {
    // no jump, 28 lines in ghidra, part of the function is not executed in the logs and DX is always 3DA.
    // Wait for retrace.
    VgaCard vgaCard = machine.getVgaCard();
    while (!vgaCard.tickRetrace())
      ;
    state.setCarryFlag(true);
    return nearRet();
  }

  public Runnable setBxCxPaletteRelated_0x2538_0xA21_0x25DA1() {
    // No jump
    state.setBX(state.getBX() / 3);
    int unknownValue = state.getCX();
    if (unknownValue < 0x300) {
      state.setCX(unknownValue / 3);
      return nearRet();
    }
    // crashes when executed, but never reached...
    state.setCX(0x100);
    return nearRet();
  }

  /**
   * Called before switch to video scene. Does not seem to have any effect:<br/>
   * - Setting the source / destination to 0 does not change anything so far in the game<br/>
   * - Removing the body of the function does not have any noticeable effect<br/>
   * All values in the copied block seem to be below 64, looks like a 6bit color
   */
  public Runnable copyCsRamB5FToB2F_0x2538_0xA58_0x25DD8() {
    LOGGER.debug("copyCsRamB5FToB2F");
    // No jump
    int sourceAddress = MemoryUtils.toPhysicalAddress(state.getCS(), 0x5BF);
    int destinationAddress = MemoryUtils.toPhysicalAddress(state.getCS(), 0x2BF);
    // 768 times (3 blocks of 256)
    memory.memCopy(sourceAddress, destinationAddress, 768);
    return nearRet();
  }

  /**
   * Inputs:
   * <ul>
   * <li>ES:DX: Base address of palette</li>
   * <li>PaletteLoadMode01BD: how to read the data</li>
   * <li>BL: index in vga DAC</li>
   * <li>CX: number of rgb data to load</li>
   * </ul>
   */
  public Runnable loadPaletteInVgaDac_0x2538_0xB68_0x25EE8() {
    // No jump, 49 lines in ghidra
    try {
      VgaCard vgaCard = machine.getVgaCard();
      int baseAddress = MemoryUtils.toPhysicalAddress(state.getES(), state.getDX());
      int writeIndex = state.getBL();
      int numberOfColors = state.getCX();
      int loadMode = globals.getPaletteLoadMode01BD();
      LOGGER.debug("loadPaletteInVgaDac, baseAddress:{}, writeIndex:{}, loadMode:{}, numberOfColors:{}", baseAddress,
          writeIndex, loadMode, numberOfColors);
      vgaCard.setVgaWriteIndex(writeIndex);
      if (loadMode == 0) {
        for (int i = 0; i < numberOfColors * 3; i++) {
          int value = memory.getUint8(baseAddress + i);
          vgaCard.rgbDataWrite(value);
        }
      } else {
        // Untested ... 25f29 in ghidra, 2538:BA9 in dosbox, probably wrong
        failAsUntested("This palette code path was converted to java but never executed...");
        for (int i = 0; i < numberOfColors * 3; i += 3) {
          int r = memory.getUint8(baseAddress + i) & 0x3F;
          int g = memory.getUint8(baseAddress + i + 1) & 0x3F;
          int b = memory.getUint8(baseAddress + i + 2) & 0x3F;
          int value = (r * 5 + g * 9 + b * 2) >>> 4;
          vgaCard.rgbDataWrite(value);
          vgaCard.rgbDataWrite(value);
          vgaCard.rgbDataWrite(value);
        }
      }
      return nearRet();
    } catch (InvalidColorIndexException e) {
      throw new UnrecoverableException(e);
    }
  }

  /**
   * Converts x/y coordinates to a linear index to access vram or video buffers. Lines are hardcoded to 320 pixels.
   * Inputs:
   * <ul>
   * <li>DX / BX: x/y coordinates</li>
   * </ul>
   * Output:
   * <ul>
   * <li>DI contains the converted linear index</li>
   * </ul>
   */
  private Runnable setDiFromXYCordsDxBx_0x2538_0xC10_0x25F90() {
    int x = state.getDX();
    int y = state.getBX();
    int offset = globals.getVgaOffset01A3();
    if (y >= 200) {
      y = 199;
    }
    int res = 320 * y + x + offset;
    state.setDI(res);
    LOGGER.debug("setDiFromXYCordsDxBx x:{},y:{},offset:{},res:{}", x, y, offset, res);
    return nearRet();
  }

  public Runnable unknown_0x2538_0x1ADC_0x26E5C() {
    LOGGER.debug("unknown");
    // No jump, 125 lines in ghidra

    return nearRet();
  }

  public Runnable memcpyDSToESFor64000_0x2538_0x1B7C_0x26EFC() {
    // No jump, 22 lines in ghidra
    int sourceAddress = MemoryUtils.toPhysicalAddress(state.getDS(), 0);
    int destinationAddress = MemoryUtils.toPhysicalAddress(state.getES(), 0);
    LOGGER.debug("memcpyDSToESFor64000 sourceAddress:{},destinationAddress:{}", sourceAddress, destinationAddress);
    memory.memCopy(sourceAddress, destinationAddress, 64000);
    return farRet();
  }

  /**
   * When disabled no dialogue, and popups are not removed from screen.<br/>
   * Inputs:
   * <ul>
   * <li>DX / BX: line start x/y coords (for setDiFromXYCordsDxBx_0x2538_0xC10_0x25F90)</li>
   * <li>AX: columnCount</li>
   * <li>BP: rowCount</li>
   * <li>DS: source segment</li>
   * <li>ES: destination segment</li>
   * </ul>
   */
  public Runnable moveSquareOfPixels_0x2538_0x1B8E_0x26F0E() {
    // No jump, 30 instructions 67 lines in ghidra
    // warning: we dont set registers at the end but no idea if their values are used or not.
    setDiFromXYCordsDxBx_0x2538_0xC10_0x25F90();
    int baseOffsetDi = state.getDI();
    int sourceAddress = MemoryUtils.toPhysicalAddress(state.getDS(), baseOffsetDi);
    int destinationAddress = MemoryUtils.toPhysicalAddress(state.getES(), baseOffsetDi);
    int rowCount = state.getBP();
    int columnCount = state.getAX();
    LOGGER.debug(
        "moveSquareOfPixels sourceBuffer:{}, destinationBuffer:{},startX:{},startY:{},columnCount:{},rowCount:{}",
        state.getDS(), state.getES(), state.getDX(), state.getBX(),
        columnCount, rowCount);
    for (int y = 0; y < columnCount; y++) {
      for (int x = 0; x < rowCount; x++) {
        int value = memory.getUint8(sourceAddress + y * 320 + x);
        memory.setUint8(destinationAddress + y * 320 + x, value);
      }
    }
    return farRet();
  }

  /**
   * Inputs:
   * <ul>
   * <li>DI: unknown</li>
   * <li>SS: sets to DS</li>
   * </ul>
   * Outputs:
   * <ul>
   * <li>DS: points to SS</li>
   * <li>Carry flag set</li>
   * </ul>
   */
  public Runnable unknownGlobeInitRelated_0x2538_0x1D5A_0x270DA() {
    // no jump
    globals.setUnknownGlobeRelated1CA6(state.getDI());
    globals.setUnknownGlobeRelated1EA6(0xFEDD);
    globals.setUnknownGlobeRelated1F29(0xFE5A);
    globals.setUnknownGlobeRelated1CAE(0x6360 - 1);
    globals.setUnknownGlobeRelated1CB0(0x6360);
    globals.setUnknownGlobeRelated1CB2(0x6360);
    state.setDS(state.getSS());
    state.setCarryFlag(true);
    return farRet();
  }

  /**
   * Inputs:
   * <ul>
   * <li>CX: size of a block to copy</li>
   * <li>DS:SI: source for copy</li>
   * <li>ES:DI: destination for copy</li>
   * </ul>
   * Outputs:
   * <ul>
   * <li>SI: points to next block</li>
   * <li>DI: points to next block</li>
   * </ul>
   */
  public Runnable copyMapBlock_0x2538_0x2343_0x276C3() {
    // 37 lines in ghidra
    int blockSize = state.getCX();
    int baseSourceAddress = MemoryUtils.toPhysicalAddress(state.getDS(), state.getSI());
    int baseDestinationAddress = MemoryUtils.toPhysicalAddress(state.getES(), state.getDI());
    LOGGER.debug("unknownMapCopyMapBlock blockSize={}, baseSourceAddress:{},baseDestinationAddress:{}", blockSize,
        baseSourceAddress, baseDestinationAddress);
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < blockSize; j++) {
        int value = memory.getUint8(baseSourceAddress + j + 400 * i);
        value = ((value >>> 4) & 0xF) + 0x10;
        memory.setUint8(baseDestinationAddress + j + 320 * i, value);
      }
    }
    // point to next block
    state.setSI(state.getSI() + 4 * 400);
    state.setDI(state.getDI() + 4 * 320);
    return nearRet();
  }

  public Runnable retraceRelatedCalledOnEnterGlobe_0x2538_0x253D_0x278BD() {
    return nearRet();
  }

  public Runnable waitForRetraceInTransitions_0x2538_0x2572_0x278F2() {
    // Calls part of 0x2538_0x253D_0x278BD which we dont need
    return nearRet();
  }

  public Runnable waitForRetraceDuringIntroVideo_0x2538_0x261D_0x2799D() {
    // Calls 0x2538_0x2572_0x278F2 when 01A1 is not 0 which we dont need
    return nearRet();
  }
}
