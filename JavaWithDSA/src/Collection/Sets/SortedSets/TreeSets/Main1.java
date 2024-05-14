package Collection.Sets.SortedSets.TreeSets;

import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();// by default ascending order
        ts.add("eee");  // first element, it will create as root node.
        ts.add("ggg"); // internally work compareTo(), "ggg".compareTo("eee") return +ve(Right hand side)
        ts.add("bbb");// "bbb".compareTo("eee") return -ve(Left hand side)
        ts.add("ddd");
        ts.add("ccc");
        ts.add("aaa");
        ts.add("fff");

        System.out.println(ts);// Retrieving (Left-Root-Right)


    }
}
