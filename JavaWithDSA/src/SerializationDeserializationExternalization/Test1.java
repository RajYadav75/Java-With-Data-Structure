package SerializationDeserializationExternalization;

import java.io.*;

class Student1 implements Serializable
{
    static String  name;
    int rollNo;
    transient String school;
    Student1(String name, int rollNo, String school){

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
public class Test1 {
    public static void main(String[] args) {
        try{
            //----------------------------Serialization-------------------------------------------------
            FileOutputStream fos = new FileOutputStream("/home/babayaga/Desktop/student1.txt");
            Student1 s1 = new Student1("Raj1",1011, "Raj Programming1");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);

            //----------------------------Deserialization-------------------------------------------------
            FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/student1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student1 s =(Student1)ois.readObject();
            s.show();
        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
