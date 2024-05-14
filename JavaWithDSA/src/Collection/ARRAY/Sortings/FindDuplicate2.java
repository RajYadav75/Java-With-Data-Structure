package Collection.ARRAY.Sortings;

public class FindDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {20,30,70,90,10,60,30,70};
        int count = 0;
        System.out.println("Duplicates Elements are :- ");
        for (int i=0; i< arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    System.out.println(count+". "+arr[i]);
                }
            }
        }
    }
}
