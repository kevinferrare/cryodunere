package cryodunere.mainexe.time;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cryodunere.globals.ExtraGlobalsOnDs;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class TimeCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(TimeCode.class);
  private ExtraGlobalsOnDs globals;

  public TimeCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "time", machine);
    globals = new ExtraGlobalsOnDs(machine);
    defineFunction(segment, 0x1AD1, "getSunlightDay", this::getSunlightDay_1ED_1AD1_39A1);
    defineFunction(segment, 0x1AE0, "setHourOfTheDayToAX", this::setHourOfTheDayToAX_1ED_1AE0_39B0);
  }

  public Runnable setHourOfTheDayToAX_1ED_1AE0_39B0() {
    state.setAX(getHourOfTheDay());
    if (LOGGER.isDebugEnabled()) {
      LOGGER.debug("setHourOfTheDayToAX:gameTime:{}, gameHour:{}",
          globals.get1138_0002_Word16_GameElapsedTime(), state.getAX());
    }
    return nearRet();
  }

  /**
   * Puts into AX the day where the sunlight will be seen, either current day or next day.
   */
  public Runnable getSunlightDay_1ED_1AD1_39A1() {
    int elapsed = globals.get1138_0002_Word16_GameElapsedTime();
    int in3Hours = elapsed + 3;
    int day = in3Hours >>> 4;
    state.setAX(day);
    return nearRet();
  }

  public int getHourOfTheDay() {
    return globals.get1138_0002_Word16_GameElapsedTime() & 0xF;
  }
}
