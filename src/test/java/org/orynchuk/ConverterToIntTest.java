package org.orynchuk;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/*
  @author Orynhuk
  @project quality_testing_3_4
  @class ConverterToIntTest
  @version 1.0.0
  @since 27.03.2025 - 10.12
*/

class ConverterToIntTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    // sipmle checks
    @Test
    void romanToIntTesting() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(3, ConverterToInt.convertRomanToInt("III")),
                () -> Assertions.assertEquals(4, ConverterToInt.convertRomanToInt("IV")),
                () -> Assertions.assertEquals(5, ConverterToInt.convertRomanToInt("V")),
                () -> Assertions.assertEquals(9, ConverterToInt.convertRomanToInt("IX")),
                () -> Assertions.assertEquals(10, ConverterToInt.convertRomanToInt("X")),
                () -> Assertions.assertEquals(40, ConverterToInt.convertRomanToInt("XL")),
                () -> Assertions.assertEquals(50, ConverterToInt.convertRomanToInt("L")),
                () -> Assertions.assertEquals(90, ConverterToInt.convertRomanToInt("XC")),
                () -> Assertions.assertEquals(100, ConverterToInt.convertRomanToInt("C")),
                () -> Assertions.assertEquals(400, ConverterToInt.convertRomanToInt("CD")),
                () -> Assertions.assertEquals(500, ConverterToInt.convertRomanToInt("D")),
                () -> Assertions.assertEquals(900, ConverterToInt.convertRomanToInt("CM")),
                () -> Assertions.assertEquals(1000, ConverterToInt.convertRomanToInt("M")),
                () -> Assertions.assertEquals(1987, ConverterToInt.convertRomanToInt("MCMLXXXVII")),
                () -> Assertions.assertEquals(3999, ConverterToInt.convertRomanToInt("MMMCMXCIX"))
        );
    }

    @Test
    void whenInputIsNull_thenThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            ConverterToInt.convertRomanToInt(null);
        });
    }

    @Test
    void whenInputIsEmptyString_thenThrowNullPointerException() {
        assertThrows(NullPointerException.class, () ->
                ConverterToInt.convertRomanToInt(""));
    }

    @Test
    void whenRomanNumberIsOutOfTheSet_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("A"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("W"));
    }

    @Test
    void whenRomanNumberIsLowercased_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("x"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("v"));
    }

    @Test
    void whenRomanNumberIsLowerLInsteadOfI_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("l"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("lV"));
    }

    @Test
    void whenRomanNumberContainsSpaces_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("X X"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt(" X"));
    }

    // invalid format of roman number
    @Test
    void whenRomanNumberIsInUncorrectFormat_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("IIII"));
    }

    @Test
    void whenRomanNumberContainsInteger_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("X3"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("1V"));
    }

    @Test
    void whenRomanNumberIsInLitterationFormat_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("threeI"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("five"));
    }

    @Test
    void whenRomanNumberContainsPartings_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("III.XIV"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("III,XIV"));
    }

    @Test
    void whenInputIsInCyrilic_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("І"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("Х"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("С"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("М"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("В"));
    }

    @Test
    void  whenRomanNumberIsOutOfLimit_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("MMMM"));
    }

    @Test
    void  whenRomanNumberIsNegative_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("-M"));
    }

    @Test
    void  whenRomanNumberPipeInsteadOfI_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("|V"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("|||"));
    }

    @Test
    void  whenRomanNumberContainsUnderlineAsSpace_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("I_V"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("XX_V"));
    }

    @Test
    void whenRomanNumbersIsEmoji_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("❌"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("✖"));
    }

    @Test
    void  whenRomanNumberMultiplierInsteadOfX_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("×"));
    }

    @Test
    void whenRomanNumbersIsUnicodeCharacter_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("Ⅹ"));
        assertThrows(IllegalArgumentException.class, () -> ConverterToInt.convertRomanToInt("ㄨ"));
    }
}