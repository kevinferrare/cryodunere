package cryodunere.mainexe.video

import cryodunere.globals.ExtraGlobalsOnDs
import org.slf4j.LoggerFactory
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.memory.MemoryUtils
import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.reverseengineer.JavaOverrideHelper

// Method names contain _ to separate addresses.
class VideoCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int, machine: Machine) :
  JavaOverrideHelper(functionInformations, "video", machine) {
  companion object {
    private val LOGGER = LoggerFactory.getLogger(VideoCode::class.java)
  }

  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine!!)
    defineFunction(segment, 0xC921,
      "read33A3WithAxOffset/get_hnm_resource_flag_name_ptr_by_index_ax_to_bx_ida") { read33A3WithAxOffset_1ED_C921_E7F1() }
    defineFunction(segment, 0xCA59, "videoPlayRelated") { videoPlayRelated_1ED_CA59_E929() }
    defineFunction(segment, 0xCC85, "isLastFrame/check_if_hnm_complete_ida") { isLastFrame_1ED_CC85_EB55 }
  }

  val isLastFrame_1ED_CC85_EB55: Runnable
    get() {
      val value: Int = globals.byte8_1138_DBE7_hnmFinishedFlag
      LOGGER.debug("DBE7={}", value)
      state.zeroFlag = value == 0 || value == 1
      return nearRet()
    }

  /**
   * Reads value at DS:(AX*2)+0x33A3 and returns it in BX
   */
  fun read33A3WithAxOffset_1ED_C921_E7F1(): Runnable {
    // Only executed when a video starts
    val offset: Int = state.ax * 2 + 0x33A3
    val address: Int = MemoryUtils.toPhysicalAddress(state.ds, offset)
    val value: Int = memory.getUint16(address)
    LOGGER.debug("read33A3WithAxOffset {} {} {}", state.ax, address, value)
    state.bx = value
    return nearRet()
  }

  fun videoPlayRelated_1ED_CA59_E929(): Runnable {
    // seems to have no impact what so ever is done here. Only executed during videos
    val value: Int = globals.word16_1138_CE7A_VideoPlayRelatedIndex
    globals.word16_1138_DC22_VideoPlayRelatedIndex = value
    LOGGER.debug("videoPlayRelated value:{}", value)
    return nearRet()
  }
}