package day21_arrays;

public class OgrenciPractise {

    public static void main(String[] args) {

        int [] arr = {2,3,1,4};

        kareToplami(arr);

    }


    public static void kareToplami (int [] arr){

        int toplam = 0;

        for (int each:arr
             ) {

            toplam+= each*each;



        }
        System.out.println(toplam);
    }
}
