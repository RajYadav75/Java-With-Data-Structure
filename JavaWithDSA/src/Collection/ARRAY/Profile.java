package Collection.ARRAY;

public class Profile {
    String dob;
    int age;
    String  pho;
    String  city;
    String  name;
    Profile(String name, String dob,int age, String pho, String city){
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.city = city;
        this.pho = pho;
    }
    void welcome(){
        System.out.println("--------------------------------");
        System.out.println("Welcome : "+name);
        System.out.println("DOB : "+dob);
        System.out.println("age : "+age);
        System.out.println("City : "+city);
        System.out.println("Pho : "+pho);
    }
    void display(){

    }
}