package ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(10);
        list.add(3);
        System.out.println(list);
        System.out.println("========================================");
        Collections.sort(list);// ascending order
        System.out.println(list);
        System.out.println("========================================");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println("========================================");
    }
}
