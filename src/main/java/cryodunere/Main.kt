package cryodunere

import kotlin.jvm.JvmStatic
import spice86.ui.Spice86Application

object Main {
  private const val SUPPORTED_EXE_CHECKSUM = "5F30AEB84D67CF2E053A83C09C2890F010F2E25EE877EBEC58EA15C5B30CFFF9"
  @JvmStatic fun main(args: Array<String>) {
    Spice86Application.runWithOverrides(args, DuneCdOverrideSupplier::class.java, SUPPORTED_EXE_CHECKSUM)
  }
}