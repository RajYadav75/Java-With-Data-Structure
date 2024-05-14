package SerializationDeserializationExternalization;

import java.io.*;
class Aa implements Serializable
{

}
class Student2 extends Aa
{
    String  name;
    int rollNo;
    String school;
    Student2(String name, int rollNo, String school){

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
public class Test2 {
    public static void main(String[] args) {
        try{
            //----------------------------Serialization-------------------------------------------------
            FileOutputStream fos = new FileOutputStream("/home/babayaga/Desktop/student2.txt");
            Student2 s1 = new Student2("Raj1",1011, "Raj Programming1");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);

            //----------------------------Deserialization-------------------------------------------------
            FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/student2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student2 s =(Student2)ois.readObject();
            s.show();
        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
