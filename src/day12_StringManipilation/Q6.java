package day12_StringManipilation;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {


        //Soru 6 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : “15.30 €” , input2 : “11.40 €” output : 26.70 €

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen toplamak istediginiz iki fiyati yazdir");
        String input1 = "15.30 €";
        String input2 = "11.40 €";

        input1.replaceAll("€","");
        input2.replaceAll("€","");


    }
}
