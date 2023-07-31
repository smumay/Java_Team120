package day26_forEachLoop_constructor;

import java.util.Arrays;

public class C02_HarfKullanimAdedi {

    public static void main(String[] args) {

        String cumle = "Java her gecen gun daha zevkli hale geliyor";
        String harf = "a";

        String[] cumleArr = cumle.split("");
        System.out.println(Arrays.toString(cumleArr));

        int sayac= 0;

        for (String each:cumleArr
             ) {

            if (each.equals(harf)){
                sayac++;
            }

        }

        if (sayac == 0){
            System.out.println("aradiginiz harf cumlede kullanilmamis");
        }else {
            System.out.println("aradiginiz harf cumlede "+ sayac+ " kere kullanilmis");
        }

    }
}
