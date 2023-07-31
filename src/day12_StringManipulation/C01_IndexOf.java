package day12_StringManipulation;

public class C01_IndexOf {

    public static void main(String[] args) {

        String str = "Ali topu at,topu at ali";

        System.out.println(str.indexOf("top"));


        System.out.println(str.indexOf("top", 5));

        System.out.println("soru cozumu********************");


        int ilkIndex = str.indexOf("at");

        if (ilkIndex == -1){
            System.out.println("2 kere kullanilmamis");
        }else {
            int ikinciIndex = str.indexOf("at",ilkIndex+1);
            if (ikinciIndex == -1){

            }else{
                System.out.println("2 kere veya daha fazla kullanilmis");
            }
        }

    }
}
