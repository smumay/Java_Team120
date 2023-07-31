package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir üc basamakli sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami =0;

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami+ birlerBasamagi;

        girilenSayi = girilenSayi/10;

        birlerBasamagi = girilenSayi%10;
        rakamlarToplami = rakamlarToplami+birlerBasamagi;

        girilenSayi = girilenSayi/10;

        birlerBasamagi= girilenSayi%10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        girilenSayi= girilenSayi/10;

        System.out.println("Rakamlar Toplami : " +rakamlarToplami);


    }
}
