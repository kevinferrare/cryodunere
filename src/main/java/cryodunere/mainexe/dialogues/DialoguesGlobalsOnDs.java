package cryodunere.mainexe.dialogues;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class DialoguesGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public DialoguesGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public void set47A8(int value) {
    this.setUint8(0x47A8, value);
  }

  public int get47A8() {
    return this.getUint8(0x47A8);
  }
}