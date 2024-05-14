package JavaEightFeatures.StreamApis;

import java.util.ArrayList;

// Wap to count all the even number in An ArrayList
public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(19);
        al.add(29);
        al.add(30);
        al.add(40);
        al.add(59);
        System.out.println(al.stream().filter(e->e%2==0).count());
        System.out.println(al.stream().filter((e->e>20)).count());
    }
}
