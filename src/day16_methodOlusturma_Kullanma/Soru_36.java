package day16_methodOlusturma_Kullanma;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_36 {

        //Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
        // ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        //Örnek:
        //inputarr[]=   {1,2,3,4,5,6,7}
        //output:         4
        //İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
        // Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
        // Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array in uzunlugunu giriniz: ");
        int uzunluk = scanner.nextInt();
        int [] arr = new int[uzunluk];

        for (int i = 0; i <arr.length ; i++) {
            scanner = new Scanner(System.in);
            System.out.println("Arrayin "+ (i+1)+ ".nci sayisini giriniz:" );
            arr[i]= scanner.nextInt();
        }

        System.out.println(ortadakiSayiyiBulma(arr));
    }


    public static int ortadakiSayiyiBulma(int [] arr){

        if (arr.length %2 == 0){
            int ortaIndex1= arr.length/2;
            int ortaIndex2= arr.length/2-1;
            System.out.print("Array'imizin uzunlugu cift sayi ise:" + arr[ortaIndex1]+ " ve "+ arr[ortaIndex2]);
            return arr[ortaIndex1]+ arr[ortaIndex2];
        }else {
            int ortaIndex= arr.length/2;
            System.out.print("Arrayimizin uzunlugu tek sayi ise :");
            return arr[ortaIndex];

        }


    }



    }










