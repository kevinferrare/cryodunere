package cryodunere.mainexe.dialogues;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class DialoguesGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public DialoguesGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public int getCE7A() {
    return this.getUint16(0xCE7A);
  }

  public int get476E() {
    return this.getUint16(0x476E);
  }

  // if this value stays 0, will always zoom in character face in dialogues
  public void set476E(int value) {
    this.setUint16(0x476E, value);
  }

  public void setTimeBetweenFaceZooms4772(int value) {
    this.setUint16(0x4772, value);
  }

  public void set47A8(int value) {
    this.setUint8(0x47A8, value);
  }

  public int get47A8() {
    return this.getUint8(0x47A8);
  }
}