package cryodunere.mainexe.map

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import java.lang.Runnable
import spice86.emulator.memory.MemoryUtils
import org.slf4j.LoggerFactory
import spice86.utils.ConvertUtils

// Method names contain _ to separate addresses.
class MapCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int, machine: Machine) :
  JavaOverrideHelper(functionInformations, "map", machine) {
  companion object {
    private val LOGGER = LoggerFactory.getLogger(MapCode::class.java)
    const val CLICK_HANDLER_INGAME = 0x2572
    const val CLICK_HANDLER_FLAT_MAP = 0x1A9E
    const val CLICK_HANDLER_ORNI_MAP = 0x1AC8
    const val CLICK_HANDLER_MOVE_TROOP_MAP = 0x1AAC
    const val CLICK_HANDLER_GLOBE_MAP = 0x2562
  }

  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine!!)
    defineFunction(segment, 0xD95B,
      "setMapClickHandlerAddressToInGame") { setMapClickHandlerAddressToInGame_1ED_D95B_F82B() }
    defineFunction(segment, 0xD95E,
      "setMapClickHandlerAddressFromAx") { setMapClickHandlerAddressFromAx_1ED_D95E_F82E() }
    defineFunction(segment, 0xDAA3, "initMapCursorTypeDC58To0") { initMapCursorTypeDC58To0_1ED_DAA3_F973() }
    defineFunction(segment, 0xDAAA, "setSiToMapCursorTypeDC58") { setSiToMapCursorTypeDC58_1ED_DAAA_F97A() }
    defineFunction(segment, 0x5B96, "unknownMemcopy") { unknownMemcopy_1ED_5B96_7A66() }
  }

  fun unknownMemcopy_1ED_5B96_7A66(): Runnable {
    // Called on map display / move, data to be copied never seems to change.
    val sourceAddress: Int = MemoryUtils.toPhysicalAddress(state.ds, 0x46e3)
    val destinationAddress: Int = MemoryUtils.toPhysicalAddress(state.ds, state.di)
    memory.memCopy(sourceAddress, destinationAddress, 4 * 2)
    return nearRet()
  }

  fun setMapClickHandlerAddressToInGame_1ED_D95B_F82B(): Runnable {
    // called when starting to fly the orni, exiting maps and when switching from intro to game
    // at load time
    // See setMapClickHandlerAddressFromAx_1ED_D95E_F82E
    state.ax = CLICK_HANDLER_INGAME
    return setMapClickHandlerAddressFromAx_1ED_D95E_F82E()
  }

  /**
   * Sets map click handler address from AX. This value determines what happens when you click on the map and the code
   * seems to jump to it somehow.
   *
   *  * Entering and moving map, clicking on find prospectors (AX=0x1A9E)
   *  * Entering Orni screen (AX=1AC8)
   *  * Entering move troop screen, but not spice density screen (AX=1AAC)
   *  * Entering globe screens (AX=0x2562)
   *
   * Inputs:
   *
   *  * DS segment for value set
   *  * AX: value to set
   *
   */
  fun setMapClickHandlerAddressFromAx_1ED_D95E_F82E(): Runnable {
    globals.word16_1138_2570_MapClickHandlerAddress = state.ax
    if (LOGGER.isDebugEnabled) {
      LOGGER.debug("setMapClickHandlerAddressFromAx: DS:{}, AX:{}", ConvertUtils.toHex16(state.ds),
        ConvertUtils.toHex16(state.ax))
    }
    return nearRet()
  }

  fun setSiToMapCursorTypeDC58_1ED_DAAA_F97A(): Runnable {
    // when taking an orni: 0x149C, when loading globe or results: 0x2448
    val value: Int = state.si
    if (LOGGER.isDebugEnabled) {
      LOGGER.debug("setSiToMapCursorTypeDC58: value:{}", ConvertUtils.toHex16(value))
    }
    globals.word16_1138_DC58_MapCursorType = value
    return nearRet()
  }

  fun initMapCursorTypeDC58To0_1ED_DAA3_F973(): Runnable {
    // when 0 or any other value, map cursor is disabled for globe / orni.
    globals.word16_1138_DC58_MapCursorType = 0
    return nearRet()
  }
}