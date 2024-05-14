package JavaInputOutput;

import java.io.FileInputStream;

import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/aaa.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        int i;
        while((i = isr.read()) != -1){
            System.out.print((char) i);
        }
        fis.close();
        isr.close();
    }
}
