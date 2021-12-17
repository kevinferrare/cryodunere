package cryodunere.generated

import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress
import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithEsBaseAddress
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithSsBaseAddress

// Accessors for values accessed via register ES
open class GlobalsOnEs(machine: Machine) : MemoryBasedDataStructureWithEsBaseAddress(machine) {
  // Getters and Setters for address 0x40:0x63/0x463.
  var word16_0040_0063: Int
    // Was accessed via the following registers: ES
    get() = getUint16(0x63)
    // Operation not registered by running code
    set(value) = setUint16(0x63, value)

  // Getters and Setters for address 0x0:0x46C/0x46C.
  var word16_0000_046C: Int
    // Was accessed via the following registers: ES
    get() = getUint16(0x46C)
    // Operation not registered by running code
    set(value) = setUint16(0x46C, value)
}