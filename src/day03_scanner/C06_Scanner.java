package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen cemberin yarcapini giriniz: ");

        double yariCap = scanner.nextDouble();

        System.out.println("Cemberin cevresi :" + 2*3.14*yariCap);

        System.out.println("Dairenin lani " + 3.14*yariCap*yariCap);
    }
}
