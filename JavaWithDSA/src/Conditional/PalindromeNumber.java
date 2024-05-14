package Conditional;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 12321;
        int rem, rev = 0;
        while (n != 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.println("n : "+n);
        System.out.println("rev : "+rev);
        if (n == rev){
            System.out.println("number is palindrome number");
        }else {
            System.out.println("Number is not palindrome number");
        }
    }
}
