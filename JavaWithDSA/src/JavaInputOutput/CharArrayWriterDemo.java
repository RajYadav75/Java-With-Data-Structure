package JavaInputOutput;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) throws IOException {
        CharArrayWriter caw = new CharArrayWriter();
        caw.write("This is char array write demo");
        FileWriter fw1 = new FileWriter("/home/babayaga/Desktop/xyz4.txt");
        FileWriter fw2 = new FileWriter("/home/babayaga/Desktop/xyz5.txt");
        FileWriter fw3 = new FileWriter("/home/babayaga/Desktop/xyz6.txt");

        caw.writeTo(fw1);
        caw.writeTo(fw2);
        caw.writeTo(fw3);
        fw1.close();
        fw2.close();
        fw3.close();
        caw.close();
    }
}
