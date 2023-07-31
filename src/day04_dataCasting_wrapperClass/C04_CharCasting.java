package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ascii tablosundan bir karakter giriniz:");

        char girilenKrk = scanner.next().charAt(0);

        System.out.println("Girilen Karakter :" + girilenKrk);

        System.out.println("Girilen karakterden sonraki 3 karakter :" +
                (char)(girilenKrk+1) + ", "+
                (char)(girilenKrk+2) + ", " +
                (char)(girilenKrk+3));
    }
}
