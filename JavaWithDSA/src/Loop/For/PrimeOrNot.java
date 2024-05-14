package Loop.For;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of number : ");
        int n = s.nextInt();
        if(n == 2){
            System.out.println(" 2 is prime number");
        }else {
            boolean isPrime = true;
            for (int i = 2; i <= n-1; i ++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if (isPrime == true){
                System.out.println("n is prime");
            }else {
                System.out.println("n is not prime");
            }
        }
    }
}
