package cryodunere.mainexe.timer;

import cryodunere.globals.ExtraGlobalsOnDs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spice86.emulator.devices.timer.Counter;
import spice86.emulator.devices.timer.InvalidCounterIndexException;
import spice86.emulator.devices.timer.Timer;
import spice86.emulator.function.FunctionInformation;
import spice86.emulator.machine.Machine;
import spice86.emulator.memory.SegmentedAddress;
import spice86.emulator.reverseengineer.JavaOverrideHelper;

import java.util.Map;

// Method names contain _ to separate addresses.
@SuppressWarnings("java:S100")
public class TimerCode extends JavaOverrideHelper {
  private static final Logger LOGGER = LoggerFactory.getLogger(TimerCode.class);

  public TimerCode(Map<SegmentedAddress, FunctionInformation> functionInformations, int segment, Machine machine) {
    super(functionInformations, "timer", machine);
    defineFunction(segment, 0xE8A8, "setPitTimerToAX",
        this::setPitTimerToAX_ida_1ED_E8A8_10778);
  }

  public Runnable setPitTimerToAX_ida_1ED_E8A8_10778() throws InvalidCounterIndexException {
    // Seems only called on quit
    int valueToSet = state.getAX();
    LOGGER.debug("Setting timer 0 value to {}", valueToSet);
    Timer timer = machine.getTimer();
    Counter counter = timer.getCounter(0);
    counter.setReadWritePolicy(0);
    counter.setMode(3);
    counter.setBcd(0);
    counter.setValue(valueToSet);
    return nearRet();
  }
}
