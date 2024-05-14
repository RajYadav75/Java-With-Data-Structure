package Collection.Lists.LinkedListss;

import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Deepak");
        ll.add("Raj");
        ll.addFirst("Papa");
        ll.add(3, "Baba");
        ll.addLast("Mummy");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println(ll);
    }
}
