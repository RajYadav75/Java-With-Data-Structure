package JavaEightFeatures.DataAndTimeApis;

import java.time.LocalDate;

public class Main5 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.isLeapYear());
        LocalDate ldnew = ld.minusDays(9);
        System.out.println(ldnew);
        LocalDate ldneww = ld.plusMonths(7);
        System.out.println(ldneww);
    }
}
