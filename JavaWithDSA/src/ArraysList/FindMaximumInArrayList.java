package ArraysList;

import java.util.ArrayList;

public class FindMaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(12);
        list.add(14);
        list.add(43);
        int max = Integer.MIN_VALUE;
        System.out.println(list);
        System.out.println("========================================");
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Max element : "+max);
    }
}
