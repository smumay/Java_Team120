package day16_methodOlusturma_Kullanma;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class soru_37 {

        //Tekrarlanan kayıtların çıkarıldığı yeni bir dizi yazdiran aşağıdaki başlıga sahip bir metot yazınız.
        //On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
        //---->>>
        //public static int[] eliminateDuplicates(int[] list)
        //ÖRNEK:
        //On sayi giriniz:
        //1 2 3 2 1 6 3 4 5 2
        //ÇIKTI:
        //Birbirinden farkli girilen sayilar: 1 2 3 6 4 5

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 10 tane tamsayi giriniz:");
        int [] arr = new int[10];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Lütfen sayilarini giriniz: ");
            arr[i]=scanner.nextInt();

        }

        tekrarlananSayiyiEleme(arr);

    }



            public static void tekrarlananSayiyiEleme(int [] arr){

        ArrayList<Integer> tekrarsizList = new ArrayList<>();

                for (int i = 0; i < arr.length; i++) {
                    if (!tekrarsizList.contains(arr[i])){
                        tekrarsizList.add(arr[i]);
                    }
                }

                System.out.println(tekrarsizList);


            }




}
