package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();


        if (sayi % 3 == 0  || sayi % 5 == 0  && sayi>0){
            System.out.println("Guzel sayi");
        }

    }
}
