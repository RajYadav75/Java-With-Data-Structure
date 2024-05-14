package JavaInputOutput.OutputStreams;

import java.io.FileOutputStream;

public class WriteData2 {
    public static void main(String[] args) {
        try {
            String data = "This is my first Demo in FileOutputStream and done by Raj Yadav";
            FileOutputStream fos = new FileOutputStream("/home/babayaga/Desktop/raj.txt",false);
            byte[] b = data.getBytes();
            fos.write(b);
            fos.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
