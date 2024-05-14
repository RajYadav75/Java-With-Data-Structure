package Maps.HashMaps.WeekHashmap;

import java.util.WeakHashMap;

public class Main3
{
    public static void main(String[] args) {
        Integer i1 = new Integer(101);
        Integer i2 = new Integer(102);

        WeakHashMap hm = new WeakHashMap();
        hm.put(i1,"Raj");
        hm.put(i2,"Yash");

        i2 = null;
        System.gc();

        System.out.println(hm);
    }
}
