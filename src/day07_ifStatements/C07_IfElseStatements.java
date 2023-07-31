package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        double not = scanner.nextDouble();


        if (not>=50) {
            System.out.println("Gectiniz");
        } else {
            System.out.println("Maalesef kaldin");
        }

    }
}
