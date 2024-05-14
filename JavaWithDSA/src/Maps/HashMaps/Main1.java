package Maps.HashMaps;

import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(101,"Raj");
        hm.put(102,"Baba");
        hm.put(103,"Bhagwan");
        hm.put(104,"God");
        hm.put(105,"Yadav");
        System.out.println(hm);
        System.out.println(hm.get(103));
        System.out.println(hm.remove(103));
        System.out.println(hm);
//        hm.clear();
//        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.containsKey(104));
        System.out.println(hm.containsValue("Bhagwan"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());

    }
}
