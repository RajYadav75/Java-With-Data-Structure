package JavaEightFeatures.StreamApis;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        // Wap to print all the string value whose length is greater than 5("Rajnarayan","Deepak","Amit","Rahul")
        // Wap to print all the names whose name start with R
        ArrayList<String> str = new ArrayList<>();
        str.add("Rajnarayan");
        str.add("DeepakKumar");
        str.add("Rajn");
        str.add("Rajana");
        System.out.println(str.stream().filter(e->e.length()>5).count());
        System.out.println(str.stream().filter(e->e.startsWith("R")).collect(Collectors.toList()));
    }
}
