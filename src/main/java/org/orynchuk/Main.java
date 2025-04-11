package org.orynchuk;
import java.util.Scanner;

/*
  @author Orynhuk
  @project quality_testing_3_4
  @class Main
  @version 1.0.0
  @since 14.03.2025 - 09.25
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        String num = scanner.nextLine();

        //Converter converter = new Converter();
        //String roman = converter.convertIntToRoman(num);

        ConverterToInt converter = new ConverterToInt();
        int  roman = converter.convertRomanToInt(num);

        System.out.println("Переведене число: " + roman);
    }
}
