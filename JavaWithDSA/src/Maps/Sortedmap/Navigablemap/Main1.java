package Maps.Sortedmap.Navigablemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {
        NavigableMap nm = new TreeMap();
        nm.put(101,"Raj");
        nm.put(102,"Baba");
        nm.put(103,"Bhagwan");
        nm.put(104,"Deepak");
        nm.put(105,"Ankita");
        nm.put(106,"Haiji");
        System.out.println(nm);

        System.out.println(nm.descendingMap());
        System.out.println(nm.ceilingKey(103));
        System.out.println(nm.higherKey(103));
        System.out.println(nm.higherEntry(103));
        System.out.println(nm.ceilingEntry(103));
        System.out.println(nm.descendingKeySet());
        System.out.println(nm.lowerKey(103));
        System.out.println(nm.lowerEntry(103));
        System.out.println(nm.floorEntry(103));
        System.out.println(nm.floorKey(103));

        System.out.println(nm.pollFirstEntry());
        System.out.println(nm);
        System.out.println(nm.pollLastEntry());
        System.out.println(nm);
    }
}
