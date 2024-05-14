package Collection.ARRAY;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Email ID : ");
        String email = s.next();
        System.out.println("Enter the Password ID : ");
        String pass = s.next();
        if (email.equals("admin@gmail.com") && pass.equals("admin123")){
            System.out.println("Successfully Login");
            String name = "Raj";  // name came from Database
            String dob = "01-01-2000";
            String city = "Uttar Pradesh";
            String phoneNo = "083294983249";
            int age = 20;
            Profile p = new Profile(name,dob,age,phoneNo,city);
            p.welcome();
        }else {
            System.out.println("Invalid Login");
        }
    }
}
