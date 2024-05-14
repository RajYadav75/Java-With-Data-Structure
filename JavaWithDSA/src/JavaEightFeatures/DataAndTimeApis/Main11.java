package JavaEightFeatures.DataAndTimeApis;

import java.util.TimeZone;

public class Main11 {
    public static void main(String[] args) {
        String[] arr = TimeZone.getAvailableIDs();
        for (String st:arr){
            System.out.println(st);
        }
    }
}
