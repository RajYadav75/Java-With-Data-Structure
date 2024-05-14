package StaticKeyword;
class Employee{
    int empid;
    String empname;
    static String empcomname = "RajProgramming";
    Employee(int empid, String empname){
        this.empid = empid;
        this.empname = empname;
    }
    void display(){
        System.out.println("-------------------Employee Details--------------------- ");
        System.out.println("Employee Id : "+empid);
        System.out.println("Employee Name : "+empname);
        System.out.println("Employee CompanyName : "+empcomname);
        System.out.println();
    }
}
public class Static1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Raj");
        Employee e2 = new Employee(102,"Bhagwan");
        Employee e3 = new Employee(103,"Baba Yaga");
        e1.display();
        e2.display();
        e3.display();
    }
}
