public class PrimeorNot {
    public static boolean isPrime(int n){
        boolean prime = true;
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= n; i ++){
            if(n % i == 0){
                prime = false ;
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
}