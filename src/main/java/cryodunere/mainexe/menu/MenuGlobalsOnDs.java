package cryodunere.mainexe.menu;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class MenuGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public MenuGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public void set21DAOffsetToMenuType(int value) {
    this.setUint16(0x21DA, value);
  }

  public int get21DAOffsetToMenuType() {
    return this.getUint16(0x21DA);
  }

  public void setMenuType(int value) {
    this.setUint16(get21DAOffsetToMenuType(), value);
  }

  public int getMenuType() {
    // menu displayed and associated actions depend on this value
    return this.getUint16(get21DAOffsetToMenuType());
  }
}
