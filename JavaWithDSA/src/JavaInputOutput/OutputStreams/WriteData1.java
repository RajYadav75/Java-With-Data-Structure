package JavaInputOutput.OutputStreams;

import java.io.FileOutputStream;

public class WriteData1 {
    public static void main(String[] args) {
        try {
            String data = "This is my first Demo in FileOutputStream and done by Raj Yadav Raj is good";
            FileOutputStream fos = new FileOutputStream("/home/babayaga/Desktop/raj.txt",true);
            byte[] b = data.getBytes();
            fos.write(b);
            fos.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
