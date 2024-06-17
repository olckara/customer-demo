package com.karaduman.demo.util;

import static com.karaduman.demo.util.CharacterGenerationUtils.numberGenerator;

public class IbanUtils {
  public static String generateIban(String countryCode, String bankCode) {
    return countryCode.substring(0,2) + numberGenerator.generate(2) + bankCode.substring(0,4) + numberGenerator.generate(10);
  }
}
