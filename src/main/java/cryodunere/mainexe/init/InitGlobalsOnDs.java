package cryodunere.mainexe.init;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class InitGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public InitGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public void setDC6A(int value) {
    this.setUint16(0xDC6A, value);
  }

  public void set46D7(int value) {
    this.setUint8(0x46D7, value);
  }
}
