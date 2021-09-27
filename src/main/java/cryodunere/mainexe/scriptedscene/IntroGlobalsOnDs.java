package cryodunere.mainexe.scriptedscene;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class IntroGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public IntroGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public int getUnknown47CE() {
    return this.getUint16(0x47CE);
  }

  public int getSceneSequenceOffset4854() {
    return this.getUint16(0x4854);
  }

  public void setSceneSequenceOffset4854(int value) {
    this.setUint16(0x4854, value);
  }
}
