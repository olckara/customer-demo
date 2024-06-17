package com.karaduman.demo.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.karaduman.demo.util.CharacterGenerationUtils.LOWER_CASE_LETTERS;
import static com.karaduman.demo.util.CharacterGenerationUtils.NUMBERS;
import static com.karaduman.demo.util.CharacterGenerationUtils.SPECIAL_CHARACTERS;
import static com.karaduman.demo.util.CharacterGenerationUtils.UPPER_CASE_LETTERS;
import static org.assertj.core.api.Assertions.assertThat;

class PasswordUtilsTest {

  @ParameterizedTest
  @ValueSource(ints = {5, 6, 7, 10, 12})
  void testGeneratePassword(Integer passwordLength) {
    String password = PasswordUtils.generatePassword(passwordLength);
    assertThat(password)
        .isNotBlank()
        .doesNotContainAnyWhitespaces()
        .hasSize(passwordLength)
        .containsAnyOf(SPECIAL_CHARACTERS.split(""))
        .containsAnyOf(NUMBERS.split(""))
        .containsAnyOf(UPPER_CASE_LETTERS.split(""))
        .containsAnyOf(LOWER_CASE_LETTERS.split(""));
  }

}