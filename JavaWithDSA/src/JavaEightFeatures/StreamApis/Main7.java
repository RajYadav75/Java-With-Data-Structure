package JavaEightFeatures.StreamApis;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main7 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Rajnarayan");
        str.add("DeepakKumar");
        str.add("Rajn");
        str.add("Rajana");
        Stream<String> s = str.stream();
        s.sorted().forEach(e-> System.out.println(e));
    }
}
