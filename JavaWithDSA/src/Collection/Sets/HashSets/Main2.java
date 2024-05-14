package Collection.Sets.HashSets;

import java.util.ArrayList;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);

        HashSet hs = new HashSet(al);
        hs.add("Raj");
        hs.add("Baba");
        hs.add(1);
        hs.add("Arya");
        System.out.println(hs);
    }
}
