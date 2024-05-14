import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        int f = 1;
        for(int i = 1; i <= n; i ++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter that number which you want to find factorial : ");
        int n = s.nextInt();
        System.out.println(fact(n));
    }
}
