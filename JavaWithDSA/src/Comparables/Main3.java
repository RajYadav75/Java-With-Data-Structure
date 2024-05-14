package Comparables;


import java.util.TreeSet;

class Student1 implements Comparable{
    int rollNo;
    String name;
    public Student1(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Object o) {
        Student1 st = (Student1) o;
        int i = this.name.compareTo(st.name);
        return -i; //for decending order
    }

    @Override
    public String toString() {
        return  rollNo+" - "+name;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101,"Raj");
        Student1 s2 = new Student1(102,"Deepak");
        Student1 s3 = new Student1(103, "Bhagwan");
        Student1 s4 = new Student1(104, "Baba");

        TreeSet ts = new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);
    }
}
