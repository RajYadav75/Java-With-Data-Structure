package JavaEightFeatures.DataAndTimeApis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main3new {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);


        LocalDate ld2 = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(ld2.format(dtf));


        LocalDate ld3 = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf1.format(ld3));



    }
}
