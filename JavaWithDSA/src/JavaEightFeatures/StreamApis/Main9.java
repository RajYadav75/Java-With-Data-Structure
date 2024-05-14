package JavaEightFeatures.StreamApis;

import java.util.ArrayList;
import java.util.stream.Stream;
// Wap to get minimum and maximum element in Arraylist
public class Main9 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(69);
        al.add(29);
        al.add(10);
        al.add(5);
        al.add(59);

        Stream<Integer> s= al.stream();
        int min = s.min((x,y)->x.compareTo(y)).get();
        System.out.println("Minimum element is "+min);

        Stream<Integer> s1= al.stream();
        int max = s1.max((x,y)->x.compareTo(y)).get();
        System.out.println("Maximum element is : "+max);
    }
}
