package Collection.Lists.Vectors;

import java.util.Vector;

public class Main1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());

        Vector v1 = new Vector(20);
        System.out.println(v1.capacity());
        System.out.println("---------------------------------------");
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println("---------------------------------------");
        Vector v2 = new Vector();
        for (int i = 0; i < 11; i++) {
            v2.addElement(i);
        }
        System.out.println(v2);
        System.out.println(v2.capacity());
        System.out.println("---------------------------------------");
    }
}
