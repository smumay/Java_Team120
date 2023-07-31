package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C02_indirimHesaplama {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz :");
        int urunAdedi = scanner.nextInt();

        System.out.println("Lutfen liste fiyatini giriniz :");

        double listeFiyati = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi ? \nE : Evet, H: Hayir");

        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        if (kartVarMi == 'E'){
            if (urunAdedi>10){
                System.out.println("%20 indirimli toplam fiyat :" + urunAdedi*listeFiyati*80/100);
            }else {
                System.out.println("%15 indirimli toplam fiyat :" + urunAdedi*listeFiyati*85/100);
            }


        } else if (kartVarMi == 'H') {
            if (urunAdedi>10){
                System.out.println("%15 indirimli toplam fiyat :" + urunAdedi*listeFiyati*85/100);
            }else {
                System.out.println("%10 indirimli toplam fiyat :" + urunAdedi*listeFiyati*90/100);
            }


        }else {
            System.out.println("Kart bilgisi hatali");
        }


    }
}
