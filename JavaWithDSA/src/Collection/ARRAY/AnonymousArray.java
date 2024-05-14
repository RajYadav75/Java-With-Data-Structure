package Collection.ARRAY;

public class AnonymousArray {
    public static void main(String[] args) {
        sum(new int[]{10,20,30});
    }
    static void sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of array is : "+sum);
    }
}
