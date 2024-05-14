package Collection.ARRAY;

public class Test {
    /*int[] rollNo; // prefered ways
    int [] b;
    int []c;
    int d[];
    Test[] t;*/
//    int[5] rollno; error







    public static void main(String[] args) {
        /*Test ob1 = new Test();
        Test ob2 = new Test();*/

        int[] a; // Declaration
        a = new int[5];  // Creation

        int[] b = new int[8];  //declaration and creation
        initialize();
        creatDeclarInita();

    }
    void Declaration(){

        /*int[] a,b;  both are array;
        int []a,b;   both are array;
        int a[],b;  a is array and b is normal varialbe;
        int a,b[];  a is  normal varialbe and b is array;
        int a[],b[]; both are array;
        int []a,b[]; both are array;*/
    }

    void Creation(){
        /*int a = new int[5];  error
        int a = new int[];  error
        int[] a= new int[5]; Right
        int a[]= new int[5]; Right
        int []a= new [5]int; error
        int[] a= new int[0]; Right
        int[] a= new int[-3]; It will compile but provide runtime exceptions i.e. java.lang.NegativeArraySizeException*/
    }
    static void initialize(){
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
//        a[-1] = 50;//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    static void creatDeclarInita(){
        int[] a = {10,20,30};
        System.out.println(a); // a is reference variable
    }
}
