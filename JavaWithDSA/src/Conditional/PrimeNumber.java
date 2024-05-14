package Conditional;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 2;
        boolean b = false;
        for (int i = 2; i < n; i++){
            if (n % i == 0) {
                b = true;
                break;
            }
        }
        if (b){
            System.out.println("Number is not prime");
        }else {
            System.out.println("numebr is prime");
        }
    }
}
