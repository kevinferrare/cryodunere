package cryodunere.mainexe.time;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class TimeCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(TimeCode.class);
  private TimeGlobalsOnDs globals;

  public TimeCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "time", machine);
    globals = new TimeGlobalsOnDs(machine);
    defineFunction(segment, 0x1AD1, "getSunlightDay", this::getSunlightDay_0x1ED_0x1AD1_0x39A1);
    defineFunction(segment, 0x1AE0, "setHourOfTheDayToAX", this::setHourOfTheDayToAX_0x1ED_0x1AE0_0x39B0);
  }

  public Runnable setHourOfTheDayToAX_0x1ED_0x1AE0_0x39B0() {
    state.setAX(globals.get0002HourOfTheDay());
    if (LOGGER.isDebugEnabled()) {
      LOGGER.debug("setHourOfTheDayToAX:gameTime:{}, gameHour:{}", globals.get0002GameElapsedTime(), state.getAX());
    }
    return nearRet();
  }

  /**
   * Puts into AX the day where the sunlight will be seen, either current day or next day.
   * 
   * @return
   */
  public Runnable getSunlightDay_0x1ED_0x1AD1_0x39A1() {
    int elapsed = globals.get0002GameElapsedTime();
    int in3Hours = elapsed + 3;
    int day = in3Hours >>> 4;
    state.setAX(day);
    return nearRet();
  }
}
