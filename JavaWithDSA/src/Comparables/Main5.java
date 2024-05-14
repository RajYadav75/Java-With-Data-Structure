package Comparables;


import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class Student4 implements Comparable{
    int rollNo;
    String name;
    public Student4(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Object o) {
        Student4 st = (Student4) o;
        int i = this.name.compareTo(st.name);
        return i; //for decending order
    }

    @Override
    public String toString() {
        return  rollNo+" - "+name;
    }
}
public class Main5 {
    public static void main(String[] args) {
        Student4 s1 = new Student4(101,"Raj");
        Student4 s2 = new Student4(102,"Deepak");
        Student4 s3 = new Student4(103, "Bhagwan");
        Student4 s4 = new Student4(104, "Baba");

        ArrayList ts = new ArrayList();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        Collections.sort(ts);
        System.out.println(ts);
    }
}
