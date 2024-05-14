package Function_and_Method;

import java.util.Scanner;

public class ProductAB {
    public static int proAB(int a, int b){
        int ans = a * b;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = proAB(a, b);
        System.out.println(product);
    }
}
