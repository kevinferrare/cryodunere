package cryodunere.globals;

import cryodunere.generated.GlobalsOnDs;
import spice86.emulator.machine.Machine;

// Non generated code for values that could not be detected by running the game
public class ExtraGlobalsOnDs extends GlobalsOnDs {

  public ExtraGlobalsOnDs(Machine machine) {
    super(machine);
  }

  public int getMenuType() {
    // menu displayed and associated actions depend on this value
    return this.getUint16(get1138_21DA_Word16_OffsetToMenuType());
  }

  public int get1138_DC04_DWord32_hnmFileOffset() {
    return getUint32(0xDC04);
  }

  public void set1138_DC04_DWord32_hnmFileOffset(int value) {
    setUint32(0xDC04, value);
  }

  public int get1138_DC08_DWord32_hnmFileRemain() {
    return getUint32(0xDC08);
  }

  public void set1138_DC08_DWord32_hnmFileRemain(int value) {
    setUint32(0xDC08, value);
  }
}
