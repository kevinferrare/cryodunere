package cryodunere.mainexe.dialogues;

import java.util.Map;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class DialoguesCode extends JavaOverrideHelper {
  private DialoguesGlobalsOnDs globals;

  public DialoguesCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "dialogues", machine);
    globals = new DialoguesGlobalsOnDs(machine);

    defineFunction(segment, 0xA1E8, "incUnknown47A8", this::incUnknown47A8_0x1ED_0xA1E8_0xC0B8);
    defineFunction(segment, 0xA8B1, "unknown", this::unknown_0x1ED_0xA8B1_0xC781);
    defineFunction(segment, 0xC85B, "initDialogue", this::initDialogue_0x1ED_0xC85B_0xE72B);
  }

  public Runnable initDialogue_0x1ED_0xC85B_0xE72B() {
    int value = this.globals.getCE7A();
    this.globals.set476E(value);
    this.globals.setTimeBetweenFaceZooms4772(0x1770);
    return nearRet();
  }

  public Runnable incUnknown47A8_0x1ED_0xA1E8_0xC0B8() {
    // Called in dialogues, sometimes before first text display, sometimes before last text
    globals.set47A8(globals.get47A8() + 1);
    return nearRet();
  }

  public Runnable unknown_0x1ED_0xA8B1_0xC781() {
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
