package cryodunere.mainexe.video;

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
public class Video extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(Video.class);
  private VideoGlobalsOnDs globalsOnDs;

  public Video(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "scriptedScene", machine);
    this.globalsOnDs = new VideoGlobalsOnDs(machine);
    defineFunction(segment, 0xC921, "read33A3WithAxOffset", this::read33A3WithAxOffset_0x1ED_0xC921_0xE7F1);
    defineFunction(segment, 0xCA59, "videoPlayRelated", this::videoPlayRelated_0x1ED_0xCA59_0xE929);
    defineFunction(segment, 0xCC85, "isLastFrame", this::isLastFrame_0x1ED_0xCC85_0xEB55);
  }

  public Runnable isLastFrame_0x1ED_0xCC85_0xEB55() {
    int value = globalsOnDs.getDBE7();
    LOGGER.debug("DBE7={}", value);
    state.setZeroFlag(value == 0 || value == 1);
    return nearRet();
  }

  /**
   * Reads value at DS:(AX*2)+0x33A3 and returns it in BX
   */
  public Runnable read33A3WithAxOffset_0x1ED_0xC921_0xE7F1() {
    // Only executed when a video starts
    int offset = state.getAX() * 2 + 0x33A3;
    int address = MemoryUtils.toPhysicalAddress(state.getDS(), offset);
    int value = memory.getUint16(address);
    LOGGER.debug("read33A3WithAxOffset {} {} {}", state.getAX(), address, value);
    state.setBX(value);
    return nearRet();
  }

  public Runnable videoPlayRelated_0x1ED_0xCA59_0xE929() {
    // seems to have no impact what so ever is done here. Only executed during videos
    int value = globalsOnDs.getCE7AVideoPlayRelatedIndex();
    globalsOnDs.setDC22VideoPlayRelatedIndex(value);
    LOGGER.debug("videoPlayRelated value:{}", value);
    return nearRet();
  }
}
