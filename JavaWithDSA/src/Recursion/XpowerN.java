package Recursion;

public class XpowerN {
    public static int power(int x, int n){
        if (n == 0){
            return  1;
        }
//        int xhm1 = power(x,n-1);
//        int xn = x * xhm1;
//        return xn;
        return x * power(x, n-1);
    }
    // optimize
    public static int optimizePower(int x, int n){
        if( n == 0){
            return 1;
        }
        int halfPower = optimizePower(x, n/2);
        int halfPowerSQ = halfPower * halfPower;
        // n is odd
        if(n % 2 != 0){
            halfPowerSQ = x * halfPowerSQ;
        }
        return halfPowerSQ;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(optimizePower(2,5));
    }
}
