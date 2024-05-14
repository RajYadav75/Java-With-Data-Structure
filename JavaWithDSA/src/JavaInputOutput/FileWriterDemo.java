package JavaInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String st = " This is demo ........";
        FileWriter fw = new FileWriter("/home/babayaga/Desktop/xyz.txt");
        fw.write(st);
        fw.close();
    }
}
