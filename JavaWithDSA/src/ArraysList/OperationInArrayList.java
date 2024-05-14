package ArraysList;
import java.util.ArrayList;
public class OperationInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("========================================");
        //get operation
        int element = list.get(2); //index 2
        System.out.println(element);
        System.out.println("========================================");
        //remove operation
//        list.remove(2);
        System.out.println(list);
        System.out.println("========================================");
        //set element at index operation
//        list.set(index, new value);
        list.set(2,5);
        System.out.println(list);
        System.out.println("========================================");
        /*
        contain operation
        contains element check element present or not in list
        */

        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
        System.out.println("========================================");
        //Diff add function
        list.add(1,9);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("========================================");
        // print the Arraylist
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
