package day14_forLoops;

import java.util.Scanner;

public class C05_RakamlarToplami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarini toplamak uzere bir tamsayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        int basamakSayisi = (sayi+"").length();

        for (int i = 1; i <= basamakSayisi; i++) {

            birlerBasamagi = sayi % 10 ;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }

        System.out.println("girilen sayi " + girilenSayi + "sayisinin rakamlar toplami " + rakamlarToplami);
    }
}
