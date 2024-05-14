package Collection.Sets.SortedSets.TreeSets;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        TreeSet ts = new TreeSet(al);
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        System.out.println(ts);
    }
}
