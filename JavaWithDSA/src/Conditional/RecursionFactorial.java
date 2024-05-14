package Conditional;

public class RecursionFactorial {
    static int fact = 1;
    public static void main(String[] args) {
        int n = 5;
        RecursionFactorial ob = new RecursionFactorial();
        ob.calcFact(n);
        System.out.println(fact);
    }
    void calcFact(int n){
        if (n >= 1){
            fact = fact * n;
            n--;
            calcFact(n);
        }
    }
}
