package JavaInputOutput;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) throws IOException {
        char[] ch = {'q','a','c','f'};
        CharArrayReader cr = new CharArrayReader(ch);
        int i;
         while ((i = cr.read()) != -1){
             System.out.print((char) i);
         }
         cr.close();
    }
}
