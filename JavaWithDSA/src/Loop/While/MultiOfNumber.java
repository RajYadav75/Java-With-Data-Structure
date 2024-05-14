package Loops.Whillle;

import java.util.Scanner;

public class MultiOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,n,mul=1;
        n=sc.nextInt();
        while (i<=n){
            mul *= i;
            i++;
        }
        System.out.println("Mul  "+mul);
    }
}
