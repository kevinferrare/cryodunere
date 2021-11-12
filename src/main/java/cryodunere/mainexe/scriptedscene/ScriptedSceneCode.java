package cryodunere.mainexe.scriptedscene;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cryodunere.globals.ExtraGlobalsOnDs;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.MemoryUtils;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class ScriptedSceneCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(ScriptedSceneCode.class);
  private ExtraGlobalsOnDs globals;

  public ScriptedSceneCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment,
      Machine machine) {
    super(functionInformations, "scriptedScene", machine);
    globals = new ExtraGlobalsOnDs(machine);
    defineFunction(segment, 0x93F, "loadAXFromCSUnknownOffset4854AndAdvanceSIAndOffset/intro_script_load_word_ida",
        this::loadSceneSequenceDataIntoAXAndAdvanceSI_1ED_93F_280F);
    defineFunction(segment, 0x945, "setUnknownOffset4854ToSi/intro_script_set_offset_ida",
        this::setSceneSequenceOffsetToSi_1ED_945_2815);
  }

  /**
   * Called after each scene change in intro whether it is a video or a game scene.<br/>
   * Loads CS:unknownOffset4854 to AX and advance SI and the unknownOffset4854 to next word.<br/>
   * Input: SI Output: SI, AX. AX seems to
   */
  public Runnable loadSceneSequenceDataIntoAXAndAdvanceSI_1ED_93F_280F() {
    int offset = globals.get1138_4854_Word16_SceneSequenceOffset();
    int address = MemoryUtils.toPhysicalAddress(state.getCS(), offset);
    int value = memory.getUint16(address);
    state.setAX(value);
    LOGGER.debug("loadSceneSequenceDataIntoAXAndAdvanceSI: offset:{},value:{}", offset, value);
    // point to next value
    state.setSI(offset + 2);
    // in asm this is done by continuing to setUnknownOffset4854ToSi_1ED_945_2815
    globals.set1138_4854_Word16_SceneSequenceOffset(state.getSI());
    return nearRet();
  }

  /**
   * Loads SI into unknownOffset4854<br/>
   * Input: SI.
   */
  public Runnable setSceneSequenceOffsetToSi_1ED_945_2815() {
    int offset = state.getSI();
    LOGGER.debug("setUnknownOffset4854ToSi: offset:{}", offset);
    globals.set1138_4854_Word16_SceneSequenceOffset(offset);
    return nearRet();
  }
}
