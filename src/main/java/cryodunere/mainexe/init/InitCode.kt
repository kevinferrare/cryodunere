package cryodunere.mainexe.init

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import java.lang.Runnable

// Method names contain _ to separate addresses.
class InitCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int,
  machine: Machine) :
  JavaOverrideHelper(functionInformations, "initRelated", machine) {

  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine!!)
    defineFunction(segment, 0xDA53, "vgaInitRelated") { vgaInitRelated_1ED_DA53_F923() }
  }

  fun vgaInitRelated_1ED_DA53_F923(): Runnable {
    globals.word16_1138_DC6A = 0
    globals.byte8_1138_46D7 = 0
    return nearRet()
  }
}