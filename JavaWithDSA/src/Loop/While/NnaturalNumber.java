package Loops.Whillle;

import java.util.Scanner;

public class NnaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1, n;
        n=sc.nextInt();
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }
}
