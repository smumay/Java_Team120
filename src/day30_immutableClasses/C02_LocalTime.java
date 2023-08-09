package day30_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

    public static void main(String[] args) {


        LocalTime time = LocalTime.now();

        System.out.println(time);

        System.out.println(time.getHour());

        System.out.println(time.getMinute());

        System.out.println(time.minusMinutes(1000));

        System.out.println(time.minusHours(100));

        System.out.println(time.plusSeconds(10000));

        System.out.println(time.withHour(15));

        System.out.println(time.withSecond(0).withNano(0));

        LocalTime time1 = LocalTime.of(12,35);
        LocalTime time2 = LocalTime.of(14,34);


        System.out.println(time1.isBefore(time2));

        System.out.println(time1.isAfter(time2));

        LocalTime time3 = LocalTime.now(ZoneId.of("Europe/Berlin"));

        System.out.println(time3);


    }
}
