package cryodunere.mainexe;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class UnknownGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public static final int VGA_CALL_TABLE_START = 0x38B5;

  public UnknownGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public void set11CAUnknown(int value) {
    this.setUint8(0x11CA, value);
  }

  public void set2788Unknown(int value) {
    this.setUint8(0x2788, value);
  }

  public int get2943() {
    return getUint8(0x2943);
  }

  public int getDC2BUnknown() {
    return this.getUint8(0xDC2B);
  }

  public int getDBC8Unknown() {
    return this.getUint16(0xDBC8);
  }

  public int get39B9() {
    return this.getUint16(0x39B9);
  }

  public int getCE68() {
    return this.getUint16(0xCE68);
  }
}
