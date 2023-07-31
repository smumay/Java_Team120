package day08_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {

        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy)) vucut kitle endeksi
        // 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg giriniz: ");
        double kilo = scanner.nextDouble();
        System.out.println("Lutfen boyunuzu cm giriniz: ");
        double boy = scanner.nextDouble();

        double vki = (kilo*10000 / (boy *boy));

        if (vki>= 30){
            System.out.println("Obez");
        } else if (vki>= 25) {
            System.out.println("Kilolu");
        } else if (vki>= 20) {
            System.out.println("Normal");
        }else {
            System.out.println("Zayif");
        }


    }
}
