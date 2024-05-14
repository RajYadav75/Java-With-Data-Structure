package Maps.Sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main1
{
    public static void main(String[] args) {
        SortedMap sm = new TreeMap();
        sm.put(101,"Raj");
        sm.put(102,"Yash");
        sm.put(103,"Baba");
        sm.put(104,"Hulk");
        sm.put(105,"Bhagwan");
        sm.put(106,"Deepak");

        System.out.println(sm);

        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.headMap(104));
        System.out.println(sm.tailMap(104));
        System.out.println(sm.subMap(102,105));
    }
}
