package Loops.Whillle;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,sum=0,n;
        n=sc.nextInt();
        while (i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum  "+sum);
    }
}
