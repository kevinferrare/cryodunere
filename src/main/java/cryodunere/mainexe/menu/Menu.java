package cryodunere.mainexe.menu;

import java.util.Map;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class Menu extends JavaOverrideHelper {
  // values I could find for MenuGlobalsOnDs.getMenuType, not sure they are not an address to something else.
  public static final int MENU_TYPE_WALK_AROUND = 0x1F0E;
  public static final int MENU_TYPE_DIALOGUE = 0x1F7E;
  public static final int MENU_TYPE_MODIFY_EQUIPMENT = 0x2012;
  public static final int MENU_TYPE_MIXER = 0x201A;
  public static final int MENU_TYPE_BOOK = 0x2032;
  public static final int MENU_TYPE_GLOBE = 0x204A;
  public static final int MENU_TYPE_SAVE_GAME = 0x207A;
  public static final int MENU_TYPE_LOAD_GAME = 0x208A;
  public static final int MENU_TYPE_EXIT_DUNE = 0x20B6;
  public static final int MENU_TYPE_MIRROR = 0x20C2;
  public static final int MENU_TYPE_FLAT_MAP = 0x20F2;
  public static final int MENU_TYPE_TALKING_TO_TROOP = 0x210A;
  public static final int MENU_TYPE_MOVE_TROOP = 0x212E;
  public static final int MENU_TYPE_ORNI_MAP = 0x212E;
  public static final int MENU_TYPE_SELECT_TROOP_OCCUPATION = 0x215A;
  public static final int MENU_TYPE_CHANGE_TROOP_OCCUPATION = 0x216E;

  private MenuGlobalsOnDs globalsOnDs;

  public Menu(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "mainCode", machine);
    globalsOnDs = new MenuGlobalsOnDs(machine);

    defineFunction(segment, 0xD41B, "setBpToCurrentMenuTypeForScreenAction",
        this::setBpToCurrentMenuTypeForScreenAction_0x1ED_0xD41B_0xF2EB);
  }

  public Runnable setBpToCurrentMenuTypeForScreenAction_0x1ED_0xD41B_0xF2EB() {
    // If BP does not point to a correct menu type, menu is still OK but no action is clickable on the screen
    if (state.getSS() != state.getDS()) {
      failAsUntested(
          "Was implemented considering base address is DS since I couldnt see a case where DS!=SS for this method, but you found one :)");
    }
    int value = globalsOnDs.getMenuType();
    state.setBP(value);
    return nearRet();
  }
}
