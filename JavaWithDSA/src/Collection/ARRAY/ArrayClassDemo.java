package Collection.ARRAY;
import java.util.Arrays;
public class ArrayClassDemo {
    public static void main(String[] args) {
        int[] a= {2,1,3,3,2,5,6,7,3,4,5};
        Arrays.sort(a);
        for(int arr:a){
            System.out.print(arr+" ");
        }
    }
}
