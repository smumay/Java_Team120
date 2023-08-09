package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class ogrenciPractice2 {

    public static void main(String[] args) {

        /*
            Kullanicidan 2 rakam alin
            ilk rakan satir
            ikinci rakam sutun olmak uzere asagidaki sekli cizdirin

            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen satir sayisini giriniz");
        int satir = scanner.nextInt();
        System.out.println("lutfen sutün sayisini giriniz");
        int sutun = scanner.nextInt();


        for (int i =0 ; i <satir; i++) {
            for (int j = 0; j <sutun ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
