package day08_IfElseStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz E : Erkek , K: Kadin ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz:  ");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E'){
            if (yas<=0 || yas>100){
                System.out.println("gecersiz yas");
            } else if (yas>=65) {
                System.out.println("emekli olabilirsiniz");
            }else {
                System.out.println("Emekli olamaz");
            }

        } else if (cinsiyet == 'K') {
            if (yas<=0 || yas>100){
                System.out.println("gecersiz yas");
            } else if (yas>=60) {
                System.out.println("emekli olabilirsiniz");
            }else {
                System.out.println("Emekli olamaz");
            }

        }else {
            System.out.println("Cinsiyet hatali girildi");
        }


    }
}
