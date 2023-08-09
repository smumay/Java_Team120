package day33_encapsulation_inheritance;

public class C02_SatinAlma {

    public static void main(String[] args) {

        C01_Pazarlama pazarlama = new C01_Pazarlama();

            /*C01_Pazarlama pazarlama = new C01_Pazarlama();

            pazarlama.satis=200;

        System.out.println(pazarlama.satis);

        pazarlama.toplamSatis= 500;
        System.out.println(pazarlama.toplamSatis);
             */


            pazarlama.setSatis(100);
            pazarlama.setSatis(200);
            pazarlama.setSatis(400);

        System.out.println(pazarlama.getToplamSatis());


    }
}
