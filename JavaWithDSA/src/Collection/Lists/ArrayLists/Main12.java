package Collection.Lists.ArrayLists;

import java.util.ArrayList;

public class Main12 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("Raj");

        System.out.println(al.get(2));
//        System.out.println(al.get(6));
        al.set(1,"Baba");
        System.out.println(al);

        System.out.println(al.indexOf(10));
        System.out.println(al.lastIndexOf(30));
    }
}
