package Arrays;
// Kadane's Algorithm
public class MaxSubArraySum3 {
    public static void kadanes(int[] numbers){
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Our max Subarray Sum is : "+ maxSum);
    }
    public static void main(String[] args) {
        int[] numbers = {1,-2,6,-1,3};
        kadanes(numbers);
    }
}
