package day18_whileLoop_DoWhileLoop;

public class C07_DoWhileLoop {

    public static void main(String[] args) {


        int bas = 30;
        int bit = 20;
        int toplam = 0;

        while (bas <= bit){

            toplam += bas ;
            bas++;
        }

        System.out.println("Sayilarin toplami : " +toplam);


        bas =30;
        bit = 20;
        toplam=0;

        do {
            toplam +=bas;
            bas++;

        }while (bas<=bit);

        System.out.println("do while loop ile aradaki sayilarin toplami :"+ toplam);




    }
}
