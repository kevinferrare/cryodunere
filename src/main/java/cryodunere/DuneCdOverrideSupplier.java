package cryodunere;

import java.util.HashMap;
import java.util.Map;

import cryodunere.mainexe.MainCode;
import cryodunere.mainexe.dialogues.Dialogues;
import cryodunere.mainexe.display.Display;
import cryodunere.mainexe.init.Init;
import cryodunere.mainexe.map.MapRelated;
import cryodunere.mainexe.menu.Menu;
import cryodunere.mainexe.scriptedscene.ScriptedScene;
import cryodunere.mainexe.video.Video;
import cryodunere.sound.SoundDriver;
import cryodunere.vgadriver.VgaDriver;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.function.OverrideSupplier;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;

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
    SoundDriver soundDriver = new SoundDriver(res, programStartSegment, machine);
    VgaDriver vgaDriver = new VgaDriver(res, programStartSegment, machine);
    new MainCode(res, programStartSegment, machine, vgaDriver, soundDriver);
    new Menu(res, programStartSegment, machine);
    new ScriptedScene(res, programStartSegment, machine);
    new MapRelated(res, programStartSegment, machine);
    new Dialogues(res, programStartSegment, machine);
    new Display(res, programStartSegment, machine, vgaDriver);
    new Video(res, programStartSegment, machine);
    new Init(res, programStartSegment, machine);
    return res;
  }

  @Override
  public String toString() {
    return "Overrides for Dune CD exe. class is " + this.getClass().getCanonicalName();
  }
}
