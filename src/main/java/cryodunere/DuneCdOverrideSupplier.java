package cryodunere;

import java.util.HashMap;
import java.util.Map;

import cryodunere.mainexe.UnknownCode;
import cryodunere.mainexe.dialogues.DialoguesCode;
import cryodunere.mainexe.disk.DatastructuresCode;
import cryodunere.mainexe.display.DisplayCode;
import cryodunere.mainexe.init.InitCode;
import cryodunere.mainexe.map.MapCode;
import cryodunere.mainexe.menu.MenuCode;
import cryodunere.mainexe.scriptedscene.ScriptedSceneCode;
import cryodunere.mainexe.sound.SoundCode;
import cryodunere.mainexe.time.TimeCode;
import cryodunere.mainexe.video.VideoCode;
import cryodunere.sound.SoundDriverCode;
import cryodunere.vgadriver.VgaDriverCode;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.function.OverrideSupplier;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

/**
 * Re-implementation of CRYO Dune CD version.<br/>
 * SHA256 signature of supported dncdprg.exe: 5f30aeb84d67cf2e053a83c09c2890f010f2e25ee877ebec58ea15c5b30cfff9
 */
@SuppressWarnings("java:S100")
public class DuneCdOverrideSupplier implements OverrideSupplier {
  @Override
  public Map<SegmentedAddress, FunctionInformation> generateFunctionInformations(int programStartSegment,
      Machine machine) {
    Map<SegmentedAddress, FunctionInformation> res = new HashMap<>();
    createOverrides(programStartSegment, machine, res);
    return res;
  }

  private final void createOverrides(int programStartSegment, Machine machine,
      Map<SegmentedAddress, FunctionInformation> res) {
    new JavaOverrideHelper(res, "providedInterrupts", machine).setProvidedInterruptHandlersAsOverridden();
    SoundDriverCode soundDriver = new SoundDriverCode(res, programStartSegment, machine);
    VgaDriverCode vgaDriver = new VgaDriverCode(res, programStartSegment, machine);
    new UnknownCode(res, programStartSegment, machine);
    new MenuCode(res, programStartSegment, machine);
    new ScriptedSceneCode(res, programStartSegment, machine);
    new MapCode(res, programStartSegment, machine);
    new DialoguesCode(res, programStartSegment, machine);
    new DisplayCode(res, programStartSegment, machine, vgaDriver);
    new VideoCode(res, programStartSegment, machine);
    new InitCode(res, programStartSegment, machine);
    new DatastructuresCode(res, programStartSegment, machine);
    new TimeCode(res, programStartSegment, machine);
    new SoundCode(res, programStartSegment, machine, soundDriver);
  }

  @Override
  public String toString() {
    return "Overrides for Dune CD exe. class is " + this.getClass().getCanonicalName();
  }
}
