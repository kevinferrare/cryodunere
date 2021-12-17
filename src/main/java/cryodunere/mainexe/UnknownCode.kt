package cryodunere.mainexe

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import java.lang.Runnable
import spice86.emulator.memory.MemoryUtils
import org.slf4j.LoggerFactory

// Method names contain _ to separate addresses.
class UnknownCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int,
  machine: Machine) : JavaOverrideHelper(functionInformations, "mainCode", machine) {

  companion object {
    private val LOGGER = LoggerFactory.getLogger(UnknownCode::class.java)
  }

  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine)
    defineFunction(segment, 0x0F66, "noOp") { noOp_1ED_F66_2E36() }
    defineFunction(segment, 0x5B99, "memCopy8BytesDsSIToDsDi") { memCopy8BytesDsSIToDsDi_1ED_5B99_7A69() }
    defineFunction(segment, 0x5BA0, "memCopy8BytesFrom1470ToD83C") { memCopy8BytesFrom1470ToD83C_1ED_5BA0_7A70() }
    defineFunction(segment, 0x5BA8, "memCopy8Bytes") { memCopy8Bytes_1ED_5BA8_7A78() }
    defineFunction(segment, 0xAE2F, "isUnknownDBC8And1/check_pcm_enabled_ida") { isUnknownDBC8And1_1ED_AE2F_CCFF }
    defineFunction(segment, 0xAEC6,
      "isUnknownDBC80x100And2943BitmaskNonZero") { isUnknownDBC80x100And2943BitmaskNonZero_1ED_AEC6_CD96 }
    defineFunction(segment, 0xD443, "dispatcherJumpsToBX")
    defineFunction(segment, 0xD454, "dispatcherHelperDeterminesWhereToJump")
    defineFunction(segment, 0x4AC4, "setUnknown11CATo0") { setUnknown11CATo0_1ED_4AC4_6994() }
    defineFunction(segment, 0x4ACA, "setUnknown11CATo1") { setUnknown11CATo1_1ED_4ACA_699A() }
    defineFunction(segment, 0xABCC, "isUnknownDC2BZero") { isUnknownDC2BZero_1ED_ABCC_CA9C }
    defineFunction(segment, 0xAE28, "isUnknownDBC80x100") { isUnknownDBC80x100_1ED_AE28_CCF8 }
    defineFunction(segment, 0xB2BE, "setUnknown2788To0") { setUnknown2788To0_1ED_B2BE_D18E() }
    defineFunction(segment, 0xD917, "noOp") { noOp_1ED_D917_F7E7() }
    defineFunction(segment, 0xDB44, "shlDXAndCXByAX") { shlDXAndCXByAX_1ED_DB44_FA14() }
    defineFunction(segment, 0xE26F, "noOp") { noOp_1ED_E26F_1013F() }
    defineFunction(segment, 0xE75B, "unknownStructCreation") { unknownStructCreation_1ED_E75B_1062B() }
    defineFunction(segment, 0xE851, "checkUnknown39B9") { checkUnknown39B9_1ED_E851_10721() }
    defineFunction(segment, 0x3AE9, "fill47F8WithFF") { fill47F8WithFF_1ED_3AE9_59B9() }
    defineFunction(segment, 0xB2B9, "inc2788") { inc2788_1ED_B2B9_D189() }
    defineFunction(segment, 0xDE4E, "setCEE8To0") { setCEE8To0_1ED_DE4E_FD1E() }
  }

  // Called upon action? in intro / dialogues / ...
  val isUnknownDBC8And1_1ED_AE2F_CCFF: Runnable
    get() {
      // Called upon action? in intro / dialogues / ...
      val value: Int = globals.word16_1138_DBC8
      cpu.alu.and16(value, 1)
      return nearRet()
    }

  fun setCEE8To0_1ED_DE4E_FD1E(): Runnable {
    // Called when skipping some intro screens
    globals.byte8_1138_CEE8_keyHit = 0
    return nearRet()
  }

  fun inc2788_1ED_B2B9_D189(): Runnable {
    // Called when looking at miror or at book, value seems to be always 0 at call time.
    val value: Int = globals.byte8_1138_2788
    globals.byte8_1138_2788 = value + 1
    return nearRet()
  }

  fun fill47F8WithFF_1ED_3AE9_59B9(): Runnable {
    // Called when leaving or entering a scene. Does not seem to have any effect on game whatever the value is in this
    // area.
    val address: Int = MemoryUtils.toPhysicalAddress(state.ds, 0x47F8)
    memory.memset(address, 0xFF, 2 * 0x2E)
    return nearRet()
  }

  fun noOp_1ED_F66_2E36(): Runnable {
    // called before intro
    return nearRet()
  }

  fun setUnknown11CATo0_1ED_4AC4_6994(): Runnable {
    // triggered when orni lifts off and lands
    globals.byte8_1138_11CA = 0
    return nearRet()
  }

  fun setUnknown11CATo1_1ED_4ACA_699A(): Runnable {
    // triggered on orni map, flat map and discussion when displaying new dialogue on click and play screens and in
    // visions
    globals.byte8_1138_11CA = 1
    return nearRet()
  }

  /**
   * Inputs:
   *
   *  * DS:SI: source address
   *  * DS:DI: destination address
   *
   * Outputs:
   *
   *  * SI incremented by 8
   *  * DI incremented by 8
   *  * ES set to DS
   *
   */
  fun memCopy8BytesDsSIToDsDi_1ED_5B99_7A69(): Runnable {
    // Called on scene change (example dialogue, room change)
    state.es = state.ds
    val sourceAddress: Int = MemoryUtils.toPhysicalAddress(state.ds, state.si)
    val destinationAddress: Int = MemoryUtils.toPhysicalAddress(state.es, state.di)
    // Moves 4 words from source to dest, so 8 bytes
    memory.memCopy(sourceAddress, destinationAddress, 8)
    state.si = state.si + 8
    state.di = state.di + 8
    return nearRet()
  }

  fun memCopy8BytesFrom1470ToD83C_1ED_5BA0_7A70(): Runnable {
    // Called on room change
    state.si = 0x1470
    state.di = 0xD83C
    return memCopy8BytesDsSIToDsDi_1ED_5B99_7A69()
  }

  fun memCopy8Bytes_1ED_5BA8_7A78(): Runnable {
    // Called on dialogue, screen change, intro demo and globe
    state.si = 0x1470
    state.di = 0xD834
    return memCopy8BytesDsSIToDsDi_1ED_5B99_7A69()
  }

  // Called continuously
  val isUnknownDBC80x100And2943BitmaskNonZero_1ED_AEC6_CD96: Runnable
    get() {
      // Called continuously
      val value: Int = globals.byte8_1138_2943_cmdArgsMemory
      var res: Boolean = true
      if (value and 0x10 == 0) {
        isUnknownDBC80x100_1ED_AE28_CCF8
        if (!state.zeroFlag) {
          res = false
        }
      }
      LOGGER.debug("2943={},res={}", value, res)
      state.carryFlag = res
      if (res) {
        failAsUntested("isUnknownDBC80x100And2943BitmaskNonZero was called with a true result. value: $value")
      }
      return nearRet()
    }

  /**
   * Purpose unknown but called all the times and always 0 except when clicking on videos in the book, maybe something
   * related to video frames?<br></br>
   * When ZF is forced to false, freezes the game in indoor room moves but not in the desert or in other screens.<br></br>
   * Outputs:
   *
   *  * Zero flag: true when unknownDC2B is zero
   *
   */
  val isUnknownDC2BZero_1ED_ABCC_CA9C: Runnable
    get() {
      state.zeroFlag = globals.byte8_1138_DC2B == 0
      return nearRet()
    }

  // Called constantly in game and at transitions during video
  val isUnknownDBC80x100_1ED_AE28_CCF8: Runnable
    get() {
      // Called constantly in game and at transitions during video
      val value: Int = globals.word16_1138_DBC8
      // Seems that this function is called with only JZ / JNZ, but not sure so call the real thing
      cpu.alu.sub16(value, 0x100)
      if (value != 0) {
        failAsUntested("isUnknownDBC80x100 was called with a non zero value: $value")
      }
      return nearRet()
    }

  fun setUnknown2788To0_1ED_B2BE_D18E(): Runnable {
    // Called when game is loaded or when landing with orni. Other values do not seem to have any effect.
    globals.byte8_1138_2788 = 0
    return nearRet()
  }

  fun noOp_1ED_D917_F7E7(): Runnable {
    // called after first globe display
    return nearRet()
  }

  fun shlDXAndCXByAX_1ED_DB44_FA14(): Runnable {
    // Called before setting mouse parameters
    val shiftCount: Int = state.ax
    state.cx = state.cx shl shiftCount
    state.dx = state.dx shl shiftCount
    return nearRet()
  }

  fun noOp_1ED_E26F_1013F(): Runnable {
    // called after or during most screen transitions
    return nearRet()
  }

  /**
   * Inputs:<br></br>
   * AX,DL to copy at the beginning of the structure<br></br>
   * ES:DI:structure address<br></br>
   * DS:SI+0x10:start of the structure to copy for 8 bytes (but byte#4 is skipped and there is a hole in the destination
   * as well)<br></br>
   */
  fun unknownStructCreation_1ED_E75B_1062B(): Runnable {
    val destinationAddress: Int = MemoryUtils.toPhysicalAddress(state.es, state.di)
    memory.setUint16(destinationAddress, state.ax)
    memory.setUint8(destinationAddress + 2, state.dl)
    val sourceAddress = MemoryUtils.toPhysicalAddress(state.ds, state.si) + 0x10
    memory.memCopy(sourceAddress, destinationAddress + 3, 3)
    memory.memCopy(sourceAddress + 4, destinationAddress + 6, 4)
    // 10 bytes copied in total
    state.di = state.di + 10
    return nearRet()
  }

  fun checkUnknown39B9_1ED_E851_10721(): Runnable {
    // Game stops if carry flag is unset
    var value: Int = globals.word16_1138_39B9_allocatorNextFreeSegment
    value += 0x2F13
    cpu.alu.sub16(value, globals.word16_1138_CE68_allocatorLastFreeSegment)
    return nearRet()
  }
}