package day16_methodOlusturma_Kullanma;

public class OrnekSoru {

    public static void main(String[] args) {

        System.out.println(toplama(30, 50));
        toplama(10,20,30);

    }

    public static int toplama(int num1, int num2){

        int toplam= num1+num2;
        return toplam;
    }

    public static void toplama(int sayi1, int sayi2,int sayi3){

        int toplam= sayi1+sayi2+sayi3;
        System.out.println(toplam);
    }
}
