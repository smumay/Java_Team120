package day29_passByValue;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("parametresiz constructor calisti");
    }

    static {
        System.out.println("static blok 2 calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
        C01_StaticBlocks obj = new C01_StaticBlocks();
        System.out.println("obje olusturuldu");

    }

    static {
        System.out.println("static blok 1 calisti");
    }


}
