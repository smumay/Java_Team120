package day10_switchCase_StringManipulations;

public class C05_equals {

    public static void main(String[] args) {

        String str1 = "Mehmet";
        String str2 = "MEHMET";
        String str3 = "mehmet";
        String str4 = "MEHmet";

        System.out.println(str1 == str2);

        System.out.println(str3 == str4.toLowerCase());

        System.out.println("******************************");


        System.out.println(str1.equals(str2));

        System.out.println(str3.equals(str4.toLowerCase()));

        System.out.println(str2.equals(str3.toUpperCase()));


        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str3.equalsIgnoreCase(str4));





    }
}
