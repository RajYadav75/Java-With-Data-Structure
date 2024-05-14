package Maps.HashMaps.IdentityHashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Main1 {
    public static void main(String[] args) {
        Integer i= new Integer(100);
        Integer ii = new Integer(100);
        HashMap hm = new HashMap();

        hm.put(i,"Raj");
        hm.put(ii,"Raja");
        System.out.println(hm);

        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(i,"raj");
        ihm.put(ii,"raja");
        System.out.println(ihm);
    }
}
