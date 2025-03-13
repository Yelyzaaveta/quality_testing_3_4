package org.orynchuk;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void generateArabic_3_ThanRoman_III() {
        Assertions.assertEquals("III", Converter.convertIntToRoman(3));
    }

    //2
    @Test
    void generateArabic_4_ThanRoman_IV() {
        Assertions.assertEquals("IV", Converter.convertIntToRoman(4));
    }

    //3
    @Test
    void generateArabic_5_ThanRoman_V() {
        Assertions.assertEquals("V", Converter.convertIntToRoman(5));
    }

    //4
    @Test
    void generateArabic_8_ThanRoman_VIII() {
        Assertions.assertEquals("VIII", Converter.convertIntToRoman(8));
    }

    //5
    @Test
    void generateArabic_9_ThanRoman_IX() {
        Assertions.assertEquals("IX", Converter.convertIntToRoman(9));
    }

    //6
    @Test
    void generateArabic_10_ThanRoman_X() {
        Assertions.assertEquals("X", Converter.convertIntToRoman(10));
    }

    //7
    @Test
    void generateArabic_12_ThanRoman_XII() {
        Assertions.assertEquals("XII", Converter.convertIntToRoman(12));
    }

    //8
    @Test
    void generateArabic_16_ThanRoman_XVI() {
        Assertions.assertEquals("XVI", Converter.convertIntToRoman(16));
    }

    //9
    @Test
    void generateArabic_34_ThanRoman_XXXIV() {
        Assertions.assertEquals("XXXIV", Converter.convertIntToRoman(34));
    }

    //10
    @Test
    void generateArabic_40_ThanRoman_XL() {
        Assertions.assertEquals("XL", Converter.convertIntToRoman(40));
    }

    //11
    @Test
    void generateArabic_44_ThanRoman_XLIV() {
        Assertions.assertEquals("XLIV", Converter.convertIntToRoman(44));
    }

    //12
    @Test
    void generateArabic_50_ThanRoman_L() {
        Assertions.assertEquals("L", Converter.convertIntToRoman(50));
    }

    //13
    @Test
    void generateArabic_80_ThanRoman_LXXX() {
        Assertions.assertEquals("LXXX", Converter.convertIntToRoman(80));
    }

    //14
    @Test
    void generateArabic_90_ThanRoman_XC() {
        Assertions.assertEquals("XC", Converter.convertIntToRoman(90));
    }

    //15
    @Test
    void generateArabic_99_ThanRoman_XCIX() {
        Assertions.assertEquals("XCIX", Converter.convertIntToRoman(99));
    }

    //16
    @Test
    void generateArabic_100_ThanRoman_C() {
        Assertions.assertEquals("C", Converter.convertIntToRoman(100));
    }

    //17
    @Test
    void generateArabic_149_ThanRoman_CXLIX() {
        Assertions.assertEquals("CXLIX", Converter.convertIntToRoman(149));
    }

    //18
    @Test
    void generateArabic_222_ThanRoman_CCXXII() {
        Assertions.assertEquals("CCXXII", Converter.convertIntToRoman(222));
    }

    //19
    @Test
    void generateArabic_400_ThanRoman_CD() {
        Assertions.assertEquals("CD", Converter.convertIntToRoman(400));
    }

    //20
    @Test
    void generateArabic_500_ThanRoman_D() {
        Assertions.assertEquals("D", Converter.convertIntToRoman(500));
    }

    //21
    @Test
    void generateArabic_800_ThanRoman_DCCC() {
        Assertions.assertEquals("DCCC", Converter.convertIntToRoman(800));
    }

    //22
    @Test
    void generateArabic_900_ThanRoman_CM() {
        Assertions.assertEquals("CM", Converter.convertIntToRoman(900));
    }

    //23
    @Test
    void generateArabic_999_ThanRoman_CMXCIX() {
        Assertions.assertEquals("CMXCIX", Converter.convertIntToRoman(999));
    }

    //24
    @Test
    void generateArabic_1000_ThanRoman_M() {
        Assertions.assertEquals("M", Converter.convertIntToRoman(1000));
    }

    //25
    @Test
    void generateArabic_2491_ThanRoman_MMCDXCI() {
        Assertions.assertEquals("MMCDXCI", Converter.convertIntToRoman(2491));
    }
}