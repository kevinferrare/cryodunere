package cryodunere.mainexe.sound

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import cryodunere.sound.SoundDriverCode
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import java.lang.Runnable
import spice86.emulator.cpu.SegmentRegisters

// Method names contain _ to separate addresses.
class SoundCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int, machine: Machine,
  private val soundDriver: SoundDriverCode) : JavaOverrideHelper(functionInformations, "sound", machine) {
  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine)
    defineFunction(segment, 0xAC30,
      "soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida") { soundDriverUnknownClearAL_1ED_AC30_CB00() }
    defineFunction(segment, 0xAEB7, "checkSoundPresent/midi_func_2_0_ida") { checkSoundPresent_1ED_AEB7_CD87() }
  }

  fun soundDriverUnknownClearAL_1ED_AC30_CB00(): Runnable {
    // Called at scene change
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3999, soundDriver.baseSegment1, 0x10C)
    soundDriver.clearAL_4822_10C_4832C()
    return nearRet()
  }

  fun checkSoundPresent_1ED_AEB7_CD87(): Runnable {
    // Called before videos
    checkVtableContainsExpected(SegmentRegisters.DS_INDEX, 0x3975, soundDriver.baseSegment2, 0x106)
    globals.byte8_1138_DBCB = 0
    soundDriver.clearAL_482B_106_483B6()
    globals.byte8_1138_DBCD_IsSoundPresent = state.al
    return nearRet()
  }
}