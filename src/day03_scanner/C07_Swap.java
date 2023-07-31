package day03_scanner;

import java.util.Scanner;

public class C07_Swap {

    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen birinci sayiyi giriniz :");
        int ilkSayi = scanner.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz :");
        int ikinciSayi = scanner.nextInt();

        int temple = 0;

        temple = ilkSayi;
        ilkSayi= ikinciSayi;
        ikinciSayi=temple;

        System.out.println("Ilk sayi :" + ilkSayi +
                "\nIkinci sayi :"  + ikinciSayi);






    }
}
