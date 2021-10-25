package cryodunere.mainexe;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cryodunere.sound.SoundDriver;
import cryodunere.vgadriver.VgaDriver;
import spice86.emulator.cpu.SegmentRegisters;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.MemoryUtils;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class MainCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(MainCode.class);
  private MainGlobalsOnDs globalsOnDs;
  private VgaDriver vgaDriver;
  private SoundDriver soundDriver;

  public MainCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine,
      VgaDriver vgaDriver, SoundDriver soundDriver) {
    super(functionInformations, "mainCode", machine);
    this.vgaDriver = vgaDriver;
    this.soundDriver = soundDriver;
    globalsOnDs = new MainGlobalsOnDs(machine);
    defineFunction(segment, 0x0579, "clearVgaOffset01A3F", this::clearVgaOffset01A3F_0x1ED_0x579_0x2449);
    defineFunction(segment, 0x0F66, "noOp", this::noOp_0x1ED_0xF66_0x2E36);
    defineFunction(segment, 0x1AE0, "setHourOfTheDayToAX", this::setHourOfTheDayToAX_0x1ED_0x1AE0_0x39B0);
    defineFunction(segment, 0x5B99, "memCopy8BytesDsSIToDsDi", this::memCopy8BytesDsSIToDsDi_0x1ED_0x5B99_0x7A69);
    defineFunction(segment, 0x5BA0, "memCopy8BytesFrom1470ToD83C",
        this::memCopy8BytesFrom1470ToD83C_0x1ED_0x5BA0_0x7A70);
    defineFunction(segment, 0xD443, "dispatcherJumpsToBX");
    defineFunction(segment, 0xD454, "dispatcherHelperDeterminesWhereToJump");
    defineFunction(segment, 0x4AC4, "setUnknown11CATo0", this::setUnknown11CATo0_0x1ED_0x4AC4_0x6994);
    defineFunction(segment, 0x4ACA, "setUnknown11CATo1", this::setUnknown11CATo1_0x1ED_0x4ACA_0x699A);
    defineFunction(segment, 0x5BA8, "memCopy8Bytes", this::memCopy8Bytes_0x1ED_0x5BA8_0x7A78);
    defineFunction(segment, 0xABCC, "isUnknownDC2BZero", this::isUnknownDC2BZero_0x1ED_0xABCC_0xCA9C);
    defineFunction(segment, 0xAC30, "soundDriverUnknownClearAL", this::soundDriverUnknownClearAL_0x1ED_0xAC30_0xCB00);
    defineFunction(segment, 0xAE28, "isUnknownDBC80x100", this::isUnknownDBC80x100_0x1ED_0xAE28_0xCCF8);
    defineFunction(segment, 0xB2BE, "setUnknown2788To0", this::setUnknown2788To0_0x1ED_0xB2BE_0xD18E);
    defineFunction(segment, 0xD917, "noOp", this::noOp_0x1ED_0xD917_0xF7E7);
    defineFunction(segment, 0xDB44, "shlDXAndCXByAH", this::shlDXAndCXByAH_0x1ED_0xDB44_0xFA14);
    defineFunction(segment, 0xE851, "checkUnknown39B9", this::checkUnknown39B9_0x1ED_0xE851_0x10721);
    defineFunction(segment, 0xE26F, "noOp", this::noOp_0x1ED_0xE26F_0x1013F);
  }

  // sets the gfx offset to 0
  public Runnable clearVgaOffset01A3F_0x1ED_0x579_0x2449() {
    LOGGER.debug("Clearing VGA offset");
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3939, vgaDriver.getBaseSegment(), 0x163);
    state.setAX(0);
    vgaDriver.updateVgaOffset01A3FromLineNumberAsAx_0x2538_0x163_0x254E3();
    return nearRet();
  }

  public Runnable noOp_0x1ED_0xF66_0x2E36() {
    // called before intro
    return nearRet();
  }

  public Runnable setHourOfTheDayToAX_0x1ED_0x1AE0_0x39B0() {
    state.setAX(globalsOnDs.get0002HourOfTheDay());
    if (LOGGER.isDebugEnabled()) {
      LOGGER.debug("setHourOfTheDayToAX:gameTime:{}, gameHour:{}", globalsOnDs.get0002GameElapsedTime(), state.getAX());
    }
    return nearRet();
  }

  public Runnable setUnknown11CATo0_0x1ED_0x4AC4_0x6994() {
    // triggered when orni lifts off and lands
    globalsOnDs.set11CAUnknown(0);
    return nearRet();
  }

  public Runnable setUnknown11CATo1_0x1ED_0x4ACA_0x699A() {
    // triggered on orni map, flat map and discussion when displaying new dialogue on click and play screens and in
    // visions
    globalsOnDs.set11CAUnknown(1);
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

  /**
   * Purpose unknown but called all the times and always 0 except when clicking on videos in the book, maybe something related to video frames?<br/>
   * When ZF is forced to false, freezes the game in indoor room moves but not in the desert or in other screens.<br/>
   * Outputs:
   * <ul>
   * <li>Zero flag: true when unknownDC2B is zero</li>
   * </ul>
   */
  public Runnable isUnknownDC2BZero_0x1ED_0xABCC_0xCA9C() {
    state.setZeroFlag(globalsOnDs.getDC2BUnknown() == 0);
    return nearRet();
  }

  public Runnable soundDriverUnknownClearAL_0x1ED_0xAC30_0xCB00() {
    // Called at scene change
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3999, soundDriver.getBaseSegment1(), 0x10C);
    soundDriver.clearAL_0x4822_0x10C_0x4832C();
    return nearRet();
  }

  public Runnable isUnknownDBC80x100_0x1ED_0xAE28_0xCCF8() {
    // Called constantly in game and at transitions during video
    int value = globalsOnDs.getDBC8Unknown();
    // Seems that this function is called with only JZ / JNZ, but not sure so call the real thing
    cpu.getAlu().sub16(value, 0x100);
    if (value != 0) {
      failAsUntested("isUnknownDBC80x100 was called with a non zero value: " + value);
    }
    return nearRet();
  }

  public Runnable setUnknown2788To0_0x1ED_0xB2BE_0xD18E() {
    // Called when game is loaded or when landing with orni. Other values do not seem to have any effect.
    globalsOnDs.set2788Unknown(0);
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

  public Runnable checkUnknown39B9_0x1ED_0xE851_0x10721() {
    // Game stops if carry flag is unset
    int value = globalsOnDs.get39B9();
    value += 0x2F13;
    cpu.getAlu().sub16(value, globalsOnDs.getCE68());
    return nearRet();
  }

  public Runnable noOp_0x1ED_0xE26F_0x1013F() {
    // called after or during most screen transitions
    return nearRet();
  }
}
