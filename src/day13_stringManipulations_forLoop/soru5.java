package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class soru5 {


    public static void main(String[] args) {
        /*
        Kullanicidan isim ve soyismini ayri ayri alin.
       - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar
       kucuk seklinde yazdirin
       - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scanner.nextLine().toLowerCase();
        System.out.println("soyisminizi giriniz :");
        String soyIsim = scanner.nextLine().toLowerCase();

        if (isim.length() > soyIsim.length()){
            System.out.println(isim.toUpperCase().charAt(0)+ isim.substring(1).toLowerCase()+ " " +
                    soyIsim.toUpperCase().charAt(0) + soyIsim.substring(1).toLowerCase());
        } else if (soyIsim.length() > isim.length()) {
            System.out.println(isim.toUpperCase().charAt(0)+ isim.substring(1).toLowerCase()+ " " +
                    soyIsim.toUpperCase());
        }


    }
}
