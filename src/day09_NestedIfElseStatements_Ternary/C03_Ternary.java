package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz:");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0){
            System.out.println("cift sayi");
        }else{
            System.out.println("tek sayi");
        }


        System.out.println(sayi % 2 == 0 ? "cift sayi"  : "tek sayi");
    }
}
