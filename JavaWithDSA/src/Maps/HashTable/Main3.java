package Maps.HashTable;

import java.util.Hashtable;

public class Main3 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(101, "Raj");
        ht.put(105, "Yash");
        ht.put(103, "Bhagwan");
        ht.put(102, "Kaka");
        ht.put(104, "Baba");
        System.out.println(ht);
        Main3 m = new Main3();
        System.out.println(m.hashCode());
    }
}
