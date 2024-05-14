package Recursion;

public class TillingProblem {
    public static int tillingProb(int n){
        if ( n == 0 || n == 1){
            return 1;
        }
        //vertical choice
        int fnm1 = tillingProb(n-1);
        // Horizontal choice
        int fnm2 = tillingProb(n-2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tillingProb(2));
        System.out.println(tillingProb(4));
    }
}
