package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Isminiz: ");
        String isim = scanner.nextLine();
        System.out.println("Soyisminiz :");
        String soyIsim = scanner.nextLine();
        System.out.println("Yasiniz: ");
        int yas = scanner.nextInt();

        System.out.println("Isminiz : "+ isim +
                "\nSoyisminiz :" + soyIsim +
                "\nYasiniz : " + yas +
                "\nKaydiniz basariyla tamamlanmistir.");

    }
}
