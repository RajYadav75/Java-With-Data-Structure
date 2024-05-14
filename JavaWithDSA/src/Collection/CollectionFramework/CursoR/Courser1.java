package Collection.CollectionFramework.CursoR;

import java.util.ArrayList;

public class Courser1 {
    String name;
    int id;

    @Override
    public String toString() {
        return name+" "+id;
    }

    public static void main(String[] args) {
        Courser1 c = new Courser1();
        c.id = 101;
        c.name = "Raj";
//        System.out.println(c);
        System.out.println(c);

        System.out.println("\n========================================================");
        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("ddd");
        System.out.println(al);
    }
}
