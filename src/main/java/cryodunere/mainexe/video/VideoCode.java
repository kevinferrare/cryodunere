package cryodunere.mainexe.video;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cryodunere.globals.ExtraGlobalsOnDs;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.MemoryUtils;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class VideoCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(VideoCode.class);
  private ExtraGlobalsOnDs globals;

  public VideoCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "video", machine);
    this.globals = new ExtraGlobalsOnDs(machine);
    defineFunction(segment, 0xC921, "read33A3WithAxOffset/get_hnm_resource_flag_name_ptr_by_index_ax_to_bx_ida",
        this::read33A3WithAxOffset_1ED_C921_E7F1);
    defineFunction(segment, 0xCA59, "videoPlayRelated", this::videoPlayRelated_1ED_CA59_E929);
    defineFunction(segment, 0xCC85, "isLastFrame/check_if_hnm_complete_ida", this::isLastFrame_1ED_CC85_EB55);
  }

  public Runnable isLastFrame_1ED_CC85_EB55() {
    int value = globals.get1138_DBE7_Byte8_hnmFinishedFlag();
    LOGGER.debug("DBE7={}", value);
    state.setZeroFlag(value == 0 || value == 1);
    return nearRet();
  }

  /**
   * Reads value at DS:(AX*2)+0x33A3 and returns it in BX
   */
  public Runnable read33A3WithAxOffset_1ED_C921_E7F1() {
    // Only executed when a video starts
    int offset = state.getAX() * 2 + 0x33A3;
    int address = MemoryUtils.toPhysicalAddress(state.getDS(), offset);
    int value = memory.getUint16(address);
    LOGGER.debug("read33A3WithAxOffset {} {} {}", state.getAX(), address, value);
    state.setBX(value);
    return nearRet();
  }

  public Runnable videoPlayRelated_1ED_CA59_E929() {
    // seems to have no impact what so ever is done here. Only executed during videos
    int value = globals.get1138_CE7A_Word16_VideoPlayRelatedIndex();
    globals.set1138_DC22_Word16_VideoPlayRelatedIndex(value);
    LOGGER.debug("videoPlayRelated value:{}", value);
    return nearRet();
  }
}
