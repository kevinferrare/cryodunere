package cryodunere;

import spice86.ui.Spice86Application;

public class Main {
  private static final String SUPPORTED_EXE_CHECKSUM =
      "5F30AEB84D67CF2E053A83C09C2890F010F2E25EE877EBEC58EA15C5B30CFFF9";

  public static void main(String[] args) {
    Spice86Application.runWithOverrides(args, DuneCdOverrideSupplier.class, SUPPORTED_EXE_CHECKSUM);
  }
}
