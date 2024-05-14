package Constructor;
class Student{
    int rollNo;
    String name;
    Student(int rollNo1, String name1){
        rollNo = rollNo1;
        name = name1;
    }
    void show(){
        System.out.println("Name is "+name+" Roll No is "+rollNo);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Raj");
        Student s2 = new Student(102, "Deepak");
        Student s3 = new Student(103, "Bhagwan");

        s1.show();
        s2.show();
        s3.show();
    }
}
