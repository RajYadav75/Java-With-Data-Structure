package Maps.HashTable;

import java.util.Hashtable;
class A{
    int i;
    public int hashCode(){
        return i;
    }
    A(int i){
        this.i = i;
    }

    @Override
    public String toString() {
        return  i+"";
    }
}

public class Main5 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(101, "Raj");
        ht.put(105, "Yash");
        ht.put(103, "Bhagwan");
        ht.put(102, "Kaka");
        ht.put(104, "Baba");
        System.out.println(ht);
        A ob = new A(12);
        System.out.println(ob.hashCode());
    }
}
