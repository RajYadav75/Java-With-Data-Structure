package Collection.ARRAY;

public class ThreeD {
    public static void main(String[] args) {
        ThreeD d = new ThreeD();
        d.Declaration();
        d.Creation();
        d.Initialization();
        d.Retrieve();
    }
    void Initialization(){
        int[][][] a= new int[2][2][3];
        a[0][0][2] = 100;
        System.out.println(a[0][0][2]);

        int[][][] b = {{{1,2,3},{1,2,3}},{{2,5,5},{4,5,6}}};

    }
    void Declaration(){
        int[][][] a1;
        int[] [][]a2;
        int [][][]a3;
        int []a4[][];
        int [][]a5[];
        int a6[][][];

        /*int[][][]a,b; both are 3D array
        int [][]a[],b; a is 3D array and b is 2D array.
        int[][]a[],b[]; a is b are 3D array
        int [][][]a,b[];  a is 3D and B is 4D array.
        int [][][]a,[]b; error*/
    }
    void Creation(){
        /*int[][][] a;
        a = new int[2][2][3];*/
        int[][][] a= new int[2][2][3];
        /*int[][][] a;
        a = new int[2][2][2]; correct
        a = new int[2][2][]; correct
        a= new int[2][][]; correct
        a= new int[][][]; Incorrect
        a = new int[2][][4]; Incorrect*/
    }
    void Retrieve(){
        int[][][] b = {{{1,2,3},{1,2,3}},{{2,5,5},{4,5,6}}};
        System.out.println(b); //[[[I@5e2de80c
        System.out.println(b[0]); //[[I@1d44bcfa
        System.out.println(b[0][0]); //[I@266474c2
        System.out.println(b[0][0][0]); //1
        System.out.println("====================================");
        System.out.println(b.length);
        System.out.println(b[0].length);
        System.out.println(b[0][0].length);
        System.out.println("====================================");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < b[i][j].length; k++) {
                    System.out.print(b[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
