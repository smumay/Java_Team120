package day12_StringManipilation;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        //Soru 1 : Kullanicidan bir String ve aranacak metin alin.
        // String’in aranan metni icerip icermedigini indexOf( ) method’u kullanarak yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine();
        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scanner.next();

        //System.out.println(cumle.indexOf(metin));

        if (cumle.indexOf(metin) == -1){
            System.out.println("aranan metin cümlede bulunmamaktadir");
        }else {
            System.out.println("Aranan metin cümlede bulunmaktadir");
        }


    }
}
