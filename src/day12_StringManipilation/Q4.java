package day12_StringManipilation;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir String ve aranacak metin alin.
        // Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin
        // - String aranan metni icermiyor
        // - Aranan metin String’de sadece 1 kere kullanilmis
        // - Aranan metin String’de sadece 1’den fazla kullanilmi

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine();
        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scanner.next();


    }
}