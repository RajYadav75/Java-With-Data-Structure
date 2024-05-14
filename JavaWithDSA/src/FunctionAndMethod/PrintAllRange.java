package Function_and_Method;

public class PrintAllRange {
    public static boolean iPrime(int n){ //optimize
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeinRange(int n){
        for (int i = 2; i <= n; i++) {
            if(iPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        primeinRange(100);
    }
}
