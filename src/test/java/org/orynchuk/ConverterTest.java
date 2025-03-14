package org.orynchuk;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
  @author Orynhuk
  @project quality_testing_3_4
  @class ConverterTest
  @version 1.0.0
  @since 14.03.2025 - 09.25
*/

class ConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertIntToRoman() {
    }

    /*
    1000 - M
    900 - CM
    500 - D
    400 - CD
    100 - C
    90 - XC
    50 - L
    40 - XL
    10 - X
    9 - IX
    5 - V
    4 - IV
    1 - I
     */

    //1
    @Test
    void whenArabic_3_ThenRoman_III() {
        Assertions.assertEquals("III", Converter.convertIntToRoman(3));
    }

    //2
    @Test
    void whenArabic_4_ThenRoman_IV() {
        Assertions.assertEquals("IV", Converter.convertIntToRoman(4));
    }

    //3
    @Test
    void whenArabic_5_ThenRoman_V() {
        Assertions.assertEquals("V", Converter.convertIntToRoman(5));
    }

    //4
    @Test
    void whenArabic_8_ThenRoman_VIII() {
        Assertions.assertEquals("VIII", Converter.convertIntToRoman(8));
    }

    //5
    @Test
    void whenArabic_9_ThenRoman_IX() {
        Assertions.assertEquals("IX", Converter.convertIntToRoman(9));
    }

    //6
    @Test
    void whenArabic_10_ThenRoman_X() {
        Assertions.assertEquals("X", Converter.convertIntToRoman(10));
    }

    //7
    @Test
    void whenArabic_12_ThenRoman_XII() {
        Assertions.assertEquals("XII", Converter.convertIntToRoman(12));
    }

    //8
    @Test
    void whenArabic_16_ThenRoman_XVI() {
        Assertions.assertEquals("XVI", Converter.convertIntToRoman(16));
    }

    //9
    @Test
    void whenArabic_34_ThenRoman_XXXIV() {
        Assertions.assertEquals("XXXIV", Converter.convertIntToRoman(34));
    }

    //10
    @Test
    void whenArabic_40_ThenRoman_XL() {
        Assertions.assertEquals("XL", Converter.convertIntToRoman(40));
    }

    //11
    @Test
    void whenArabic_44_ThenRoman_XLIV() {
        Assertions.assertEquals("XLIV", Converter.convertIntToRoman(44));
    }

    //12
    @Test
    void whenArabic_50_ThenRoman_L() {
        Assertions.assertEquals("L", Converter.convertIntToRoman(50));
    }

    //13
    @Test
    void whenArabic_80_ThenRoman_LXXX() {
        Assertions.assertEquals("LXXX", Converter.convertIntToRoman(80));
    }

    //14
    @Test
    void whenArabic_90_ThenRoman_XC() {
        Assertions.assertEquals("XC", Converter.convertIntToRoman(90));
    }

    //15
    @Test
    void whenArabic_99_ThenRoman_XCIX() {
        Assertions.assertEquals("XCIX", Converter.convertIntToRoman(99));
    }

    //16
    @Test
    void whenArabic_100_ThenRoman_C() {
        Assertions.assertEquals("C", Converter.convertIntToRoman(100));
    }

    //17
    @Test
    void whenArabic_149_ThenRoman_CXLIX() {
        Assertions.assertEquals("CXLIX", Converter.convertIntToRoman(149));
    }

    //18
    @Test
    void whenArabic_222_ThenRoman_CCXXII() {
        Assertions.assertEquals("CCXXII", Converter.convertIntToRoman(222));
    }

    //19
    @Test
    void whenArabic_400_ThenRoman_CD() {
        Assertions.assertEquals("CD", Converter.convertIntToRoman(400));
    }

    //20
    @Test
    void whenArabic_500_ThenRoman_D() {
        Assertions.assertEquals("D", Converter.convertIntToRoman(500));
    }

    //21
    @Test
    void whenArabic_800_ThenRoman_DCCC() {
        Assertions.assertEquals("DCCC", Converter.convertIntToRoman(800));
    }

    //22
    @Test
    void whenArabic_900_ThenRoman_CM() {
        Assertions.assertEquals("CM", Converter.convertIntToRoman(900));
    }

    //23
    @Test
    void whenArabic_999_ThenRoman_CMXCIX() {
        Assertions.assertEquals("CMXCIX", Converter.convertIntToRoman(999));
    }

    //24
    @Test
    void whenArabic_1000_ThenRoman_M() {
        Assertions.assertEquals("M", Converter.convertIntToRoman(1000));
    }
    
    //25
    @Test
    void whenArabic_2491_ThenRoman_MMCDXCI() {
        Assertions.assertEquals("MMCDXCI", Converter.convertIntToRoman(2491));
    }
}