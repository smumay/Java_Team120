package day12_StringManipilation;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        //Soru 2 : Kullanicidan bir String ve aranacak metin alin.
        // Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
        // - String aranan metni icermiyor
        // - Aranan metin String’de sadece 1 kere kullanilmis
        // - Aranan metin String’de sadece 1’den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine();
        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scanner.next();

        //System.out.println(cumle.indexOf(metin));

        int ilkIndex = cumle.indexOf(metin);

        if (ilkIndex == -1){
            System.out.println("aranan metin cümlede bulunmamaktadir");
        }else {
            int ikinciIndex= cumle.indexOf(metin, ilkIndex+1);
            if (ikinciIndex == -1){
                System.out.println("Aranan metin cümlede bir kez bulunmustur....");
            }else {
                System.out.println("Aranan metin cümlede 1' den fazla kullanilmis....");
            }

        }
    }
}
