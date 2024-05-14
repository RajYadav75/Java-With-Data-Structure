package Collection.Lists.ArrayLists;

import java.util.ArrayList;

public class Main9 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("Raj");

        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);




        System.out.println(al);
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
        System.out.println(al1);
    }
}
