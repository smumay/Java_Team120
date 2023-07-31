package day07_ifStatements;

import java.util.Scanner;

public class Odev_3 {

    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf = scanner.next().charAt(0);

        if (harf>'a' && harf <'z'){
            System.out.println(Character.toUpperCase(harf));
        }else {
            System.out.println("yazdirilan harf: " + harf);
        }
    }
}
