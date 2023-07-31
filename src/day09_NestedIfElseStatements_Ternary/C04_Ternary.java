package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C04_Ternary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz:");
        int sayi = scanner.nextInt();



        System.out.println(sayi % 3 == 0 ? "3 e tam bolunur" : "3 ile tam bolunmuyor");


    }
}
