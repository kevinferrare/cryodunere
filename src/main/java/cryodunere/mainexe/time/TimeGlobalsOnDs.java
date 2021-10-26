package cryodunere.mainexe.time;

import spice86.emulator.machine.Machine;
import spice86.emulator.reverseengineer.MemoryBasedDataStructureWithDsBaseAddress;

public class TimeGlobalsOnDs extends MemoryBasedDataStructureWithDsBaseAddress {
  public TimeGlobalsOnDs(Machine machine) {
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
}
