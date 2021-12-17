package cryodunere.mainexe.time

import cryodunere.globals.ExtraGlobalsOnDs
import org.slf4j.LoggerFactory
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.reverseengineer.JavaOverrideHelper

// Method names contain _ to separate addresses.
class TimeCode(functionInformations: MutableMap<SegmentedAddress, FunctionInformation>, segment: Int,
  machine: Machine) :
  JavaOverrideHelper(functionInformations, "time", machine) {

  companion object {
    private val LOGGER = LoggerFactory.getLogger(TimeCode::class.java)
  }

  private val globals: ExtraGlobalsOnDs

  init {
    globals = ExtraGlobalsOnDs(machine!!)
    defineFunction(segment, 0x1AD1, "getSunlightDay") { getSunlightDay_1ED_1AD1_39A1() }
    defineFunction(segment, 0x1AE0, "setHourOfTheDayToAX") { setHourOfTheDayToAX_1ED_1AE0_39B0() }
  }

  fun setHourOfTheDayToAX_1ED_1AE0_39B0(): Runnable {
    state.ax = hourOfTheDay
    if (LOGGER.isDebugEnabled) {
      LOGGER.debug("setHourOfTheDayToAX:gameTime:{}, gameHour:{}",
        globals.word16_1138_0002_GameElapsedTime, state.ax)
    }
    return nearRet()
  }

  /**
   * Puts into AX the day where the sunlight will be seen, either current day or next day.
   */
  fun getSunlightDay_1ED_1AD1_39A1(): Runnable {
    val elapsed: Int = globals.word16_1138_0002_GameElapsedTime
    val in3Hours: Int = elapsed + 3
    val day: Int = in3Hours ushr 4
    state.ax = day
    return nearRet()
  }

  val hourOfTheDay: Int
    get() = globals.word16_1138_0002_GameElapsedTime and 0xF
}