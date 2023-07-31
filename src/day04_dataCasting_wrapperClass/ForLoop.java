package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {


        // 1'den 100'e kadar tamsayilari toplayin. Dinamikte yapilabilir.

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i =1 ; i <=sayi; i++) {
            toplam+=i;
        }

        System.out.println(toplam);




            // verilen iki sayinin ilkinden baslayip ikinciye kadar
            // 3'er 3'er yazdirin (ikinci sayi sartlari saglamiyorsa yazdirilmayabilir)


        System.out.println("Lütfen birinci tam sayiyi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci tam sayiyi giriniz");
        int sayi2 = scanner.nextInt();

        for (int i = sayi1; i <=sayi2; i+=3) {

            System.out.print(i + " ");

        }

 */
        // verilen sayidan baslayarak geriye 1'e dogru
        // 3 ile bolunebilen sayilari yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        for (int i = sayi; i>1 ; i--) {

            if (i %3 ==0){
                System.out.print(i + " ");
            }

        }







    }
}
