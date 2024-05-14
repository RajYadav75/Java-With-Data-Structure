package Collection.Lists.ArrayLists;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr);
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        for (Object o:al){
            System.out.print(o+" ");
        }
        System.out.println();
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }
    }
}
