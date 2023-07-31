package day07_ifStatements;

import java.util.Scanner;

public class Odev_1 {

    public static void main(String[] args) {

        //Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz :");
        int yas = scanner.nextInt();

        if (yas>65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("emekli olmasi icin " + (65-yas) + " yil daha calismasi gerekir");
        }




    }
}
