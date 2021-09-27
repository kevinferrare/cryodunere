package cryodunere.mainexe.map;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.MemoryUtils;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;
import spice86.utils.ConvertUtils;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class MapRelated extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(MapRelated.class);
  public static final int CLICK_HANDLER_INGAME = 0x2572;
  public static final int CLICK_HANDLER_FLAT_MAP = 0x1A9E;
  public static final int CLICK_HANDLER_ORNI_MAP = 0x1AC8;
  public static final int CLICK_HANDLER_MOVE_TROOP_MAP = 0x1AAC;
  public static final int CLICK_HANDLER_GLOBE_MAP = 0x2562;

  private MapGlobalsOnDs mapGlobalsOnDs;

  public MapRelated(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "map", machine);
    this.mapGlobalsOnDs = new MapGlobalsOnDs(machine);

    defineFunction(segment, 0xD95B, "setMapClickHandlerAddressToInGame",
        this::setMapClickHandlerAddressToInGame_0x1ED_0xD95B_0xF82B);
    defineFunction(segment, 0xD95E, "setMapClickHandlerAddressFromAx",
        this::setMapClickHandlerAddressFromAx_0x1ED_0xD95E_0xF82E);
    defineFunction(segment, 0xDAA3, "initMapCursorTypeDC58To0", this::initMapCursorTypeDC58To0_0x1ED_0xDAA3_0xF973);
    defineFunction(segment, 0xDAAA, "setSiToMapCursorTypeDC58", this::setSiToMapCursorTypeDC58_0x1ED_0xDAAA_0xF97A);
    defineFunction(segment, 0x5B96, "unknownMemcopy", this::unknownMemcopy_0x1ED_0x5B96_0x7A66);
  }

  public Runnable unknownMemcopy_0x1ED_0x5B96_0x7A66() {
    // Called on map display / move, data to be copied never seems to change.
    int sourceAddress = MemoryUtils.toPhysicalAddress(state.getDS(), 0x46e3);
    int destinationAddress = MemoryUtils.toPhysicalAddress(state.getDS(), state.getDI());
    memory.memCopy(sourceAddress, destinationAddress, 4 * 2);
    return nearRet();
  }

  public Runnable setMapClickHandlerAddressToInGame_0x1ED_0xD95B_0xF82B() {
    // called when starting to fly the orni, exiting maps and when switching from intro to game
    // at load time
    // See setMapClickHandlerAddressFromAx_0x1ED_0xD95E_0xF82E
    state.setAX(CLICK_HANDLER_INGAME);
    return setMapClickHandlerAddressFromAx_0x1ED_0xD95E_0xF82E();
  }

  /**
   * Sets map click handler address from AX. This value determines what happens when you click on the map and the code
   * seems to jump to it somehow.
   * <ul>
   * <li>Entering and moving map, clicking on find prospectors (AX=0x1A9E)</li>
   * <li>Entering Orni screen (AX=1AC8)</li>
   * <li>Entering move troop screen, but not spice density screen (AX=1AAC)</li>
   * <li>Entering globe screens (AX=0x2562)</li>
   * </ul>
   * Inputs:
   * <ul>
   * <li>DS segment for value set</li>
   * <li>AX: value to set</li>
   * </ul>
   */
  public Runnable setMapClickHandlerAddressFromAx_0x1ED_0xD95E_0xF82E() {
    mapGlobalsOnDs.setMapClickHandlerAddress2570(state.getAX());

    if (LOGGER.isDebugEnabled()) {
      LOGGER.debug("setMapClickHandlerAddressFromAx: DS:{}, AX:{}", ConvertUtils.toHex16(state.getDS()),
          ConvertUtils.toHex16(state.getAX()));
    }
    return nearRet();
  }

  public Runnable setSiToMapCursorTypeDC58_0x1ED_0xDAAA_0xF97A() {
    // when taking an orni: 0x149C, when loading globe or results: 0x2448
    int value = state.getSI();
    if (LOGGER.isDebugEnabled()) {
      LOGGER.debug("setSiToMapCursorTypeDC58: value:{}", ConvertUtils.toHex16(value));
    }
    this.mapGlobalsOnDs.setMapCursorTypeDC58(value);
    return nearRet();
  }

  public Runnable initMapCursorTypeDC58To0_0x1ED_0xDAA3_0xF973() {
    // when 0 or any other value, map cursor is disabled for globe / orni.
    this.mapGlobalsOnDs.setMapCursorTypeDC58(0);
    return nearRet();
  }
}
