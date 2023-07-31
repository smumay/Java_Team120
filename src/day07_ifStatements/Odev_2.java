package day07_ifStatements;

import java.util.Scanner;

public class Odev_2 {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);

        if (karakter>'A' && karakter<'Z'){
            System.out.println("girilen karakter buyuk harf");
        }else {
            System.out.println("girilen karakter buyuk harf degil");
        }

    }
}
