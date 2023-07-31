package day11_stringManipulations;

public class C05_startsWith_endsWith {

    public static void main(String[] args) {

        String str = "Java cok guzel";

        System.out.println(str.startsWith("Java"));

        System.out.println(str.startsWith("c", 5));

        System.out.println(str.startsWith("ok", 6));
    }
}
