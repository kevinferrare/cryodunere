package cryodunere.mainexe.video;

import cryodunere.globals.ExtraGlobalsOnDs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.interrupthandlers.dos.DosFileManager;
import spice86.emulator.interrupthandlers.dos.DosFileOperationResult;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

import java.util.Map;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class HnmCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(HnmCode.class);
  private ExtraGlobalsOnDs globals;

  public HnmCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "hnm", machine);
    this.globals = new ExtraGlobalsOnDs(machine);
    defineFunction(segment, 0xCDBF, "hnmReadFromFileHandle", this::hnmReadFromFileHandle_1ED_CDBF_EC8F);
  }

  public Runnable hnmReadFromFileHandle_1ED_CDBF_EC8F() {
    DosFileManager dosFileManager = machine.getDosInt21Handler().getDosFileManager();
    int fileHandle = globals.get1138_35A6_Word16_IsAnimateMenuUnneeded();
    if (fileHandle == 0) {
      return nearRet();
    }
    int readLength = state.getCX();
    int offset = globals.get1138_DC04_DWord32_hnmFileOffset();
    int targetMemory = globals.getPtr1138_DC0C_Dword32_hnmFileReadBufferSegment().toPhysical();
    LOGGER.debug("Read {} bytes from hnm file handle {} at offset {}", readLength, fileHandle, offset);
    dosFileManager.moveFilePointerUsingHandle(0, fileHandle, offset);
    DosFileOperationResult result = dosFileManager.readFile(fileHandle, readLength, targetMemory);
    int actualReadLength = result.getValue();
    if (actualReadLength != readLength) {
      this.failAsUntested("The original code loops here when read bytes from hnm are not as expected.");
    }
    globals.set1138_DC08_DWord32_hnmFileRemain(globals.get1138_DC08_DWord32_hnmFileRemain() - actualReadLength);
    globals.set1138_DC04_DWord32_hnmFileOffset(offset + actualReadLength);
    globals.set1138_DC0C_Word16_hnmFileReadBufferSegment(globals.get1138_DC0C_Word16_hnmFileReadBufferSegment()+actualReadLength);
    globals.set1138_DC1A_Word16(globals.get1138_DC1A_Word16()+actualReadLength);
    return nearRet();
  }
}
