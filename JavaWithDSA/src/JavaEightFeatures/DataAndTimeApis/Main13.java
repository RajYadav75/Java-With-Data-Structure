package JavaEightFeatures.DataAndTimeApis;

import java.time.Year;
import java.time.YearMonth;

public class Main13 {
    public static void main(String[] args) {
        Year y = Year.now();
        System.out.println(y);
        System.out.println(y.atDay(33));

        YearMonth ym = YearMonth.now();
        System.out.println(ym);
    }
}
