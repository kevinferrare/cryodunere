package cryodunere.mainexe.menu

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import java.lang.Runnable
import org.slf4j.LoggerFactory

// Method names contain _ to separate addresses.
class MenuCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int,
  machine: Machine) :
  JavaOverrideHelper(functionInformations, "mainCode", machine) {
  companion object {
    private val LOGGER = LoggerFactory.getLogger(MenuCode::class.java)

    // values I could find for MenuGlobalsOnDs.getMenuType, not sure they are not an address to something else.
    const val MENU_TYPE_WALK_AROUND = 0x1F0E
    const val MENU_TYPE_DIALOGUE = 0x1F7E
    const val MENU_TYPE_MODIFY_EQUIPMENT = 0x2012
    const val MENU_TYPE_MIXER = 0x201A
    const val MENU_TYPE_BOOK = 0x2032
    const val MENU_TYPE_GLOBE = 0x204A
    const val MENU_TYPE_SAVE_GAME = 0x207A
    const val MENU_TYPE_LOAD_GAME = 0x208A
    const val MENU_TYPE_EXIT_DUNE = 0x20B6
    const val MENU_TYPE_MIRROR = 0x20C2
    const val MENU_TYPE_FLAT_MAP = 0x20F2
    const val MENU_TYPE_TALKING_TO_TROOP = 0x210A
    const val MENU_TYPE_MOVE_TROOP = 0x212E
    const val MENU_TYPE_ORNI_MAP = 0x212E
    const val MENU_TYPE_SELECT_TROOP_OCCUPATION = 0x215A
    const val MENU_TYPE_CHANGE_TROOP_OCCUPATION = 0x216E
  }

  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine!!)
    defineFunction(segment, 0xD316, "menuAnimationRelated") { menuAnimationRelated_1ED_D316_F1E6() }
    defineFunction(segment, 0xD41B,
      "setBpToCurrentMenuTypeForScreenAction") { setBpToCurrentMenuTypeForScreenAction_1ED_D41B_F2EB() }
  }

  fun menuAnimationRelated_1ED_D316_F1E6(): Runnable {
    // called when a menu has a submenu
    val isAnimateMenuUneeded: Int = globals.word16_1138_35A6_IsAnimateMenuUnneeded
    var value2: Int = globals.byte8_1138_DCE6_TransitionBitmask
    LOGGER.debug("isAnimateMenuUneeded={},DCE6={}", isAnimateMenuUneeded, value2)
    if (isAnimateMenuUneeded == 0) {
      value2 = value2 or 1
      globals.byte8_1138_DCE6_TransitionBitmask = value2
    }
    return nearRet()
  }

  fun setBpToCurrentMenuTypeForScreenAction_1ED_D41B_F2EB(): Runnable {
    // If BP does not point to a correct menu type, menu is still OK but no action is clickable on the screen
    if (state.ss != state.ds) {
      failAsUntested(
        "Was implemented considering base address is DS since I couldnt see a case where DS!=SS for this method, but you found one :)")
    }
    val value: Int = globals.menuType
    state.bp = value
    return nearRet()
  }
}