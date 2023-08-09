package day12_StringManipilation;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        //Soru 3 : Kullanicidan bir String ve aranacak metin alin.
        // String’in aranan metni icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine();
        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scanner.next();



        if (cumle.lastIndexOf(metin) == -1){
            System.out.println("aranan metin cümlede bulunmamaktadir");
        }else {
            System.out.println("Aranan metin cümlede bulunmaktadir");
        }
    }
}
