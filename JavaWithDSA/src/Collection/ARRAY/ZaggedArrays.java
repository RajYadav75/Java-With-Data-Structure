package Collection.ARRAY;

public class ZaggedArrays {
    public static void main(String[] args) {
        /*
        int[][] a = new int[3][];
        a[0] = new int[4];
        a[1] = new int[3];
        a[2] = new int[5];
        */
        int[][] a= {{1,2,3,4},{5,6,7},{8,9,12,13,15}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
