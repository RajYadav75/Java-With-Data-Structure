package JavaInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        String s = "This is bufferedWriter Demo";
        FileWriter fw = new FileWriter("/home/babayaga/Desktop/xyz3.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        bw.close();
        fw.close();
    }
}