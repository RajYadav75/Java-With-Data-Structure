package Strings;

import java.util.Scanner;

public class IntroStrings {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        char[] ch = {'a','b','c','d'};
        String str = "Baba Yaga";
        String str2 = "Raj is BabaYaga.";
        // String is immutable in Java.
        Scanner sc = new Scanner(System.in);
        String name;

//        name = sc.next(); //Only first one word
//        System.out.println(name);
        String nm = sc.nextLine(); // Take full line as input
        System.out.println(nm);
    }
}
