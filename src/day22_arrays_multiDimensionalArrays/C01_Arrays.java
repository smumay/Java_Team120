package day22_arrays_multiDimensionalArrays;

public class C01_Arrays {

    public static void main(String[] args) {

        String[] isimler = {"Ayse", "Yusuf","Bugra","Abdullah","Nergiz","Gülay","Ramazan"};

        int sayac = 0;
        int kelimeUzunlugu = 0;


        for (int i = 0; i <isimler.length ; i++) {

            kelimeUzunlugu = isimler[i].length();

            if (kelimeUzunlugu % 2 == 1){

                System.out.print(isimler[i]+ " ");
                sayac++;
            }



        }
    }
}
