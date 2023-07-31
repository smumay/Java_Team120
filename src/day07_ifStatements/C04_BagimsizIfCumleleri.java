package day07_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {

    public static void main(String[] args) {

        //Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0  && sayi>0){
            System.out.println("3 ile bolunebilen sayi");
        }
        if (sayi % 5 == 0  && sayi>0){
            System.out.println("5 ile bolunebilen sayi");
        }

    }
}
