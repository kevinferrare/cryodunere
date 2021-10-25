package cryodunere.mainexe.video;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class VideoGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public VideoGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public int getCE7AVideoPlayRelatedIndex() {
    return this.getUint16(0xCE7A);
  }

  public void setCE7AVideoPlayRelatedIndex(int value) {
    this.setUint16(0xCE7A, value);
  }

  // 0 or 1 for regular frames, 3 for the last one?
  public int getDBE7() {
    return this.getUint8(0xDBE7);
  }

  public void setDC22VideoPlayRelatedIndex(int value) {
    this.setUint16(0xDC22, value);
  }
}
