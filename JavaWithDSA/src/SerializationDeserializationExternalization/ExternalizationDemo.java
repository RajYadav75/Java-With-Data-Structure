package SerializationDeserializationExternalization;

import java.io.*;

class Employee implements Externalizable
{
    String name;
    int empId;
    String email;
    String phoneNo;
    public Employee()
    {

    }
    public Employee(String  name, int empId, String  email, String phoneNo){
        this.name = name;
        this.empId = empId;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        String[] new_email = email.split("@");
        String new_email1 = new_email[0];

        String[] new_phone = phoneNo.split(" ");
        String new_phone1 = new_phone[1];
        objectOutput.writeUTF(name);
        objectOutput.writeInt(empId);
        objectOutput.writeUTF(new_email1);
        objectOutput.writeUTF(new_phone1);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        name = objectInput.readUTF();
        empId = objectInput.readInt();
        email = objectInput.readUTF()+"@gmail.com";
        phoneNo = "+91 "+objectInput.readUTF();
    }
    void show(){
        System.out.println("---------------------------Employee Details----------------------------");
        System.out.println("Name : "+name+" \nEmployee Id : "+empId+" \nemail ID : "+email+" \nPhoneNo : "+phoneNo);
    }
}
public class ExternalizationDemo {
    public static void main(String[] args) {
        try {
            //---------------------------------------Serialization with Externalization---------------------------
            Employee emp1 = new Employee("Raj", 101, "raj@gmail.com","+91 83829424080");
            FileOutputStream fos = new FileOutputStream("/home/babayaga/Desktop/employ.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp1);
            //---------------------------------------Deserialization---------------------------

            FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/employ.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee empp = (Employee) ois.readObject();
            empp.show();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
