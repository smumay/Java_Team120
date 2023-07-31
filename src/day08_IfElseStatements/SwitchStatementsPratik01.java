package day08_IfElseStatements;

import java.util.Scanner;

public class SwitchStatementsPratik01 {

    public static void main(String[] args) {

        /* Kullanicinin girmis oldugu sira bilgisini kullanarak
        hangi ayda oldugunu console a yazan bir program olusturunuz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ay numarasini giriniz: ");
        int ayNo = scanner.nextInt();

        switch (ayNo){
            case 1 :
                System.out.println("Ocak");
                break;
            case 2 :
                System.out.println("Subat");
                break;
            case 3 :
                System.out.println("Mart");
                break;
            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("Mayis");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Agu");
                break;
            case 9 :
                System.out.println("Eyl");
                break;
            case 10 :
                System.out.println("Ekm");
                break;
            case 11 :
                System.out.println("Ksm");
                break;
            case 12 :
                System.out.println("Ara");
                break;
            default:
                System.out.println("gecersiz ay");
                break;

        }

    }
}
