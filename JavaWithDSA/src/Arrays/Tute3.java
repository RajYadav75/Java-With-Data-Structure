package Arrays;

public class Tute3 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int firstNumber = 0, lastNumber = arr.length-1;
        while (firstNumber < lastNumber){
            int temp = arr[lastNumber];
            arr[lastNumber] = arr[firstNumber];
            arr[firstNumber] = temp;
            firstNumber++;
            lastNumber--;
        }
        System.out.println("Reverse order of my arrays: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
