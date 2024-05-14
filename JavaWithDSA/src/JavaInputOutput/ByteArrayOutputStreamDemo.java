package JavaInputOutput;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        String  str = "This is demo.....!";
        FileOutputStream fos1 = new FileOutputStream("/home/babayaga/Desktop/aaa.txt");
        FileOutputStream fos2 = new FileOutputStream("/home/babayaga/Desktop/bbb.txt");
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        ba.write(str.getBytes());
        ba.writeTo(fos1);
        ba.writeTo(fos2);
    }
}
