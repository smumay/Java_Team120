package day14_forLoops;

import java.util.Scanner;

public class Soru {

    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci pozitif sayinizi giriniz:");
        int num1 = scanner.nextInt();
        System.out.println("Lütfen ikinci pozitif sayinizi giriniz:");
        int num2 = scanner.nextInt();

        int toplam=0;

        if (num1>num2) {
            System.out.println("baslangic degeri büyük olamaz");
        }else {
            for (int i = num1; i <=num2 ; i++) {
                toplam+=i;
            }
            System.out.println(toplam);

        }




    }
}
