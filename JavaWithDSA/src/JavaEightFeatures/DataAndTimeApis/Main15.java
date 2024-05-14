package JavaEightFeatures.DataAndTimeApis;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Main15 {
    public static void main(String[] args) {
        Duration d = Duration.ofHours(1);
        System.out.println(d.getSeconds());


        Duration dd = Duration.of(1, ChronoUnit.MINUTES);
        System.out.println(dd);
    }
}
