package day12_StringManipilation;

public class Q7 {

    public static void main(String[] args) {

        //Soru 7 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        // sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        // input : java1 ogRe2@nMek3 #ne +Gu=zel output : Java ogrenmek ne guzel.



            String input = "java1 ogRe2@nMek3 #ne +Gu=zel";

            input = input.replaceAll("\\d","");
        System.out.println(input);

        input = input.replaceAll("\\W","");
        System.out.println(input);








    }
}
