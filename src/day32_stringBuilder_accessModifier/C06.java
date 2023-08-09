package day32_stringBuilder_accessModifier;

public class C06 {
    public static void main(String[] args) {


        C05 obj = new C05();

        //System.out.println(obj.privateSayi);

        System.out.println(obj.defaultSayi);
        obj.defaultSayi=20;
        System.out.println(obj.defaultSayi);

        System.out.println(obj.protectedSayi);
        obj.protectedSayi=30;
        System.out.println(obj.protectedSayi);


        System.out.println(obj.publicSayi);
        obj.publicSayi=50;
        System.out.println(obj.publicSayi);






    }
}