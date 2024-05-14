package Comparators;

import java.util.Comparator;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101,"Raj");
        Student1 s2 = new Student1(102,"Deepak");
        Student1 s3 = new Student1(103, "Bhagwan");
        Student1 s4 = new Student1(104, "Baba");

        TreeSet ts1 = new TreeSet(new SortbyName());
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);
        System.out.println(ts1);
        TreeSet ts2 = new TreeSet(new SortbyRollNo());
        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);
        System.out.println(ts2);
    }
}
class Student1{
    int rollNo;
    String name;

    public Student1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo +" - "+name;
    }
}
class SortbyName implements Comparator{//class SortbyName extends Object implements Comparator

    @Override
    public int compare(Object o, Object o1) {
        Student1 ss = (Student1) o;
        Student1 sss = (Student1) o1;
        int i = ss.name.compareTo(sss.name);
        return i;
    }
}
class SortbyRollNo implements Comparator{
    @Override
    public int compare(Object o, Object t1) {
        Student1 ss = (Student1) o;
        Student1 sss = (Student1) t1;
        Integer i1 = new Integer(ss.rollNo);
        Integer i2 = new Integer(sss.rollNo);
        int i = i1.compareTo(i2);
        return i;
    }
}