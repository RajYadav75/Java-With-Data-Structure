package JavaEightFeatures.DataAndTimeApis;

import java.time.LocalDate;
import java.time.Month;

public class Main6 {
    public static void main(String[] args) {
        LocalDate ld= LocalDate.of(2024, 03,2);
        System.out.println(ld.isLeapYear());
    }
}
