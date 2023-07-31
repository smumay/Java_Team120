package day08_IfElseStatements;

import java.util.Scanner;

public class StringManipulationsSoru {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir mail adresi giriniz:");
        String mailAdresi = scanner.nextLine();

        if (!(mailAdresi.contains("@"))){
            System.out.println("gecersiz mail");
        }

        if (!(mailAdresi.contains("@gmail.com"))) {
            System.out.println("mail gmail olmali");
        }

        if (!(mailAdresi.endsWith("@gmail.com"))) {
            System.out.println("mailde yazim hatasi var");
        }


    }
}
