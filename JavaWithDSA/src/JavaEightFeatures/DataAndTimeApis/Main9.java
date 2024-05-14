package JavaEightFeatures.DataAndTimeApis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Main9 {
    public static void main(String[] args) {
        ZoneId zi = ZoneId.of("America/New_York");

        LocalDate ld = LocalDate.now(zi);
        System.out.println(ld);

        LocalTime lt = LocalTime.now(zi);
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now(zi);
        System.out.println(ldt);
    }
}
