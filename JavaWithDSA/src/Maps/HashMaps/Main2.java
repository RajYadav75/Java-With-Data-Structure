package Maps.HashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(101,"Raj");
        hm.put(102,"Baba");
        hm.put(103,"Bhagwan");
        hm.put(104,"God");
        hm.put(105,"Yadav");

        System.out.println(hm);

        Set s = hm.entrySet();
        System.out.println(s);

        Iterator it =s.iterator();
        while (it.hasNext()){
//            System.out.println(it.next());
            Map.Entry entry= (Map.Entry)it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("-------------------------");
        }

    }
}
