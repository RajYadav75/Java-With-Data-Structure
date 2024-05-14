package Collection.Lists.ArrayLists;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(50);
        al.add("Raj");
        al.add(90);
        al.add(20);
//        al.remove("Raj");
        al.remove(2);
        al.remove(al);//not work
        al.removeAll(al);
        System.out.println(al);
    }
}
