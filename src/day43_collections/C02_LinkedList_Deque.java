package day43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList_Deque {

    public static void main(String[] args) {

        Deque<String> isimler = new LinkedList<>();

        isimler.add("Cemil");
        isimler.addFirst("Resul");

        System.out.println(isimler);
        isimler.addLast("Mehmet");
        isimler.addLast("Resul");
        isimler.add("Eyyüp");
        isimler.add("Kaan");

        System.out.println(isimler);

        System.out.println(isimler.removeLast());

        System.out.println(isimler);

        System.out.println(isimler.removeLastOccurrence("Resul"));

        System.out.println(isimler);

        System.out.println(isimler.removeLastOccurrence("Hilal"));


        System.out.println(isimler.pollFirst());

        System.out.println(isimler.pop());

        System.out.println(isimler.offerFirst("Bugra"));

        System.out.println(isimler.peekFirst());

        System.out.println(isimler.element());

        System.out.println(isimler.hashCode());

        isimler.clear();

        System.out.println(isimler.hashCode());


        isimler.add("Kahraman");

        System.out.println(isimler.hashCode());

        System.out.println(isimler);


    }
}
