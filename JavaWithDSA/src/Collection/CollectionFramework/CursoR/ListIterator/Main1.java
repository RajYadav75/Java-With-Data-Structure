package Collection.CollectionFramework.CursoR.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Raj");
        al.add("baba");
        al.add("Puja");
        System.out.println(al);
        System.out.println("----------------------------------------------");
        //-------------------Forward Direction------------------------------------
        ListIterator li = al.listIterator();
        while (li.hasNext()){
            System.out.print(li.next()+" ");
        }
        System.out.println("\n-----------------------------------------");
        //--------------------Backward Direction----------------------------------------
        while (li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
        System.out.println("\n-----------------------------------------");
    }
}
