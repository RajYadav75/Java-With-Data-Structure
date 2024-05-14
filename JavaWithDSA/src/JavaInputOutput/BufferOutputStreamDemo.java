package JavaInputOutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutputStreamDemo {
    public static void main(String[] args) {
        try{
            String str = "This is Raj Demo which is better than any one.";
            FileOutputStream fos = new FileOutputStream("home/babayaga/Desktop/ccc.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(str.getBytes());
            bos.flush();
            bos.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
