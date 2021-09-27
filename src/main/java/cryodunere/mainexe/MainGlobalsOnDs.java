package cryodunere.mainexe;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class MainGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public static final int VGA_CALL_TABLE_START = 0x38B5;

  public MainGlobalsOnDs(Machine machine) {
    super(machine);
  }

  /**
   * Time elapsed since the game started (in game time).<br/>
   * Each day has 16 dune hours which are the last 4 bits of this value:
   * <ul>
   * <li>0,1: morning</li>
   * <li>2,3,4,5,6,7,8,9,10: day</li>
   * <li>11,12: sunset</li>
   * <li>13,14,15: night</li>
   * </ul>
   */
  public int get0002GameElapsedTime() {
    return this.getUint16(0x2);
  }

  /**
   * See getGameElapsedTime0002
   */
  public int get0002HourOfTheDay() {
    return get0002GameElapsedTime() & 0xF;
  }

  public void set11CAUnknown(int value) {
    this.setUint8(0x11CA, value);
  }

  public void set2788Unknown(int value) {
    this.setUint8(0x2788, value);
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
