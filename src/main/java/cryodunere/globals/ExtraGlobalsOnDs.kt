package cryodunere.globals

import spice86.emulator.machine.Machine
import cryodunere.generated.GlobalsOnDs

// Non generated code for values that could not be detected by running the game
class ExtraGlobalsOnDs(machine: Machine) : GlobalsOnDs(machine) {
  // menu displayed and associated actions depend on this value
  val menuType: Int
    get() =// menu displayed and associated actions depend on this value
      this.getUint16(word16_1138_21DA_OffsetToMenuType)

  var dword32_1138_DC04_hnmFileOffset: Int
    get() = getUint32(0xDC04)
    set(value) = setUint32(0xDC04, value)

  var dword32_1138_DC08_hnmFileRemain: Int
    get() = getUint32(0xDC08)
    set(value) = setUint32(0xDC08, value)

  var word16_1138_1BF8: Int
    get() = this.getUint16(0x1BF8)
    set(value) = setUint16(0x1BF8, value)

  var word16_1138_4854_SceneSequenceOffset: Int
    get() = this.getUint16(0x4854)
    set(value) = setUint16(0x4854, value)
}