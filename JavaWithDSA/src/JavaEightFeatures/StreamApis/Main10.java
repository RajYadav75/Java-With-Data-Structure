package JavaEightFeatures.StreamApis;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// Sum of all even number
public class Main10 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(69);
        al.add(29);
        al.add(10);
        al.add(502);
        al.add(59);

        Stream<Integer> s= al.stream();
        int result = s.filter(e->e%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}
