package Maps.Sortedmap.Navigablemap.Treemap;

import java.util.Comparator;
import java.util.TreeMap;
class NameComparision implements Comparator{
    @Override
    public int compare(Object o, Object t1) {
        Integer i = (Integer) o;
        Integer ii = (Integer) t1;
        return -i.compareTo(ii);
    }
}
public class Main1 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap(new NameComparision());
        tm.put(106,"Raj");
        tm.put(107,"Baba");
        tm.put(103,"Bhagwan");
        tm.put(104,"Deepak");
        tm.put(105,"Ankita");
        tm.put(101,"Haiji");
        System.out.println(tm);
    }
}
