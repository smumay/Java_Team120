package day03_scanner;

import java.util.Scanner;

public class C08_SwapOdevi {

    public static void main(String[] args) {

       //Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken
        // kullanmadan ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen birinci sayiyi giriniz :");
        int ilkSayi = scanner.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz :");
        int ikinciSayi = scanner.nextInt();

        ilkSayi = ilkSayi+ ikinciSayi;
        ikinciSayi = ilkSayi - ikinciSayi;
        ilkSayi = ilkSayi- ikinciSayi;

        System.out.println("Yeni degerler: " + "Birinci sayi: " + ilkSayi + "  Ikinci sayi :" + ikinciSayi);

    }
}
