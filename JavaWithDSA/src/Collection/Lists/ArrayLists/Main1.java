package Collection.Lists.ArrayLists;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); //capacity 10 size 0
        al.add(1);
        al.add(4);
        al.add(2);
        al.add("Raj");
//        al.add(5,"Raj");
        al.add(4,"Bhagwan");
        al.add(3,"Baba");
        System.out.println(al);
    }
}
