package day31_dateTime;

public class C05_Varargs {

    public static void main(String[] args) {

        toplama(3,5);
        toplama(3,5,7,8,9,5);
    }

    public static void toplama(int... sayi){

        int toplam=0;
        for (int i = 0; i < sayi.length ; i++) {
            toplam+=sayi[i];
        }

        System.out.println("verilen int sayilarin toplami : "+toplam );
    }




}
