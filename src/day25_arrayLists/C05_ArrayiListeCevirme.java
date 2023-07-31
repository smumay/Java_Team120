package day25_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] arr ={1,3,5,8,9,7,2,5,6,4,2,0,8,2};

        List<Integer> forList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            forList.add(arr[i]);

        }

        System.out.println(forList);

        List<Integer> hazirMethodList = Arrays.asList(arr);

        System.out.println(hazirMethodList);

    }
}
