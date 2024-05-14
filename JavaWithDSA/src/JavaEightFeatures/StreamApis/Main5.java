package JavaEightFeatures.StreamApis;

import java.util.ArrayList;
import java.util.stream.Stream;

// WAP to print the square of each number
public class Main5 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        Stream<Integer> s1 = al.stream();
        s1.map(e->e*e).forEach(e-> System.out.println(e));
    }
}
