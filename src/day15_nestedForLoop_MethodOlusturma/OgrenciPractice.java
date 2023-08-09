package day15_nestedForLoop_MethodOlusturma;

public class OgrenciPractice {

    public static void main(String[] args) {

         /*
            Asagidaki tabloyu
            konsolda yazdirin

            1  2  3  4
            2  4  6  8
            3  6  9  12

            eger yazdirilacak sekil dikdortgen bicimindeyse
            ic ice for loop ile yapabiliriz

         */

        for (int i = 1; i <4 ; i++) {
            for (int j = 1; j <5 ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");

        }
    }
}
