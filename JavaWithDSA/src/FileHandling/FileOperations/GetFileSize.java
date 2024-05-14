package FileHandling.FileOperations;

import java.io.File;

public class GetFileSize {
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/aaa.txt");
        long l = f.length();
        System.out.println(l);
    }
}
