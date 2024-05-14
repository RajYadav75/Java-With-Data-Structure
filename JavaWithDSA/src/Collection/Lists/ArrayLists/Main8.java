package Collection.Lists.ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main8 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("Raj");


        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add("Baba");


       /* System.out.println(al.contains(20));
        System.out.println(al.contains("Raj"));
        System.out.println(al.contains("Baba"));
*/
        System.out.println(al.contains(al1));

        al.add(al1);
        System.out.println(al.contains(al1));

    }
}
