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

  public int getCurentVideoBufferSegmentDBDA() {
    return this.getUint16(0xDBDA);
  }

  public void setCurrentVideoBufferSegmentDBDA(int value) {
    this.setUint16(0xDBDA, value);
  }

  public int getCharacterXCoordD82C() {
    return this.getUint16(0xD82C);
  }

  public int getCharacterYCoordD82E() {
    return this.getUint16(0xD82E);
  }

  public int get1C06() {
    return this.getUint16(0x1C06);
  }

  public void set1C06(int value) {
    this.setUint16(0x1C06, value);
  }

  public int get1BF8() {
    return this.getUint16(0x1BF8);
  }

  public void set1BF8(int value) {
    this.setUint16(0x1BF8, value);
  }

  public int get1BEA() {
    return this.getUint16(0x1BEA);
  }

  public void set1BEA(int value) {
    this.setUint16(0x1BEA, value);
  }
}