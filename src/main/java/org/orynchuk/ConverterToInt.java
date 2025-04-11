package org.orynchuk;

/*
  @author Orynhuk
  @project quality_testing_3_4
  @class ConverterToInt
  @version 1.0.0
  @since 27.03.2025 - 10.06
*/

public class ConverterToInt {

    public static int convertRomanToInt(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new NullPointerException("Input string is null or empty");
        }

        for (char c : roman.toCharArray()) {
            if (!NumeralRoman.VALID_ROMAN_CHARS.contains(c)) {
                throw new IllegalArgumentException("Invalid character in Roman numeral: " + c);
            }
        }

        if (!roman.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            throw new IllegalArgumentException("Invalid Roman numeral format");
        }

        int sum = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = NumeralRoman.ROMAN_TO_INT.get(roman.charAt(i));

            if (value < prevValue) {
                sum -= value;
            } else {
                sum += value;
            }
            prevValue = value;
        }

        if (sum > 3999) {
            throw new IllegalArgumentException("Roman numeral exceeds 3999");
        }

        return sum;
    }
}
