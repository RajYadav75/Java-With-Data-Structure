package Maps.HashTable;

import java.util.Hashtable;

public class Main2 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(101, "Raj");
        ht.put(105, "Yash");
        ht.put(103, "Bhagwan");
        ht.put(102, null);
        ht.put(null, "Baba");
        System.out.println(ht);
    }
}
