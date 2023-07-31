package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C02_sort {

    public static void main(String[] args) {

        String[] harfler = {"L","a","P","d","T","t"};

        System.out.println(Arrays.toString(harfler));

        Arrays.sort(harfler);

        System.out.println(Arrays.toString(harfler));

        String[] isimler = {"Ayse", "Yusuf","Bugra","Abdullah","Nergiz","Gülay","Ramazan"};

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));

        int[] sayilar ={4,78,4,2,98,3,7,1};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));





    }
}
