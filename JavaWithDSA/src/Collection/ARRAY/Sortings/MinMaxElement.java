package Collection.ARRAY.Sortings;

public class MinMaxElement {
    static void findMinimumElement(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum element \n"+min +"\n=================================================");

    }

    static void findMaxElement(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Maximum element \n"+max +"\n=================================================");
    }

    public static void main(String[] args) {
        int[] a = {23,1,2,4,56,75,855555555,563};
        findMinimumElement(a);
        findMaxElement(a);
    }
}
