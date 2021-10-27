package cryodunere.mainexe;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.MemoryUtils;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class UnknownCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(UnknownCode.class);
  private UnknownGlobalsOnDs globals;

  public UnknownCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "mainCode", machine);
    globals = new UnknownGlobalsOnDs(machine);
    defineFunction(segment, 0x0F66, "noOp", this::noOp_0x1ED_0xF66_0x2E36);
    defineFunction(segment, 0x5B99, "memCopy8BytesDsSIToDsDi", this::memCopy8BytesDsSIToDsDi_0x1ED_0x5B99_0x7A69);
    defineFunction(segment, 0x5BA0, "memCopy8BytesFrom1470ToD83C",
        this::memCopy8BytesFrom1470ToD83C_0x1ED_0x5BA0_0x7A70);
    defineFunction(segment, 0x5BA8, "memCopy8Bytes", this::memCopy8Bytes_0x1ED_0x5BA8_0x7A78);
    defineFunction(segment, 0xAE2F, "isUnknownDBC8And1", this::isUnknownDBC8And1_0x1ED_0xAE2F_0xCCFF);
    defineFunction(segment, 0xAEC6, "isUnknownDBC80x100And2943BitmaskNonZero",
        this::isUnknownDBC80x100And2943BitmaskNonZero_0x1ED_0xAEC6_0xCD96);
    defineFunction(segment, 0xD443, "dispatcherJumpsToBX");
    defineFunction(segment, 0xD454, "dispatcherHelperDeterminesWhereToJump");
    defineFunction(segment, 0x4AC4, "setUnknown11CATo0", this::setUnknown11CATo0_0x1ED_0x4AC4_0x6994);
    defineFunction(segment, 0x4ACA, "setUnknown11CATo1", this::setUnknown11CATo1_0x1ED_0x4ACA_0x699A);
    defineFunction(segment, 0xABCC, "isUnknownDC2BZero", this::isUnknownDC2BZero_0x1ED_0xABCC_0xCA9C);
    defineFunction(segment, 0xAE28, "isUnknownDBC80x100", this::isUnknownDBC80x100_0x1ED_0xAE28_0xCCF8);
    defineFunction(segment, 0xB2BE, "setUnknown2788To0", this::setUnknown2788To0_0x1ED_0xB2BE_0xD18E);
    defineFunction(segment, 0xD917, "noOp", this::noOp_0x1ED_0xD917_0xF7E7);
    defineFunction(segment, 0xDB44, "shlDXAndCXByAH", this::shlDXAndCXByAH_0x1ED_0xDB44_0xFA14);
    defineFunction(segment, 0xE26F, "noOp", this::noOp_0x1ED_0xE26F_0x1013F);
    defineFunction(segment, 0xE75B, "unknownStructCreation", this::unknownStructCreation_0x1ED_0xE75B_0x1062B);
    defineFunction(segment, 0xE851, "checkUnknown39B9", this::checkUnknown39B9_0x1ED_0xE851_0x10721);
    defineFunction(segment, 0x3AE9, "fill47F8WithFF", this::fill47F8WithFF_0x1ED_0x3AE9_0x59B9);
    defineFunction(segment, 0xB2B9, "inc2788", this::inc2788_0x1ED_0xB2B9_0xD189);
    defineFunction(segment, 0xDE4E, "setCEE8To0", this::setCEE8To0_0x1ED_0xDE4E_0xFD1E);
  }

  public Runnable isUnknownDBC8And1_0x1ED_0xAE2F_0xCCFF() {
    // Called upon action? in intro / dialogues / ...
    int value = globals.getDBC8();
    cpu.getAlu().and16(value, 1);
    return nearRet();
  }

  public Runnable setCEE8To0_0x1ED_0xDE4E_0xFD1E() {
    // Called when skipping some intro screens
    globals.setCEE8(0);
    return nearRet();
  }

  public Runnable inc2788_0x1ED_0xB2B9_0xD189() {
    // Called when looking at miror or at book, value seems to be always 0 at call time.
    int value = globals.get2788();
    globals.set2788(value + 1);
    return nearRet();
  }

  public Runnable fill47F8WithFF_0x1ED_0x3AE9_0x59B9() {
    // Called when leaving or entering a scene. Does not seem to have any effect on game whatever the value is in this
    // area.
    int address = MemoryUtils.toPhysicalAddress(state.getDS(), 0x47F8);
    memory.memset(address, 0xFF, 2 * 0x2E);
    return nearRet();
  }

  public Runnable noOp_0x1ED_0xF66_0x2E36() {
    // called before intro
    return nearRet();
  }

  public Runnable setUnknown11CATo0_0x1ED_0x4AC4_0x6994() {
    // triggered when orni lifts off and lands
    globals.set11CAUnknown(0);
    return nearRet();
  }

  public Runnable setUnknown11CATo1_0x1ED_0x4ACA_0x699A() {
    // triggered on orni map, flat map and discussion when displaying new dialogue on click and play screens and in
    // visions
    globals.set11CAUnknown(1);
    return nearRet();
  }

  /**
   * Inputs:
   * <ul>
   * <li>DS:SI: source address</li>
   * <li>DS:DI: destination address</li>
   * </ul>
   * Outputs:
   * <ul>
   * <li>SI incremented by 8</li>
   * <li>DI incremented by 8</li>
   * <li>ES set to DS</li>
   * </ul>
   */
  public Runnable memCopy8BytesDsSIToDsDi_0x1ED_0x5B99_0x7A69() {
    // Called on scene change (example dialogue, room change)
    state.setES(state.getDS());
    int sourceAddress = MemoryUtils.toPhysicalAddress(state.getDS(), state.getSI());
    int destinationAddress = MemoryUtils.toPhysicalAddress(state.getES(), state.getDI());
    // Moves 4 words from source to dest, so 8 bytes
    memory.memCopy(sourceAddress, destinationAddress, 8);
    state.setSI(state.getSI() + 8);
    state.setDI(state.getDI() + 8);
    return nearRet();
  }

  public Runnable memCopy8BytesFrom1470ToD83C_0x1ED_0x5BA0_0x7A70() {
    // Called on room change
    state.setSI(0x1470);
    state.setDI(0xD83C);
    return memCopy8BytesDsSIToDsDi_0x1ED_0x5B99_0x7A69();
  }

  public Runnable memCopy8Bytes_0x1ED_0x5BA8_0x7A78() {
    // Called on dialogue, screen change, intro demo and globe
    state.setSI(0x1470);
    state.setDI(0xD834);
    return memCopy8BytesDsSIToDsDi_0x1ED_0x5B99_0x7A69();
  }

  public Runnable isUnknownDBC80x100And2943BitmaskNonZero_0x1ED_0xAEC6_0xCD96() {
    // Called continuously
    int value = globals.get2943();
    boolean res = true;
    if ((value & 0x10) == 0) {
      isUnknownDBC80x100_0x1ED_0xAE28_0xCCF8();
      if (!state.getZeroFlag()) {
        res = false;
      }
    }
    LOGGER.debug("2943={},res={}", value, res);
    state.setCarryFlag(res);
    if (res) {
      failAsUntested("isUnknownDBC80x100And2943BitmaskNonZero was called with a true result. value: " + value);
    }
    return nearRet();
  }

  /**
   * Purpose unknown but called all the times and always 0 except when clicking on videos in the book, maybe something
   * related to video frames?<br/>
   * When ZF is forced to false, freezes the game in indoor room moves but not in the desert or in other screens.<br/>
   * Outputs:
   * <ul>
   * <li>Zero flag: true when unknownDC2B is zero</li>
   * </ul>
   */
  public Runnable isUnknownDC2BZero_0x1ED_0xABCC_0xCA9C() {
    state.setZeroFlag(globals.getDC2B() == 0);
    return nearRet();
  }

  public Runnable isUnknownDBC80x100_0x1ED_0xAE28_0xCCF8() {
    // Called constantly in game and at transitions during video
    int value = globals.getDBC8();
    // Seems that this function is called with only JZ / JNZ, but not sure so call the real thing
    cpu.getAlu().sub16(value, 0x100);
    if (value != 0) {
      failAsUntested("isUnknownDBC80x100 was called with a non zero value: " + value);
    }
    return nearRet();
  }

  public Runnable setUnknown2788To0_0x1ED_0xB2BE_0xD18E() {
    // Called when game is loaded or when landing with orni. Other values do not seem to have any effect.
    globals.set2788(0);
    return nearRet();
  }

  public Runnable noOp_0x1ED_0xD917_0xF7E7() {
    // called after first globe display
    return nearRet();
  }

  public Runnable shlDXAndCXByAH_0x1ED_0xDB44_0xFA14() {
    // Called at the beginning of the intro, could not see any effect because shiftCount is always 0.
    int shiftCount = state.getAH();
    if (shiftCount != 0) {
      this.failAsUntested("Called with a non zero value, could never see it called that way!");
    }
    state.setCX(state.getCX() << shiftCount);
    state.setDX(state.getDX() << shiftCount);
    return nearRet();
  }

  public Runnable noOp_0x1ED_0xE26F_0x1013F() {
    // called after or during most screen transitions
    return nearRet();
  }

  /**
   * Inputs:<br/>
   * AX,DL to copy at the beginning of the structure<br/>
   * ES:DI:structure address<br/>
   * DS:SI+0x10:start of the structure to copy for 8 bytes (but byte#4 is skipped and there is a hole in the destination
   * as well)<br/>
   */
  public Runnable unknownStructCreation_0x1ED_0xE75B_0x1062B() {
    int destinationAddress = MemoryUtils.toPhysicalAddress(state.getES(), state.getDI());
    memory.setUint16(destinationAddress, state.getAX());
    memory.setUint8(destinationAddress + 2, state.getDL());
    int sourceAddress = MemoryUtils.toPhysicalAddress(state.getDS(), state.getSI()) + 0x10;
    memory.memCopy(sourceAddress, destinationAddress + 3, 3);
    memory.memCopy(sourceAddress + 4, destinationAddress + 6, 4);
    // 10 bytes copied in total
    state.setDI(state.getDI() + 10);
    return nearRet();
  }

  public Runnable checkUnknown39B9_0x1ED_0xE851_0x10721() {
    // Game stops if carry flag is unset
    int value = globals.get39B9();
    value += 0x2F13;
    cpu.getAlu().sub16(value, globals.getCE68());
    return nearRet();
  }
}
