package day29_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        int sayi =10;



        sayi= sayiyiDegistir(sayi);

        System.out.println("method call'dan sonra sayi: "+ sayi);
    }


    public static int sayiyiDegistir(int sayi){

        if (sayi % 2 == 0){
            return 2*sayi;
        }else {
            return sayi+5;
        }
    }
}
