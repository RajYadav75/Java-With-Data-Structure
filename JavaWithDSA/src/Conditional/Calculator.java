package Conditional;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter your choice 1->Addition\n 2->Subtraction\n3->Multiply\n4->Division");
        int ch = sc.nextInt();
        if (ch == 1){
            System.out.println(a+b);
        } else if (ch == 2) {
            System.out.println(a-b);
        } else if (ch == 3) {
            System.out.println(a*b);
        } else if (ch == 4) {
            System.out.println(a / b);
        }else {
            System.out.println("Invalid Selection");
        }

    }
}
