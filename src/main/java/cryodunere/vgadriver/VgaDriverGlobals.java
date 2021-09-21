package cryodunere.vgadriver;

import spice86.emulator.memory.Memory;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithBaseAddress;

public class VgaDriverGlobals extends MemoryBasedDataStructureWithBaseAddress {

  public VgaDriverGlobals(Memory memory, int baseAddress) {
    super(memory, baseAddress);
  }

  public int getVgaOffset01A3() {
    return this.getUint16(0x01A3);
  }

  public void setVgaOffset01A3(int value) {
    this.setUint16(0x01A3, value);
  }

  public int getMouseCursorAddressInVram018A() {
    return this.getUint16(0x018A);
  }

  public int getColumnsOfMouseCursorCount018C() {
    return this.getUint16(0x018C);
  }

  public int getLinesOfMouseCursorCount018E() {
    return this.getUint16(0x018E);
  }

  public int getPaletteLoadMode01BD() {
    return this.getUint8(0x01BD);
  }

  public int getNeedWaitForRetrace01A1() {
    // wait for retrace when not 0
    return this.getUint8(0x01A1);
  }

  public int getVgaStatusRegisterPort019F() {
    return this.getUint16(0x019F);
  }

  public int getVgaStatusRegisterPortExpectedRetraceValue01A2() {
    return this.getUint8(0x01A2);
  }

  public void setUnknownGlobeRelated1CA6(int value) {
    this.setUint16(0x1CA6, value);
  }

  public void setUnknownGlobeRelated1CAE(int value) {
    this.setUint16(0x1CAE, value);
  }

  public void setUnknownGlobeRelated1CB0(int value) {
    this.setUint16(0x1CB0, value);
  }

  public void setUnknownGlobeRelated1CB2(int value) {
    this.setUint16(0x1CB2, value);
  }

  public void setUnknownGlobeRelated1EA6(int value) {
    this.setUint16(0x1EA6, value);
  }

  public void setUnknownGlobeRelated1F29(int value) {
    this.setUint16(0x1F29, value);
  }
}
