package Collection.Lists.LinkedListss;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Hulk");
        al.add("IronMan");
        al.add("Thor");
        al.add("Batman");
        al.add("Superman");

        LinkedList ll = new LinkedList(al);
        ll.addFirst("Bajrang Bali");
        System.out.println(ll);

    }
}
