package day21_arrays;

import java.util.ArrayList;
import java.util.List;

public class OgrenciPractice {

    public static void main(String[] args) {

        String [] str = {"Burhan","Nergiz","Seref","Senol"};

        stringManupulation(str);


    }


    public static void stringManupulation(String [] str){

        List<String> yeniList = new ArrayList<>();

        for (String each: str
             ) {
            if (each.length() % 2 == 0){
                yeniList.add(each.substring(0,each.length()/2));
            }else {
                yeniList.add(each.substring((each.length()-1)/2));
            }

        }

        System.out.println(yeniList);
    }
}
