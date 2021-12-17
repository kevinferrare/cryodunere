package cryodunere.mainexe.dialogues

import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import spice86.emulator.memory.SegmentedAddress
import java.lang.Runnable

// Method names contain _ to separate addresses.
class DialoguesCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int,
  machine: Machine) : JavaOverrideHelper(functionInformations, "dialogues", machine) {
  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine!!)
    defineFunction(segment, 0xA1E8, "incUnknown47A8") { incUnknown47A8_1ED_A1E8_C0B8() }
    defineFunction(segment, 0xA8B1, "unknown") { unknown_1ED_A8B1_C781() }
    defineFunction(segment, 0xC85B, "initDialogue") { initDialogue_1ED_C85B_E72B() }
  }

  fun initDialogue_1ED_C85B_E72B(): Runnable {
    val value: Int = globals.word16_1138_CE7A_VideoPlayRelatedIndex
    globals.word16_1138_476E = value
    globals.word16_1138_4772_TimeBetweenFaceZooms = 0x1770
    return nearRet()
  }

  fun incUnknown47A8_1ED_A1E8_C0B8(): Runnable {
    // Called in dialogues, sometimes before first text display, sometimes before last text
    globals.byte8_1138_47A8 = globals.byte8_1138_47A8 + 1
    return nearRet()
  }

  fun unknown_1ED_A8B1_C781(): Runnable {
    // Called when a dialogue text changes (beginning and during dialogue), and when entering an orni
    // Value does not seem to have any effect
    var value: Int = state.al
    value = value and 0xF
    value += 0x30
    if (value > 0x39) {
      value += 0x7
    }
    state.al = value
    return nearRet()
  }
}