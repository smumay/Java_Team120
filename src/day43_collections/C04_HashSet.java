package day43_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class C04_HashSet {

    public static void main(String[] args) {


       /*Soru : Bir HashSet ve TreeSet olusturun.
         Bir loop ile bu set’lere element ekleyip sureleri karsilastirin.

*/
        HashSet<Integer> hashSet = new HashSet<>();

        TreeSet<Integer> treeSet = new TreeSet<>();

        Random rnd = new Random();

        int hasBas = LocalTime.now().getNano();

        for (int i = 1; i <=10000 ; i++) {
            hashSet.add(rnd.nextInt(1000));
        }
        int hasBit = LocalTime.now().getNano();
        System.out.println("Hash set süresi: " + (hasBit-hasBas));
        //System.out.println(hashSet);

        int treeBas = LocalTime.now().getNano();
        for (int i = 1; i <=10000 ; i++) {
            treeSet.add(rnd.nextInt(1000));
        }
        int treeBit = LocalTime.now().getNano();
        System.out.println("Tree set süresi: " + (treeBit-treeBas));
        //System.out.println(treeSet);
    }
}
