package BasicSortingAlgorithm;
import java.util.Arrays;
import java.util.Collections;

public class JavaInbuiltsort {
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        Arrays.sort(arr); //Ascending Order
       printArray(arr);
        Integer[] arr2 = {5,4,1,3,2};
        Arrays.sort(arr2, Collections.reverseOrder());
//        printArray(arr2);

    }
}
