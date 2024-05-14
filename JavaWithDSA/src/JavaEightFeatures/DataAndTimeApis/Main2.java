package JavaEightFeatures.DataAndTimeApis;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2 {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String curr_date = sdf1.format(d);
        System.out.println(curr_date);
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String curr_time = sdf2.format(d);
        System.out.println(curr_time);
    }
}
