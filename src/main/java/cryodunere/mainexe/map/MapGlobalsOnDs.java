package cryodunere.mainexe.map;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class MapGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public MapGlobalsOnDs(Machine machine) {
    super(machine);
  }

  /**
   * Seems to be a pointer in memory to an action to do when clicking on the map.<br/>
   * When the value is valid but does not match the map displayed nothing happens.<br/>
   * When the value is invalid, it jumps to some random code on click and / or crashes.
   * 
   * @param value
   */
  public void setMapClickHandlerAddress2570(int value) {
    this.setUint16(0x2570, value);
  }

  public void setMapCursorTypeDC58(int value) {
    this.setUint16(0xDC58, value);
  }
}
