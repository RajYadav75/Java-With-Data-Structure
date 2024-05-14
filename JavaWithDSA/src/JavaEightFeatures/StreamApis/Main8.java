package JavaEightFeatures.StreamApis;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main8 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(69);
        al.add(29);
        al.add(10);
        al.add(5);
        al.add(59);

        Stream<Integer> s= al.stream();
//        s.sorted().forEach(e-> System.out.println(e));
        s.sorted((x,y)->-x.compareTo((y))).forEach(e-> System.out.println(e));
    }
}
