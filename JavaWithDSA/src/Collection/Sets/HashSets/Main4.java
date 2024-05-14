package Collection.Sets.HashSets;

import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Raj");
        hs.add("Baba");
        hs.add(1);
        hs.add("Arya");
        System.out.println( hs.size());

        System.out.println(hs);
        hs.remove("Baba");
        System.out.println(hs);
        hs.clear();
        System.out.println(hs);

    }
}
