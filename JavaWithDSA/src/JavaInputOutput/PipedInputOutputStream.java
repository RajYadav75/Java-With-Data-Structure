package JavaInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputOutputStream {
    public static void main(String[] args) throws IOException {
        String str = "This is demo";
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);
        pos.write(str.getBytes());
        int i;
        while ((i = pis.read())!= -1){
            System.out.print((char) i);
        }
    }
}