package day16_methodOlusturma_Kullanma;

public class S1 {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan input olarak verilen bir String,
        //        baslangic ve bitis indexlerine gore
        //        baslangic index'i dahil, bitis index'i haric olacak sekilde
        //        aradaki harfleri yazdiran bir method olusturun.
        //
        //          - kullanici baslangic degeri olarak,
        //          bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        //          - kullanici str'da olan index'lerden daha buyuk bir index girerse
        //          hata mesaji yazdirin.

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Lutfen bir cumle giriniz: ");
        //String str = scanner.nextLine();

        harfleriYazdiran("java hayattir", 12,30);


    }

    public static void harfleriYazdiran(String str, int basIndex, int bitIndex){

        if (basIndex>bitIndex){
            System.out.println("bas index bitis index den buyuk olamaz");
        } else if (basIndex> str.length() || bitIndex>=str.length()) {
            System.out.println("baslangic veya bitis indexleri bizim str mizden buyuk olamaz");

        }else {
            for (int i = basIndex; i < bitIndex; i++) {
                System.out.print(str.charAt(i));

            }
        }
    }









}
