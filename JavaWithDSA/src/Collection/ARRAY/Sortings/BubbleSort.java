package Collection.ARRAY.Sortings;

public class BubbleSort {
    static void sortingInt(int[] a){
        for (int pass=0; pass<a.length; pass++){
            int temp;
            int flag =0;
            for (int i = 0; i < a.length-1-pass; i++) {
                if (a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;

                    flag = 1;
                }
            }
            if (flag == 0){
                break;
            }
        }
        System.out.println("Final List");
        for(int i:a){
            System.out.print(i+"  ");
        }
        System.out.println("\n====================================");
    }
    static void sortingString(String[] a){
        for (int pass=0; pass<a.length; pass++){
            String  temp;
            int flag =0;
            for (int i = 0; i < a.length-1-pass; i++) {
                if ((a[i].compareTo(a[i+1]))>0){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;

                    flag = 1;
                }
            }
            if (flag == 0){
                break;
            }
        }
        System.out.println("Final List");
        for(String i:a){
            System.out.print(i+"  ");
        }
        System.out.println("\n====================================");
    }

    public static void main(String[] args) {
        int[] arr = {40,20,70,80,10,90,60};

        String[] str= {"Raj","Deepak","Yash","Bhagwan","Panther"};
        sortingString(str);
        sortingInt(arr);
    }
}
