package cryodunere.mainexe.disk;

import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class DatastructuresGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public DatastructuresGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public SegmentedAddress getStructureSegmentedAddressDBB0() {
    return new SegmentedAddress(this.getUint16(0xDBB0 + 2), this.getUint16(0xDBB0));
  }
}