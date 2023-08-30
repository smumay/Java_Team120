package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C04_NestedMap {

    public static void main(String[] args) {

        //101={isim=Ali,soyisim=Can,sinif=11,sube=H,bolum=MF}
        //102=Veli-Cem-10-K-TM,
        //103=Ali-Cem-11-K-TM,

        Map<Integer,Map<String,Object>> ogrenciMap = new HashMap<>();

        Map<String,Object>  ogrenci101Bilgileri = new HashMap<>();
        ogrenci101Bilgileri.put("isim","Ali");
        ogrenci101Bilgileri.put("soyisim","Can");
        ogrenci101Bilgileri.put("sinif",11);
        ogrenci101Bilgileri.put("sube","H");
        ogrenci101Bilgileri.put("bolum","MF");


        Map<String,Object>  ogrenci102Bilgileri = new HashMap<>();
        ogrenci101Bilgileri.put("isim","Veli");
        ogrenci101Bilgileri.put("soyisim","Cem");
        ogrenci101Bilgileri.put("sinif",10);
        ogrenci101Bilgileri.put("sube","K");
        ogrenci101Bilgileri.put("bolum","TM");

        Map<String,Object>  ogrenci103Bilgileri = new HashMap<>();
        ogrenci101Bilgileri.put("isim","Ali");
        ogrenci101Bilgileri.put("soyisim","Cem");
        ogrenci101Bilgileri.put("sinif",11);
        ogrenci101Bilgileri.put("sube","K");
        ogrenci101Bilgileri.put("bolum","TM");


        ogrenciMap.put(101,ogrenci101Bilgileri);
        ogrenciMap.put(102,ogrenci101Bilgileri);
        ogrenciMap.put(103,ogrenci101Bilgileri);


        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.get(103).get("soyisim"));

        System.out.println(ogrenciMap.get(101).get("isim"));

    }
}
