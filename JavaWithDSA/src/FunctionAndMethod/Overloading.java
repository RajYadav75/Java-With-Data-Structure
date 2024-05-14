package Function_and_Method;

import java.util.Scanner;

public class Overloading {
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int multiply(int a, int b, int c){
        return a * b * c;
    }
    public static float multiply(float a, float b){
        return a * b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println(multiply(a,b));
        System.out.println(multiply(a,b,5));
        System.out.println(multiply(45.2,2.0));
        System.out.println(multiply(13.55f,2.1f));

    }
}
