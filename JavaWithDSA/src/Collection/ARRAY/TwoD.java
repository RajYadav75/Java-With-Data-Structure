package Collection.ARRAY;

public class TwoD {
    public static void main(String[] args) {
        TwoD t = new TwoD();
        t.Declaration();
        t.Retrieve();
        t.display();
    }
    void Declaration(){
        int[][] a;  // prefered ways
        int [][]a1;
        int[][]a2;
        int     [][]     a3;
        int []a4[];
    }
    void Retrieve(){
        int[][] a = {{1,2,3},{4,5,6}};
        /*System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[0][0]);
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println();*/

        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);//[I@5e2de80c [I@1d44bcfa
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=================================");
    }
    void display(){
        int[][] a = new int[2][3];
        int[][] b = {{1,2,3},{4,5,6}};
        int[][] c= new int[][]{{12,13,14},{1,2,3}};
        for (int i = 0; i < c.length; i++) {
//            System.out.println(a[i]);//[I@5e2de80c [I@1d44bcfa
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
