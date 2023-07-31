package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        ArrayList<String> isimler2 = new ArrayList<>();

        System.out.println(isimler);

        isimler.add("Burhan");
        isimler.add("Seref");
        isimler.add("Gulsah");

        System.out.println(isimler);

        isimler.add(2,"Nergis");

        System.out.println(isimler);


    }
}
