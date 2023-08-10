package day35_inheritance;

public class FDoktor extends EMuhasebe{

    FDoktor(){
        System.out.println("Parametresiz Doktor constructor'i calisti");
    }

    FDoktor(String str){
        System.out.println("String Parametreli Doktor constructor'i calisti");
    }
    FDoktor(int sayi){
        System.out.println("Int parametreli Doktor constructor'i calisti");
    }
}


