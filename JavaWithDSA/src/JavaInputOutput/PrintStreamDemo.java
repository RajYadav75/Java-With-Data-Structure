package JavaInputOutput;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("home/babayaga/Desktop/Java.java");
        ps.println("Hello Raj ");
        ps.print(101);
        ps.println(" Hulk ");
    }
}
