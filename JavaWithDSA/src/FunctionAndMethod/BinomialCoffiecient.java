import java.util.Scanner;

public class BinomialCoffiecient {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i ++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        int ncr = factN/(factR*factNR);
        System.out.println(ncr);
    }
}
