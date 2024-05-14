package Collection.Lists.Vectors;

import java.util.Vector;

public class Main2 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        System.out.println(v.capacity());
        System.out.println("---------------------------------------");
        for(int i=0; i<6; i++){
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println("---------------------------------------");

        Vector v1 = new Vector(8, 2);
        System.out.println(v1.capacity());
        System.out.println("---------------------------------------");

        for (int i = 0; i < 9; i++) {
            v1.addElement(i);
        }
        System.out.println(v1);
        System.out.println(v1.capacity());
        System.out.println("---------------------------------------");
    }
}
