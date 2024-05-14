package Collection.CollectionFramework.CursoR.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Raj");
        al.add("Yadav");
        al.add("Deepak");
        al.add("Yash");
        al.add("Baba");
        System.out.println(al);
        System.out.println("---------------------------------");
        ArrayList al1 = new ArrayList();

        Iterator itr = al.iterator();
        while (itr.hasNext()){
//            System.out.println(itr.next()+" ");
            String element = (String) itr.next();
            if (element.equals("Raj")){
                itr.remove();
                System.out.println("Element remove successfully");
            }else {
                al1.add(element);
            }
        }
        System.out.println(al1);
        System.out.println("---------------------------------");
    }
}
