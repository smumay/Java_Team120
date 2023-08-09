package day14_forLoops;

import java.util.Scanner;

public class Soru_9 {

    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

            System.out.println("Tersten yazdirmak istediginiz metni giriniz: ");
            Scanner scanner = new Scanner(System.in);
            String girilenMetin = scanner.nextLine();


            String tersMetin ="";

            for (int i = girilenMetin.length()-1; i >=0 ; i--) {
                tersMetin += girilenMetin.charAt(i);
            }
            System.out.println("girilen metnin tersten yailmis hali: "+ tersMetin);
        }
    }


