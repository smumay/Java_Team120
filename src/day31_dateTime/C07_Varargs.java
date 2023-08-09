package day31_dateTime;

public class C07_Varargs {

    public static void main(String[] args) {

        islemYap(3,4,6,7,1,0);
    }


    public static void islemYap(int sayi1, int sayi2, int... kalanlar){

        System.out.println(kalanlar.length);
    }
}
