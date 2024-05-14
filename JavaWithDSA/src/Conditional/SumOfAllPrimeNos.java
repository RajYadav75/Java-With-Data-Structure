package Conditional;

public class SumOfAllPrimeNos {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 10; i++){
            boolean b = false;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    b = true;
                }
            }
            if (!b){
                sum+=i;
            }
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
