package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseStatements {

    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ucgenin uc kenar uzunlugunu giriniz: ");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();


        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar degil");
        }
    }
}
