package Conditional;

import java.util.Scanner;

public class MaxOfTwoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("max is "+a);
        } else if(b>c && b>a) {
            System.out.println("max is "+b);
        }else {
            System.out.println("max is "+c);
        }
    }
}
