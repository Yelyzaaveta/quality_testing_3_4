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
        int num = scanner.nextInt();

        Converter converter = new Converter();
        String roman = converter.convertIntToRoman(num);

        System.out.println("Римське число: " + roman);
    }
}
