package org.orynchuk;
import java.util.Scanner;

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
