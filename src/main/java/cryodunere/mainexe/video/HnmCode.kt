package cryodunere.mainexe.video

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import java.lang.Runnable
import spice86.emulator.interrupthandlers.dos.DosFileManager
import org.slf4j.LoggerFactory
import spice86.emulator.interrupthandlers.dos.DosFileOperationResult

// Method names contain _ to separate addresses.
class HnmCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int, machine: Machine) :
  JavaOverrideHelper(functionInformations, "hnm", machine) {
  companion object {
    private val LOGGER = LoggerFactory.getLogger(HnmCode::class.java)
  }

  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine!!)
    defineFunction(segment, 0xCDBF, "hnmReadFromFileHandle") { hnmReadFromFileHandle_1ED_CDBF_EC8F() }
  }

  fun hnmReadFromFileHandle_1ED_CDBF_EC8F(): Runnable {
    val dosFileManager: DosFileManager = machine.dosInt21Handler.dosFileManager
    val fileHandle: Int = globals.word16_1138_35A6_IsAnimateMenuUnneeded
    if (fileHandle == 0) {
      return nearRet()
    }
    val readLength: Int = state.cx
    val offset: Int = globals.dword32_1138_DC04_hnmFileOffset
    val targetMemory: Int = globals.dword32Ptr_1138_DC0C_hnmFileReadBufferSegment.toPhysical()
    LOGGER.debug("Read {} bytes from hnm file handle {} at offset {}", readLength, fileHandle, offset)
    dosFileManager.moveFilePointerUsingHandle(0, fileHandle, offset)
    val result: DosFileOperationResult = dosFileManager.readFile(fileHandle, readLength, targetMemory)
    val actualReadLength: Int = result.value
    if (actualReadLength != readLength) {
      failAsUntested("The original code loops here when read bytes from hnm are not as expected.")
    }
    globals.dword32_1138_DC08_hnmFileRemain -= actualReadLength
    globals.dword32_1138_DC04_hnmFileOffset += actualReadLength
    globals.word16_1138_DC0C_hnmFileReadBufferSegment += actualReadLength
    globals.word16_1138_DC1A += actualReadLength
    return nearRet()
  }
}