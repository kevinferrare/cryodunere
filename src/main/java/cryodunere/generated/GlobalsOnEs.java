package cryodunere.generated;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithEsBaseAddress;

// Accessors for values accessed via register ES
@SuppressWarnings("java:S100")
public class GlobalsOnEs extends MemoryBasedDataStructureWithEsBaseAddress {
  public GlobalsOnEs(Machine machine) {
    super(machine);
  }

  // Getters and Setters for address 0x40:0x63/0x463.
  // Was accessed via the following registers: ES
  public int get0040_0063_Word16() {
    return getUint16(0x63);
  }

  // Operation not registered by running code
  public void set0040_0063_Word16(int value) {
    setUint16(0x63, value);
  }

  // Getters and Setters for address 0x0:0x46C/0x46C.
  // Was accessed via the following registers: ES
  public int get0000_046C_Word16() {
    return getUint16(0x46C);
  }

  // Operation not registered by running code
  public void set0000_046C_Word16(int value) {
    setUint16(0x46C, value);
  }

}