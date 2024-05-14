import java.util.Scanner;

public class CalculateSum {
    public static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int a = s.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = s.nextInt();
        // int ans = sum(a,b);
        System.out.println(sum(a,b));
    }
}
