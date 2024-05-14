package JavaInputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/Java.java");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int i;
        while ((i= bis.read()) != -1){
            System.out.print((char) i);
        }
        fis.close();
        bis.close();
    }
}
