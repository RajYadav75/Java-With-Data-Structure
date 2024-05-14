package Collection.ARRAY;

import java.util.Scanner;

public class PasswordGenerator {
    static String name;
    static int dob;
    static String  getSpecifiedString(){
        String  newName;
        char c = name.charAt(0);
        if (c=='a' || c=='e' ||c=='i' || c=='o' || c=='u'){
//            newName = name.substring(1,3);
            char c1 = name.charAt(0);
            char c2 = name.charAt(1);
            newName = String.valueOf(c1)+String.valueOf(c2).toUpperCase();
        }else {
            char c1 = name.charAt(0);
            char c2 = name.charAt(name.length()-1);
            newName = String.valueOf(c1)+String.valueOf(c2).toUpperCase();
        }
        return newName;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = s.next();
        System.out.println("Enter DOB : ");
        dob = s.nextInt();

        String newName = PasswordGenerator.getSpecifiedString();
        int newDob = PasswordGenerator.dobAlgo();

        String  newPass = "RP"+newName+"@"+newDob;
        System.out.println("Your Password is : "+newPass);
    }
    static int dobAlgo(){
        int newDob=0, rem;
        while ((dob!=0)){
            rem = dob%10;
            newDob = newDob*10+rem;
            dob = dob/10;
        }
        return (newDob+100);
    }
}
