package Recursion;

public class FriendsPairingProblem {
    public static int friendPairing(int n){
        //Base Case
        if (n == 1 || n == 2){
            return n;
        }
        int fnm1 = friendPairing(n-1);
        int fnm2 = friendPairing(n-2);
        int pairWays = (n-1)*fnm2;
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
}
