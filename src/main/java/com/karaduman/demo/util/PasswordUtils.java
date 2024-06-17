package com.karaduman.demo.util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.karaduman.demo.util.CharacterGenerationUtils.lowerCaseGenerator;
import static com.karaduman.demo.util.CharacterGenerationUtils.numberGenerator;
import static com.karaduman.demo.util.CharacterGenerationUtils.specialCharGenerator;
import static com.karaduman.demo.util.CharacterGenerationUtils.upperCaseGenerator;

public class PasswordUtils {

  public static String generatePassword(Integer passwordLength) {
    // Safe-guarding the input parameters to narrow down the risks still getting the job done according to my needs
    if (passwordLength < 4) { // I want every password to have at least one of each character type
      passwordLength = 4;
    } else if (passwordLength > 12) { // I tested it with Integer.MAX_VALUE, and it was taking very long time :)
      passwordLength = 12;
    }

    // Using a simple integer division trick to generate characters with similar occurrence
    // Although this is not right as these should be also randomized for better security but this is coming handy now
    List<String> specialChars = Arrays.asList(specialCharGenerator.generate(passwordLength / 4).split(""));
    List<String> upperCases = Arrays.asList(upperCaseGenerator.generate(passwordLength / 4).split(""));
    List<String> lowerCases = Arrays.asList(lowerCaseGenerator.generate(passwordLength / 4).split(""));
    List<String> numbers = Arrays.asList(numberGenerator.generate(passwordLength / 4).split(""));

    List<String> password = new ArrayList<>();

    password.addAll(specialChars);
    password.addAll(upperCases);
    password.addAll(lowerCases);
    password.addAll(numbers);

    // Because of integer division trick I used above, division results rounded down so numbers don't add up.
    // adding more random lowercase letters to quickly solve this
    while (password.size() < passwordLength) {
      password.add(lowerCaseGenerator.generate(1));
    }

    // Shuffling so characters are not in the same order as they're appended together
    Collections.shuffle(password);

    return StringUtils.join(password, "");
  }
}
