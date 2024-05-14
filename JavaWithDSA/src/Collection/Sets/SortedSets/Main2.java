package Collection.Sets.SortedSets;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet();
        ss.add("Raj");
        ss.add("Baba");
        ss.add("Yadav");
        ss.add("Bhagwan");
        try {
            ss.add(new StringBuffer("Yash"));
        }
        catch (Exception e){
            System.out.println(e);
        }


        System.out.println(ss);
        System.out.println("----------------------------------");
        SortedSet s = new TreeSet();
        s.add(11);
        s.add(2);
        s.add(0);
        s.add(1);
        s.add(0);
        System.out.println(s);
    }
}
