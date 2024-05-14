package Comparables;


import java.util.TreeSet;

class Student implements Comparable{
    int rollNo;
    String name;
    public Student(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Object o) {
        Student st = (Student) o;
        int i = this.name.compareTo(st.name);
        return i;
    }

    @Override
    public String toString() {
        return  rollNo+" - "+name;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Raj");
        Student s2 = new Student(102,"Deepak");
        Student s3 = new Student(103, "Bhagwan");
        Student s4 = new Student(104, "Baba");

        TreeSet ts = new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);
    }
}
