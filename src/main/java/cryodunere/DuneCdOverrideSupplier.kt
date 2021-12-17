package cryodunere

import spice86.emulator.function.OverrideSupplier
import spice86.emulator.machine.Machine
import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import java.util.HashMap
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.sound.SoundDriverCode
import cryodunere.vgadriver.VgaDriverCode
import cryodunere.mainexe.UnknownCode
import cryodunere.mainexe.menu.MenuCode
import cryodunere.mainexe.scriptedscene.ScriptedSceneCode
import cryodunere.mainexe.map.MapCode
import cryodunere.mainexe.dialogues.DialoguesCode
import cryodunere.mainexe.display.DisplayCode
import cryodunere.mainexe.video.HnmCode
import cryodunere.mainexe.video.VideoCode
import cryodunere.mainexe.init.InitCode
import cryodunere.mainexe.datastructures.DatastructuresCode
import cryodunere.mainexe.time.TimeCode
import cryodunere.mainexe.sound.SoundCode
import cryodunere.mainexe.timer.TimerCode
import cryodunere.StaticDefinitions

/**
 * Re-implementation of CRYO Dune CD version.<br></br>
 * SHA256 signature of supported dncdprg.exe: 5f30aeb84d67cf2e053a83c09c2890f010f2e25ee877ebec58ea15c5b30cfff9
 */
class DuneCdOverrideSupplier : OverrideSupplier {
  override fun generateFunctionInformations(programStartSegment: Int,
    machine: Machine): MutableMap<SegmentedAddress, FunctionInformation> {
    val res: MutableMap<SegmentedAddress, FunctionInformation> = HashMap()
    createOverrides(programStartSegment, machine, res)
    return res
  }

  private fun createOverrides(programStartSegment: Int, machine: Machine,
    res: MutableMap<SegmentedAddress, FunctionInformation>) {
    JavaOverrideHelper(res, "providedInterrupts", machine).setProvidedInterruptHandlersAsOverridden()
    val soundDriver = SoundDriverCode(res, programStartSegment, machine)
    val vgaDriver = VgaDriverCode(res, programStartSegment, machine)
    UnknownCode(res, programStartSegment, machine)
    MenuCode(res, programStartSegment, machine)
    ScriptedSceneCode(res, programStartSegment, machine)
    MapCode(res, programStartSegment, machine)
    DialoguesCode(res, programStartSegment, machine)
    DisplayCode(res, programStartSegment, machine, vgaDriver)
    HnmCode(res, programStartSegment, machine)
    VideoCode(res, programStartSegment, machine)
    InitCode(res, programStartSegment, machine)
    DatastructuresCode(res, programStartSegment, machine)
    TimeCode(res, programStartSegment, machine)
    SoundCode(res, programStartSegment, machine, soundDriver)
    TimerCode(res, programStartSegment, machine)
    StaticDefinitions(res, programStartSegment, machine)
  }

  override fun toString(): String {
    return "Overrides for Dune CD exe. class is " + this.javaClass.canonicalName
  }
}