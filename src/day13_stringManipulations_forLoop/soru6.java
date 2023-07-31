package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class soru6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        int uzunluk = kelime.length();


        if (uzunluk % 2 == 0 && uzunluk>0){
            System.out.println(kelime.substring(0,uzunluk/2)+":)"+ kelime.substring(uzunluk/2));
        }else {
            System.out.println(kelime.substring(0,uzunluk/2)+ ":(" + kelime.substring(uzunluk/2+1));
        }
    }
}
