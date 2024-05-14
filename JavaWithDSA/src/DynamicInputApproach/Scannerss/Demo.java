package DynamicInputApproach.Scannerss;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Email : ");
        String email = s.nextLine();
        System.out.println("Enter Password : ");
        String pass = s.nextLine();
        if (email.equals("admin@gmail.com") && pass.equals("admin123")){
            System.out.println("Login SuccessFully");
        }
        else {
            System.out.println("Login Failed");
        }
    }
}
