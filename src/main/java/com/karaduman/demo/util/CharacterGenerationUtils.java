package com.karaduman.demo.util;

import org.apache.commons.text.RandomStringGenerator;

import java.security.SecureRandom;

public class CharacterGenerationUtils {

  private static final SecureRandom secureRandom = new SecureRandom();

  static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+<>?";
  static final String UPPER_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
  static final String NUMBERS = "0123456789";

  // Setting up the random character generators
  public static RandomStringGenerator specialCharGenerator = new RandomStringGenerator.Builder()
      .selectFrom(SPECIAL_CHARACTERS.toCharArray())
      // using java.security.SecureRandom to improve randomness
      .usingRandom(secureRandom::nextInt)
      .build();

  public static RandomStringGenerator upperCaseGenerator = new RandomStringGenerator.Builder()
      .selectFrom(UPPER_CASE_LETTERS.toCharArray())
      .usingRandom(secureRandom::nextInt)
      .build();

  public static RandomStringGenerator lowerCaseGenerator = new RandomStringGenerator.Builder()
      .selectFrom(LOWER_CASE_LETTERS.toCharArray())
      .usingRandom(secureRandom::nextInt)
      .build();

  public static RandomStringGenerator numberGenerator = new RandomStringGenerator.Builder()
      .selectFrom(NUMBERS.toCharArray())
      .usingRandom(secureRandom::nextInt)
      .build();

}
