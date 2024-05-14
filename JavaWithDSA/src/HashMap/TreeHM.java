package HashMap;

import java.util.TreeMap;

public class TreeHM {
    public static void main(String[] args) {
        TreeMap<String,Integer> thm = new TreeMap<>();
        thm.put("India",100);
        thm.put("China",90);
        thm.put("US",50);

        System.out.println(thm);
    }
}
