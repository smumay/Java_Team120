package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class If_Statements {

    public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz :");
        double not = scanner.nextDouble();

        System.out.println(not > 50 ? "sinifi gectin" : "Kaldiniz");


    }
    }

