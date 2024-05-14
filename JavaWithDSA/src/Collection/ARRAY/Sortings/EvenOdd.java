package Collection.ARRAY.Sortings;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        int even_count = 0, odd_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                even_count++;
                System.out.print("Even No : "+arr[i]+" \n");
            }else {
                odd_count++;
                System.out.print("Odd No : "+arr[i]+" \n");
            }
        }
        System.out.println("=================================================");
        System.out.println("No of even no's are : "+even_count);
        System.out.println("No of odd no's are : "+odd_count);
    }
}
