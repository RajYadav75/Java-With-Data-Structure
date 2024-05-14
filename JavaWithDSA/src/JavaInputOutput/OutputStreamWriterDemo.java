package JavaInputOutput;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {
        String  str = "This is outputstreamwriter class demo";
        char[] str1 = {'a','v','c'};

        FileOutputStream fos = new FileOutputStream("/home/babayaga/Desktop/xyz.txt");
        FileOutputStream fos1 = new FileOutputStream("/home/babayaga/Desktop/xyz1.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
        osw.write(str);
        osw1.write(str1);
//        fos.close();
        osw.close();
        osw1.close();


    }
}
