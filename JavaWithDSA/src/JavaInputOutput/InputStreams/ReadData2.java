package JavaInputOutput.InputStreams;

import java.io.FileInputStream;

public class ReadData2 {
    public static void main(String[] args) {

        try(
                FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/JavaWithDSA/src/ObjectOrientedProgramming/BankAccount.java");

        ){
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}