package cryodunere.mainexe.display;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class DisplayGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public DisplayGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public int getBufferSegmentDialogueDC32() {
    return this.getUint16(0xDC32);
  }

  public int getBufferSegmentDBD6() {
    return this.getUint16(0xDBD6);
  }

  public int getBufferSegmentDBD8() {
    return this.getUint16(0xDBD8);
  }

  public int getBufferSegmentDBDA() {
    return this.getUint16(0xDBDA);
  }

  public void setBufferSegmentDBDA(int value) {
    this.setUint16(0xDBDA, value);
  }
}