package Collection.ARRAY.Sortings;

public class EvenOdd2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        //--------------- Check no of even and odd numbers(even:2, odd:4)---------------
        int even_count = 0, odd_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                even_count++;
            }else {
                odd_count++;
            }
        }
        // ---------------Create an array of even and odd numbers.---------------
        int[] even_arr = new int[even_count];
        int[] odd_arr = new int[odd_count];
        //---------------put values in even and odd array---------------
        int evenIndexPos = 0, oddIndexpos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
               even_arr[evenIndexPos] = arr[i];
               evenIndexPos++;
            }else {
                odd_arr[oddIndexpos] = arr[i];
                oddIndexpos++;
            }
        }
        //---------------Printing an Arrays---------------
        for (int i:even_arr){
            System.out.print(i+" ");
        }
        System.out.println("\n============");
        for (int j:odd_arr){
            System.out.print(j+" ");
        }
    }
}