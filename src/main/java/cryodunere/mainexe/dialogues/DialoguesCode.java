package cryodunere.mainexe.dialogues;

import java.util.Map;

import cryodunere.globals.ExtraGlobalsOnDs;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class DialoguesCode extends JavaOverrideHelper {
  private ExtraGlobalsOnDs globals;

  public DialoguesCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "dialogues", machine);
    globals = new ExtraGlobalsOnDs(machine);

    defineFunction(segment, 0xA1E8, "incUnknown47A8", this::incUnknown47A8_1ED_A1E8_C0B8);
    defineFunction(segment, 0xA8B1, "unknown", this::unknown_1ED_A8B1_C781);
    defineFunction(segment, 0xC85B, "initDialogue", this::initDialogue_1ED_C85B_E72B);
  }

  public Runnable initDialogue_1ED_C85B_E72B() {
    int value = this.globals.get1138_CE7A_Word16_VideoPlayRelatedIndex();
    this.globals.set1138_476E_Word16(value);
    this.globals.set1138_4772_Word16_TimeBetweenFaceZooms(0x1770);
    return nearRet();
  }

  public Runnable incUnknown47A8_1ED_A1E8_C0B8() {
    // Called in dialogues, sometimes before first text display, sometimes before last text
    globals.set1138_47A8_Byte8(globals.get1138_47A8_Byte8() + 1);
    return nearRet();
  }

  public Runnable unknown_1ED_A8B1_C781() {
    // Called when a dialogue text changes (beginning and during dialogue), and when entering an orni
    // Value does not seem to have any effect
    int value = state.getAL();
    value &= 0xF;
    value += 0x30;
    if (value > 0x39) {
      value += 0x7;
    }
    state.setAL(value);
    return nearRet();
  }
}
