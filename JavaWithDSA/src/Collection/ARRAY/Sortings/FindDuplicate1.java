package Collection.ARRAY.Sortings;

public class FindDuplicate1 {
    public static void main(String[] args) {
        int[] arr = {20,30,70,90,10,60,30,70};
        //Sorting
        int temp;
        for (int p =0; p < arr.length; p++)
        {
            for (int i = 0; i < arr.length -1; i++)
            {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        // match the elements
        System.out.println("Duplicate element of array :- ");
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1])
            {
                System.out.println(arr[i]+" ");
            }
        }
    }
}
