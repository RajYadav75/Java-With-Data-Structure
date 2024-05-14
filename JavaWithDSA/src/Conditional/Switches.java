package Conditional;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,ch;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Enter your choice 1->Addition\n 2->Subtraction\n3->Multiply\n4->Division");
        ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}
