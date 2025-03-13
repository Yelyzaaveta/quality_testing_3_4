package org.orynchuk;

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
