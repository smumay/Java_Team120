package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class Soru1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle = scanner.nextLine();


        if (cumle.contains("ev")&& cumle.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        }else{
            System.out.println("cok calisman lazim");
        }


    }
}
