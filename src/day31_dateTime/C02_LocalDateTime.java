package day31_dateTime;

import java.time.LocalDateTime;

public class C02_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat);

        int baslangicZamani = tarihSaat.getNano();
        int toplam= 0;
        for (int i = 1; i <10000 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);

        int bitisZamani = tarihSaat.getNano();

        System.out.println("islem suresi :"+ (bitisZamani-baslangicZamani));


    }
}
