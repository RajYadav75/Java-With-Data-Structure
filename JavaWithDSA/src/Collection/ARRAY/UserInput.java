package Collection.ARRAY;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number at "+(i+1)+" position");
            arr[i] = s.nextInt();
        }
        for (int i: arr){
            System.out.print(i+" ");
        }

    }
}
