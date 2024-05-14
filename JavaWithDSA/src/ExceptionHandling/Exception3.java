package ExceptionHandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args) throws FileNotFoundException {
        Exception3 ee = new Exception3();
        ee.m1();
    }
    void m1() throws FileNotFoundException{
        m2();
    }
    void m2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
    }
}
