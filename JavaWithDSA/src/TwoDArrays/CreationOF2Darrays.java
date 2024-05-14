package TwoDimensionArrays;

import java.util.Scanner;

public class CreationOF2Darrays {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = 3, m = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <  m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
