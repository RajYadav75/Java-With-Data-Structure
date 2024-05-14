package JavaEightFeatures.DataAndTimeApis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main4 {
    public static void main(String[] args) {

        String selected_date = "01-Jan-2000";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate ld = LocalDate.parse(selected_date,dtf);
        System.out.println(ld);
    }
}
