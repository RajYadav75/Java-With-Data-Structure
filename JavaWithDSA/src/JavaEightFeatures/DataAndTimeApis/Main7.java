package JavaEightFeatures.DataAndTimeApis;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main7 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);


        LocalTime ltt = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(ltt.format(dtf));

        System.out.println(dtf.format(ltt));


        LocalTime lttt = LocalTime.now();
       int time =  lttt.getHour();
        System.out.println(time);
    }
}
