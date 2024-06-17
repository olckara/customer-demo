package com.karaduman.demo.util;

import org.junit.jupiter.api.Test;

import static com.karaduman.demo.util.CharacterGenerationUtils.LOWER_CASE_LETTERS;
import static com.karaduman.demo.util.CharacterGenerationUtils.NUMBERS;
import static com.karaduman.demo.util.CharacterGenerationUtils.SPECIAL_CHARACTERS;
import static com.karaduman.demo.util.CharacterGenerationUtils.UPPER_CASE_LETTERS;
import static com.karaduman.demo.util.CharacterGenerationUtils.lowerCaseGenerator;
import static com.karaduman.demo.util.CharacterGenerationUtils.numberGenerator;
import static com.karaduman.demo.util.CharacterGenerationUtils.specialCharGenerator;
import static com.karaduman.demo.util.CharacterGenerationUtils.upperCaseGenerator;
import static org.assertj.core.api.Assertions.assertThat;

class CharacterGenerationUtilsTest {

  @Test
  void specialCharacterGenerationTest() {
    assertThat(specialCharGenerator.generate(1))
        .isNotBlank()
        .doesNotContainAnyWhitespaces()
        .hasSize(1)
        .containsAnyOf(SPECIAL_CHARACTERS.split(""));
  }

  @Test
  void lowerCaseGenerationTest() {
    assertThat(lowerCaseGenerator.generate(1))
        .isNotBlank()
        .doesNotContainAnyWhitespaces()
        .hasSize(1)
        .containsAnyOf(LOWER_CASE_LETTERS.split(""));
  }

  @Test
  void upperCaseGenerationTest() {
    assertThat(upperCaseGenerator.generate(1))
        .isNotBlank()
        .doesNotContainAnyWhitespaces()
        .hasSize(1)
        .containsAnyOf(UPPER_CASE_LETTERS.split(""));
  }

  @Test
  void numberGenerationTest() {
    assertThat(numberGenerator.generate(1))
        .isNotBlank()
        .doesNotContainAnyWhitespaces()
        .hasSize(1)
        .containsAnyOf(NUMBERS.split(""));
  }


}