package org.orynchuk;

/*
  @author Orynhuk
  @project quality_testing_3_4
  @class Converter
  @version 1.0.0
  @since 14.03.2025 - 09.25
*/

public class Converter {
    public static String convertIntToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < RomanNumeral.VALUES.length; i++) {
            while (num >= RomanNumeral.VALUES[i]) {
                num -= RomanNumeral.VALUES[i];
                sb.append(RomanNumeral.SYMBOLS[i]);
            }
        }

        return sb.toString();
    }
}
