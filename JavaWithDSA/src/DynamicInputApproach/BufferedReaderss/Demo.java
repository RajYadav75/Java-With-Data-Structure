package DynamicInputApproach.BufferedReaderss;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter Name : ");
            String  i = br.readLine();
            System.out.println(i);

            br.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
