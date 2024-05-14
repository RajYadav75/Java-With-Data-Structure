package JavaInputOutput;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo {
    public static void main(String[] args) throws IOException {
        StringReader sr = new StringReader("This is string reader demo");

        int i;
        while ((i = sr.read()) != -1){
            System.out.print((char) i);
        }
        sr.close();
    }
}
