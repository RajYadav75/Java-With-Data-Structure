package Collection.Lists.ArrayLists;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        ArrayList al1 = new ArrayList();
        al1.add("Raj");
        al1.add("Bhagwan");

        al.addAll(al1);
        System.out.println(al);
        al.addAll(2,al1);
        System.out.println(al);
        System.out.println(al1);
    }
}
