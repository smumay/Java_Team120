package day17_methodOlusturma_MethodOverloading;

public class C06_WhileLoop {

    public static void main(String[] args) {




        // 1'den 100'e kadar olan sayilari (sinirlar dahil)
        // for loop ile hesaplayin

        int toplam = 0;

        int sayi = 1;


        while (sayi<=100){

            toplam +=sayi;
            sayi++;
        }

        System.out.println(toplam);




    }
}
