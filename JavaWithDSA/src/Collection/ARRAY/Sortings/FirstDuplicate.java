package Collection.ARRAY.Sortings;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[] arr = {20,30,70,90,10,60,30,70};
        boolean b = false;
        System.out.println("Duplicates Elements are :- ");
        for (int i=0; i< arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    b = true;
                }
            }
            if (b == true){
                break;
            }
        }
    }
}
