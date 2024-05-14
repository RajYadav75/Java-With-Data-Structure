package Collection.Sets.SortedSets.NavigableSets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet ns = new TreeSet();
        ns.add("Raj");
        ns.add("Yadav");
        ns.add("Bhagwan");
        ns.add("Deepak");

        System.out.println(ns);

        System.out.println(ns.descendingSet());

        System.out.println(ns.ceiling("Bhagwan"));
        System.out.println(ns.higher("Bhagwan"));

        System.out.println(ns.floor("Bhagwan"));
        System.out.println(ns.pollFirst());
        System.out.println(ns.pollLast());
    }
}
