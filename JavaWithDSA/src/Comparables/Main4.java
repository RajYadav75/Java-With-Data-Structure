package Comparables;


import java.util.TreeSet;

class Student2 implements Comparable{
    int rollNo;
    String name;
    public Student2(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Object o) {
        Student2 st = (Student2) o;
        Integer i1 = new Integer(this.rollNo);
        Integer i2 = new Integer(st.rollNo);
//        if (i1>i2){
//            return -1;
//        }else if (i1<i2){
//            return 1;
//        }else {
//            return 0;
//        }
        //or
        int val = i1.compareTo(i2);
        return val;
    }

    @Override
    public String toString() {
        return  rollNo+" - "+name;
    }
}
public class Main4 {
    public static void main(String[] args) {
        Student2 s1 = new Student2(101,"Raj");
        Student2 s2 = new Student2(102,"Deepak");
        Student2 s3 = new Student2(103, "Bhagwan");
        Student2 s4 = new Student2(104, "Baba");

        TreeSet ts = new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);
    }
}
