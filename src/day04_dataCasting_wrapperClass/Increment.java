package day04_dataCasting_wrapperClass;

public class Increment {

    public static void main(String[] args) {

        int a=10;

        System.out.println("a : " + ++a);

        int b = a++;

        System.out.println(" b :" +b);

        int c = b++ + a;

        System.out.println("a :" + a);
        System.out.println("b :" + b);

        System.out.println("c :" + c);

        System.out.println("son toplam :" + (a+b+c));
    }
}
