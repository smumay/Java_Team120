package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListMethodlar {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar);

        System.out.println(sayilar.size());
        System.out.println(sayilar.isEmpty());

        sayilar.add(3);
        sayilar.add(5);

        System.out.println(sayilar);
        System.out.println(sayilar.size());
        System.out.println(sayilar.isEmpty());

        System.out.println(sayilar.get(1));

        System.out.println(sayilar.contains(3));

        List<Integer> tumsayilar = new ArrayList<>();

        tumsayilar.add(1);
        tumsayilar.add(3);
        tumsayilar.add(5);
        tumsayilar.add(7);


        System.out.println(tumsayilar.containsAll(sayilar));







    }
}
