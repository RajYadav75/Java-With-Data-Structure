package Dynamic_Programming;
import java.util.*;
public class ClimbingStairTabulation {
    public static int countWaysTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        //tabulation loop
        for (int i =1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i - 1] + 0;
            }else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        System.out.println(countWaysTab(n));
    }
}
