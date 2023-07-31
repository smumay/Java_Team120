package day08_IfElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz E : Erkek , K: Kadin ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinizi giriniz:  ");
        double yas = scanner.nextDouble();


        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Erkek emekli olamaz, " + (65 - yas) + "yil daha calismalisiniz");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Kadin emekli olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("kadin emekli olamaz, " + (60 - yas) + "yil daha calismalisiniz");
        }
    }
}
