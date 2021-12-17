package cryodunere.mainexe.scriptedscene

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import cryodunere.globals.ExtraGlobalsOnDs
import java.lang.Runnable
import spice86.emulator.memory.MemoryUtils
import org.slf4j.LoggerFactory

// Method names contain _ to separate addresses.
class ScriptedSceneCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int,
  machine: Machine) : JavaOverrideHelper(functionInformations, "scriptedScene", machine) {
  companion object {
    private val LOGGER = LoggerFactory.getLogger(ScriptedSceneCode::class.java)
  }

  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine!!)
    defineFunction(segment, 0x93F,
      "loadAXFromCSUnknownOffset4854AndAdvanceSIAndOffset/intro_script_load_word_ida") { loadSceneSequenceDataIntoAXAndAdvanceSI_1ED_93F_280F() }
    defineFunction(segment, 0x945,
      "setUnknownOffset4854ToSi/intro_script_set_offset_ida") { setSceneSequenceOffsetToSi_1ED_945_2815() }
  }

  /**
   * Called after each scene change in intro whether it is a video or a game scene.<br></br>
   * Loads CS:unknownOffset4854 to AX and advance SI and the unknownOffset4854 to next word.<br></br>
   * Input: SI Output: SI, AX. AX seems to
   */
  fun loadSceneSequenceDataIntoAXAndAdvanceSI_1ED_93F_280F(): Runnable {
    val offset: Int = globals.word16_1138_4854_SceneSequenceOffset
    val address: Int = MemoryUtils.toPhysicalAddress(state.cs, offset)
    val value: Int = memory.getUint16(address)
    state.ax = value
    LOGGER.debug("loadSceneSequenceDataIntoAXAndAdvanceSI: offset:{},value:{}", offset, value)
    // point to next value
    state.si = offset + 2
    // in asm this is done by continuing to setUnknownOffset4854ToSi_1ED_945_2815
    globals.word16_1138_4854_SceneSequenceOffset = state.si
    return nearRet()
  }

  /**
   * Loads SI into unknownOffset4854<br></br>
   * Input: SI.
   */
  fun setSceneSequenceOffsetToSi_1ED_945_2815(): Runnable {
    val offset: Int = state.si
    LOGGER.debug("setUnknownOffset4854ToSi: offset:{}", offset)
    globals.word16_1138_4854_SceneSequenceOffset = offset
    return nearRet()
  }
}