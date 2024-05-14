package Recursion;

public class PrintSortedArray {
    public static boolean isSorted(int[] arr, int i){
        if (i == arr.length - 1){
            return true;
        }
        if (arr[i] > arr[i + 1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4,9,8,7};
        System.out.println(isSorted(arr,arr.length-1));
    }
}
