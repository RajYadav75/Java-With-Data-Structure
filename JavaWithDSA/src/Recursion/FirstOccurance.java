package Recursion;

public class FirstOccurance {
    public static int firstOccur(int[] curr, int key, int i){
        if (i == curr.length){
            return  -1;
        }if (curr[i] == key){
            return i;
        }
        return firstOccur(curr,key,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(firstOccur(arr,5,0));
    }
}
