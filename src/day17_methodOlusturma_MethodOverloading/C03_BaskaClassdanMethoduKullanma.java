package day17_methodOlusturma_MethodOverloading;

import day16_methodOlusturma_Kullanma.C01_MethodOlusturma;
import day16_methodOlusturma_Kullanma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethoduKullanma {

    public static void main(String[] args) {


        C01_MethodOlusturma.altString("Method budur...", 7,8);
        System.out.println(C03_MethodOlusturma.isimDuzenle("Ali", "kemal"));
        System.out.println(C01_AsalSayiBulma.asalSayiMi(20));

        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(21));

    }


}
