package TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class First {
    public static void main(String[] args) {
//        int a = 100, b = 0, c;
//        c = a/b;
//        System.out.println(c);

//        FileInputStream fis = new FileInputStream("");// Checked or Compile Time Exception
        System.out.println(100/0);// Unchecked or RunTime Exception
    }
}
