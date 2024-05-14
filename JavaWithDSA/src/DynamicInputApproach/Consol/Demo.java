package DynamicInputApproach.Consol;  // by terminal we have to comment package name

import java.io.Console;
// This program is run in Terminal or CMD
public class Demo {
    public static void main(String[] args) {
        try{
            Console c = System.console();
            String email = c.readLine("Enter Email : ");
            char[] pass = c.readPassword("Enter Password : ");
            String  pass1 = new String(pass);
            if (email.equals("admin@gmail.com") && pass1.equals("admin123")){
                System.out.println("Login SuccessFully");
            }
            else {
                System.out.println("Login Failed");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
