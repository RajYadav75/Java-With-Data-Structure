package Collection.Lists.ArrayLists;

import java.util.ArrayList;

public class Main11 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("Raj");

        System.out.println(al.size());
        Object[] obj=al.toArray();
        System.out.print("[ ");
        for(Object o: obj){
            System.out.print(o+" ");
        }
        System.out.println("]");
    }
}
