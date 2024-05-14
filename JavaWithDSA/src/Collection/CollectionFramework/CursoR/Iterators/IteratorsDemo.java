package Collection.CollectionFramework.CursoR.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IteratorsDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Raj");
        al.add("Yadav");
        al.add("Deepak");
        al.add("Yash");
        al.add("Baba");
        System.out.println(al);
        System.out.println("---------------------------------");
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
        System.out.println("---------------------------------");
        Vector v = new Vector();
        v.addElement("aaa");
        v.addElement("bb");
        v.addElement("cc");
        v.addElement("dddd");
        System.out.println(v);
        System.out.println("---------------------------------");
        Iterator itr1 = v.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next()+" ");
        }




    }
}
