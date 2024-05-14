import java.util.Scanner;

public class FindProduct {
    public static int multiplyFind(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = s.nextInt();
        System.out.println("Enter the second number : ");
        int b = s.nextInt();
        System.out.println("Here is answer : "+multiplyFind(a, b));
    }
}
