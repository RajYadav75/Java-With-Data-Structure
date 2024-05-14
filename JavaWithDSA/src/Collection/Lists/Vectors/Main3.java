package Collection.Lists.Vectors;

import java.util.Vector;

public class Main3 {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("---------------------------------------");
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println(v.firstElement());
        System.out.println("---------------------------------------");
        System.out.println(v.lastElement());
        System.out.println("---------------------------------------");
        System.out.println(v.removeElement(5));
        System.out.println(v);
        System.out.println("---------------------------------------");
        v.removeAllElements();
        System.out.println(v);
        System.out.println("---------------------------------------");
    }
}
