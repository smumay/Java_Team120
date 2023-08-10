package day16_methodOlusturma_Kullanma;

public class MiniHesapMakinesi {

        // kullanicinin verdigi iki sayi ve
        // sececegi isleme gore
        // sonucu double olarak bize donduren bir method olusturun
        // ornek sayilar 3, 5,   islem * oldugunda method 15 dondurmeli

    public static void main(String[] args) {


        System.out.println(miniHesapMakinesi(3, 5, '*'));

        double sonuc= miniHesapMakinesi(10,4,'/');


    }

    public static double miniHesapMakinesi(int sayi1, int sayi2, char islemSembolu){

        double sonuc =0;
        switch (islemSembolu){
            case '+' :
                sonuc= sayi1+sayi2;
                break;
            case '-' :
                sonuc = sayi1-sayi2;
                break;
            case '*':
                sonuc= sayi1*sayi2;
                break;
            case '/':
                sonuc= sayi1/sayi2;
                break;
            default:
                System.out.println("islem sembolu yanlis, sonuc olarak 0 olarak atandi");
        }
        return sonuc;
    }




}
