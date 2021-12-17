package cryodunere.mainexe.datastructures

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import java.lang.Runnable
import spice86.emulator.memory.MemoryUtils
import spice86.emulator.reverseengineer.Uint16Array

// Method names contain _ to separate addresses.
class DatastructuresCode(
  functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int,
  machine: Machine
) : JavaOverrideHelper(functionInformations, "datastructures", machine) {
  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine)
    defineFunction(segment, 0x98,
      "convertIndexTableToPointerTable/adjust_sub_resource_pointers_ida") { convertIndexTableToPointerTable_1ED_98_1F68() }
    defineFunction(segment, 0xC1F4, "getEsSiPointerToUnknown") { esSiPointerToUnknown_1ED_C1F4_E0C4 }
  }

  /**
   * Inputs:<br></br>
   * - ES:DI: Points to array with first cell filled with size in bytes.<br></br>
   * - DI: increment value to add to each word of the array (even 1st)<br></br>
   * Algorithm:<br></br>
   * `
   * ptr = ES:DI<br></br>
   * size = ptr[0] / sizeof(uint16)<br></br>
   * for(int i=0;i<size></size>;i++) {
   * ptr[i]+=ptr;
   * }
  ` * <br></br>
   * Use case is probably a data structure with indexes loaded from a file to memory. Those indexes would be transformed
   * to pointers to the actual data with this method.
   */
  fun convertIndexTableToPointerTable_1ED_98_1F68(): Runnable {
    val initialAddress: Int = MemoryUtils.toPhysicalAddress(state.es, state.di)
    // wtf
    val increment: Int = state.di
    val count: Int = memory.getUint16(initialAddress) / 2
    val array: Uint16Array = Uint16Array(memory, initialAddress, count)
    array.forEach { v: Int -> v + increment }
    return nearRet()
  } // TODO: create a proper data structure with more organized accessors when what this is is known better.

  /**
   * AX is an index. At this index there is an offset<br></br>
   * offset = DS:DBB0[AX*2]<br></br>
   * Input: AX (index for a word array)<br></br>
   * Output: ES:SI<br></br>
   * Algorithm:<br></br>
   * `
   * ptr = *DS:DBB0
   * ES:SI = ptr+ptr[ax*2]
  ` *
   */
  val esSiPointerToUnknown_1ED_C1F4_E0C4: Runnable
    get() {
      // TODO: create a proper data structure with more organized accessors when what this is is known better.
      val index: Int = state.ax
      val baseAddress: SegmentedAddress = globals.dword32Ptr_1138_DBB0_spriteSheetResourcePointer
      val resOffset: Int = baseAddress.offset + memory.getUint16(baseAddress.toPhysical() + index * 2)
      state.es = baseAddress.segment
      state.si = resOffset
      return nearRet()
    }
}