package cryodunere.mainexe.disk;

import java.util.Map;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.MemoryUtils;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;
import spice86.emulator.reverseengineer.Uint16Array;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class DatastructuresCode extends JavaOverrideHelper {
  private DatastructuresGlobalsOnDs globals;

  public DatastructuresCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment,
      Machine machine) {
    super(functionInformations, "datastructures", machine);
    globals = new DatastructuresGlobalsOnDs(machine);
    defineFunction(segment, 0x98, "convertIndexTableToPointerTable",
        this::convertIndexTableToPointerTable_0x1ED_0x98_0x1F68);
    defineFunction(segment, 0xC1F4, "getEsSiPointerToUnknown", this::getEsSiPointerToUnknown_0x1ED_0xC1F4_0xE0C4);
  }

  /**
   * Inputs:<br/>
   * - ES:DI: Points to array with first cell filled with size in bytes.<br/>
   * - DI: increment value to add to each word of the array (even 1st)<br/>
   * Algorithm:<br/>
   * <code>
   * ptr = ES:DI<br/>
   * size = ptr[0] / sizeof(uint16)<br/>
   * for(int i=0;i<size;i++) {
   *   ptr[i]+=ptr;
   * }
   * </code><br/>
   * Use case is probably a data structure with indexes loaded from a file to memory. Those indexes would be transformed
   * to pointers to the actual data with this method.
   */
  public Runnable convertIndexTableToPointerTable_0x1ED_0x98_0x1F68() {
    int initialAddress = MemoryUtils.toPhysicalAddress(state.getES(), state.getDI());
    // wtf
    int increment = state.getDI();
    int count = memory.getUint16(initialAddress) / 2;
    Uint16Array array = new Uint16Array(memory, initialAddress, count);
    array.forEach(v -> v + increment);
    return nearRet();
  }

  /**
   * AX is an index. At this index there is an offset<br/>
   * offset = tDBB0[ax*2]<br/>
   * Input: AX (index for a word array)<br/>
   * Output: ES:SI<br/>
   * Algorithm:<br/>
   * <code>
   * ptr = *DBB0
   * ES:SI = ptr+ptr[ax*2]
   * </code>
   */
  public Runnable getEsSiPointerToUnknown_0x1ED_0xC1F4_0xE0C4() {
    // TODO: create a proper data structure with more organized accessors when what this is is known better.
    int index = state.getAX();
    SegmentedAddress baseAddress = globals.getStructureSegmentedAddressDBB0();
    int resOffset = baseAddress.getOffset() + memory.getUint16(baseAddress.toPhysical() + index * 2);
    state.setES(baseAddress.getSegment());
    state.setSI(resOffset);
    return nearRet();
  }
}
