package JavaEightFeatures.DataAndTimeApis;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Main10 {
    public static void main(String[] args) {
        LocalTime indianTime = LocalTime.now();
        ZoneId zi = ZoneId.of("America/New_York");
        LocalTime americaTime = LocalTime.now(zi);

        long l = ChronoUnit.HOURS.between(indianTime,americaTime);
        System.out.println(l);



    }
}
