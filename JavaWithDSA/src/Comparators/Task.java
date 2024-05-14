package Comparators;


import java.util.Comparator;
import java.util.TreeSet;


class MySorting implements Comparator{
    @Override
    public int compare(Object o, Object o1) {
        String s1 = o.toString();
        String s2 = o1.toString();

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1> len2){
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
        else {
            return s1.compareTo(s2);
        }
    }
}
public class Task {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MySorting());
        ts.add("aaaa");
        ts.add("bb");
        ts.add("a");
        ts.add("bbb");
        ts.add("aa");
        ts.add("aaa");
        ts.add("b");
        System.out.println(ts);
    }
}
