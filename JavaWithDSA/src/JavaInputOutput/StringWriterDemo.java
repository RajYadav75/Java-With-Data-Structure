package JavaInputOutput;

import java.io.StringWriter;

public class StringWriterDemo {
    public static void main(String[] args) {
        StringWriter sw = new StringWriter();
        sw.write("This is demo part");
        System.out.println(sw);
    }
}
