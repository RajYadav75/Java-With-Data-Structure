package JavaEightFeatures.DataAndTimeApis;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class AgeCalculator{
    public static  void calculateAge(LocalDate dob,LocalDate todayDate) {
        Period p = Period.between(dob,todayDate);
        System.out.println(p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days ");
    }
}
public class Main14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Date : ");
        int date = s.nextInt();

        System.out.println("Enter Month : ");
        int month = s.nextInt();

        System.out.println("Enter Year : ");
        int year = s.nextInt();


        LocalDate ld1 = LocalDate.of(year,month,date);
        LocalDate ld2 = LocalDate.now();
        AgeCalculator.calculateAge(ld1,ld2);
    }
}
