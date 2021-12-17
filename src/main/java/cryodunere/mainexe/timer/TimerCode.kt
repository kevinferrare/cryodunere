package cryodunere.mainexe.timer

import org.slf4j.LoggerFactory
import spice86.emulator.devices.timer.Counter
import spice86.emulator.devices.timer.Timer
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.reverseengineer.JavaOverrideHelper

// Method names contain _ to separate addresses.
class TimerCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int,
  machine: Machine) :
  JavaOverrideHelper(functionInformations, "timer", machine) {

  companion object {
    private val LOGGER = LoggerFactory.getLogger(TimerCode::class.java)
  }

  init {
    defineFunction(segment, 0xE8A8, "setPitTimerToAX") { setPitTimerToAX_ida_1ED_E8A8_10778() }
  }

  fun setPitTimerToAX_ida_1ED_E8A8_10778(): Runnable {
    // Seems only called on quit
    val valueToSet: Int = state.ax
    LOGGER.debug("Setting timer 0 value to {}", valueToSet)
    val timer: Timer = machine.timer
    val counter: Counter = timer.getCounter(0)
    counter.readWritePolicy = 0
    counter.mode = 3
    counter.bcd = 0
    counter.value = valueToSet
    return nearRet()
  }
}