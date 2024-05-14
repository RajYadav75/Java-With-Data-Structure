package JavaEightFeatures.StreamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
*    How to get Stream Instance
**/
public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(19);
        al.add(29);
        al.add(39);
        al.add(49);
        al.add(59);

        // Ist ways to get Stream instance(Most Use)
        Stream<Integer> s1 = al.stream();
        s1.forEach(e-> System.out.println(e));

        //2nd way to get Stream instance
        Stream S2 = Stream.of(al);
        S2.forEach(e-> System.out.println(e));

        //3rd way to get Stream instance
        Stream s3 = Stream.of(100,2000,3000,400000);
        s3.forEach(e-> System.out.println(e));

        //4th way to get Stream instance
        int[] arr = {1,2,3,4,5};
        IntStream s4 = Arrays.stream(arr);
        s4.forEach(e-> System.out.println(e));

        //5th way to get Stream instance
        Stream s5 = Stream.empty();
        //6th way to get Stream instance
        Stream s6 = Stream.builder().build();
    }
}
