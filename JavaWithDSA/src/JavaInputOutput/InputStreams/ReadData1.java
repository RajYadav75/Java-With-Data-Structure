package JavaInputOutput.InputStreams;

import java.io.FileInputStream;

public class ReadData1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("/home/babayaga/Desktop/JavaWithDSA/src/ObjectOrientedProgramming/BankAccount.java");
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
            fis.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            try {
                fis.close();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}