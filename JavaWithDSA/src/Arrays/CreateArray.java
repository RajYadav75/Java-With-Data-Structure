package Arrays;

import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
//        datatype []arrayName = new datatype[size];
        int[] marks = new int[50];
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"apple", "mango", "orange", "litchi"};
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Phy = "+marks[2]);
        System.out.println("Chem = "+marks[1]);
        System.out.println("Math = "+marks[0]);
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println(percentage);
    }
}
