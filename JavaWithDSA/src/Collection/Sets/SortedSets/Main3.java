package Collection.Sets.SortedSets;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet();
        ss.add(45);
        ss.add(23);
        ss.add(99);
        ss.add(13);
        SortedSet s = new TreeSet();
        s.add("Raj");
        s.add("Baba");
        s.add("Yadav");
        s.add("Bhagwan");
        System.out.println(ss+"\n"+s);

        System.out.println("================================================");
        System.out.println(ss.first());
        System.out.println(s.first());
        System.out.println(ss.last());
        System.out.println(s.last());

        System.out.println(ss.headSet(99));
        System.out.println(s.headSet("Raj"));

        System.out.println(ss.tailSet(99));
        System.out.println(s.tailSet("Raj"));

        System.out.println(s.subSet("Baba","Raj"));
        System.out.println(ss.subSet(13,45));
    }
}
