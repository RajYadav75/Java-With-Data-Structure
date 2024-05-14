package FunctionAndMethod;

import java.util.Scanner;

class CalculateSum {
    public static int calSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calSum(a, b);
        System.out.println("Sum is : "+ sum);
    }
}
