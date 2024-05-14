package SerializationDeserializationExternalization;

import java.io.*;

class Student implements Serializable
{
    String  name;
    int rollNo;
    String school;
    Student(String name, int rollNo, String school){

        this.name = name;
        this.rollNo = rollNo;
        this.school = school;
    }
    public void show()
    {
        System.out.println("-----------------Student Details------------------------");
        System.out.println("Name : "+name+" \nRollNo : "+rollNo+" \nSchool Name : "+school);
    }
}
public class Test {
    public static void main(String[] args) {
        try{
            //----------------------------Serialization-------------------------------------------------
            FileOutputStream fos = new FileOutputStream("/home/babayaga/Desktop/student.txt");
            Student s1 = new Student("Raj",101, "Raj Programming");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);

            //----------------------------Deserialization-------------------------------------------------
            FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s =(Student)ois.readObject();
            s.show();
        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
