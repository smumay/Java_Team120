package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayi giriniz: ");

        int girilenSayi = scanner.nextInt();

        System.out.println("Toplam: "   + girilenSayi*girilenSayi);

    }
}
