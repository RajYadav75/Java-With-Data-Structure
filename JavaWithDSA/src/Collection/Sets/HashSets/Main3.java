package Collection.Sets.HashSets;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
//        HashSet hs = new HashSet(4,.80f);
        HashSet hs = new HashSet();
        hs.add("Raj");
        hs.add("Baba");
        hs.add(1);
        hs.add("Arya");
        hs.add("Raj");
        System.out.println(hs);
    }
}
