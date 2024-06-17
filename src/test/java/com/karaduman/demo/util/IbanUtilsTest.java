package com.karaduman.demo.util;

import org.junit.jupiter.api.Test;

import static com.karaduman.demo.util.IbanUtils.generateIban;
import static org.assertj.core.api.Assertions.assertThat;

class IbanUtilsTest {

  @Test
  void generateIbanTest() {
    assertThat(generateIban("NL", "ABNA"))
        .hasSize(18)
        .doesNotContainAnyWhitespaces()
        .containsOnlyOnce("NL")
        .containsOnlyOnce("ABNA");
  }
}