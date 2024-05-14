package Searching;

public class BinarySearching {
    public static int binarySearch(int number[] , int key){
        int start =0, end =number.length-1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(number[mid] == key){
                return mid;
            }
            if (number[mid] < key)
                start = mid+1;
            else
                end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7,8,12,35};
        int key =12;
        System.out.println("index for key  is : "+binarySearch(number, key));
    }
}
