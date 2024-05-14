package JavaEightFeatures.StreamApis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Wap to get all the even numbers in an arraylist
public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(19);
        al.add(29);
        al.add(30);
        al.add(40);
        al.add(59);
        /*for(int i: al){
            if (i%2 == 0){
                System.out.println(i);
            }
        }*/
        // 1st way
        Stream<Integer> s = al.stream();
        List<Integer> l = s.filter(e->e%2 == 0).collect(Collectors.toList());
        System.out.println(l);
        //2nd way
        Stream<Integer> s1 = al.stream();
        s1.filter(e->e%2 == 0).forEach(e-> System.out.println(e));
        // 3rd way
        al.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));

        String name = "Raj";
        int leng = name.concat("java").toUpperCase().length();
        System.out.println(leng);

    }
}
