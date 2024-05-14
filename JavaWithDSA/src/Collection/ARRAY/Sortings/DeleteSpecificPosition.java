package Collection.ARRAY.Sortings;

public class DeleteSpecificPosition {
    public static void main(String[] args) {
        int[] arr = {10,50,30,80,90,70};
        int element = 30;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element)
            {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
