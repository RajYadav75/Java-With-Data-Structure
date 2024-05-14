package Function_and_Method;

import java.util.Scanner;

public class BinomialCoefficient {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int factn = factorial(n);
        int factr = factorial(r);
        int factnr = factorial(n-r);

        int ncr = factn / (factr * factnr);
        System.out.println(ncr);
    }
}
