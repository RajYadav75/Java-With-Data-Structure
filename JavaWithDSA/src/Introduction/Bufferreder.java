package Basic;

import java.io.*;

public class Bufferreder {
    public static void main(String[] args) throws IOException {
        int a,b,sum;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of a : ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of b : ");
        b = Integer.parseInt(br.readLine());
        sum = a + b;
        System.out.println("Sum of these number  is : "+sum);

    }
}
