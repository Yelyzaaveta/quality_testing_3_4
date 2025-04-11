package org.orynchuk;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
  @author Orynhuk
  @project quality_testing_3_4
  @class NumeralRoman
  @version 1.0.0
  @since 27.03.2025 - 10.05
*/

public class NumeralRoman {
    public static final Map<Character, Integer> ROMAN_TO_INT = new HashMap<>();

    static {
        ROMAN_TO_INT.put('I', 1);
        ROMAN_TO_INT.put('V', 5);
        ROMAN_TO_INT.put('X', 10);
        ROMAN_TO_INT.put('L', 50);
        ROMAN_TO_INT.put('C', 100);
        ROMAN_TO_INT.put('D', 500);
        ROMAN_TO_INT.put('M', 1000);
    }

    public static final Set<Character> VALID_ROMAN_CHARS = Set.of('I', 'V', 'X', 'L', 'C', 'D', 'M');

}
