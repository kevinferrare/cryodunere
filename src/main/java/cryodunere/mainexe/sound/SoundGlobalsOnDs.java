package cryodunere.mainexe.sound;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class SoundGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public SoundGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public int getIsSoundPresentDBCD() {
    return this.getUint8(0xDBCD);
  }

  public void setIsSoundPresentDBCD(int value) {
    this.setUint8(0xDBCD, value);
  }
  
  public void setDBCB(int value) {
    this.setUint8(0xDBCB, value);
  }
}
