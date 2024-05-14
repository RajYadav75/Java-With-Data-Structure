package Collection.ARRAY;

public class DifferentWaytoPrint {
    static int[] a= {1,2,3,4};
    public static void main(String[] args) {
        DifferentWaytoPrint f = new DifferentWaytoPrint();
        f.For();
        f.While();
        f.ForEach();
        f.Reverse();
        System.out.println();
        System.out.println("======================================");
        String[] str = {"Deepak","Bhagwan","Raj Yadav","Panther"};
        for(String s: str){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("======================================");
    }
    void For(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("======================================");
    }
    void While(){
        int i = 0;
        while(i <a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println();
        System.out.println("======================================");
    }
    void ForEach(){
        for(int array:a){
            System.out.print(array+" ");
        }
        System.out.println("\n======================================");
    }
    void Reverse(){
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
