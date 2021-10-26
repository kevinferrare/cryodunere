package cryodunere.mainexe.disk;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.MemoryUtils;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class DiskCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(DiskCode.class);
  private DiskGlobalsOnDs globals;

  public DiskCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "disk", machine);
    globals = new DiskGlobalsOnDs(machine);
    defineFunction(segment, 0xC1F4, "getEsSiPointerToUnknown", this::getEsSiPointerToUnknown_0x1ED_0xC1F4_0xE0C4);
  }

  /**
   * AX is an index. At this index there is an offset<br/>
   * offset = tDBB0[ax*2]<br/>
   * Input: AX (index for a word array)<br/>
   * Output: ES:SI
   * 
   * @return
   */
  public Runnable getEsSiPointerToUnknown_0x1ED_0xC1F4_0xE0C4() {
    // TODO: create a proper data structure with more organized accessors when what this is is known better.
    int indexOfOffset = state.getAX() * 2;
    SegmentedAddress baseAddress = globals.getStructureSegmentedAddressDBB0();
    int indexAddress =
        MemoryUtils.toPhysicalAddress(baseAddress.getSegment(), baseAddress.getOffset() + indexOfOffset);
    int offset = memory.getUint16(indexAddress);
    int finalOffsetInDataStructure = baseAddress.getOffset() + offset;
    state.setES(baseAddress.getSegment());
    state.setSI(finalOffsetInDataStructure);
    LOGGER.debug("unknown startAddress={},indexOfOffset={},offset={},finalOffsetInDataStructure={}", baseAddress,
        indexOfOffset,
        offset, finalOffsetInDataStructure);
    return nearRet();
  }
}
