package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TreeMapMethodlari {

    public static void main(String[] args) {

        TreeMap<String,Integer> harfler = new TreeMap<>();
        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);

        System.out.println(harfler);

        System.out.println(harfler.tailMap("L"));
        System.out.println(harfler.tailMap("C"));

        System.out.println(harfler.tailMap("L", false));

        System.out.println(harfler.headMap("T"));
        System.out.println(harfler.headMap("M"));

        System.out.println(harfler.ceilingEntry("K"));
        System.out.println(harfler.ceilingEntry("N"));


        System.out.println(harfler.higherEntry("K"));
    }
}
