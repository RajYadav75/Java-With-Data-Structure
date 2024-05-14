package FileHandling.FileOperations;

import java.io.File;

public class LastModified {
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/aaa.txt");
        long l = f.length();
        System.out.println(l);

        long ll = f.lastModified();
        System.out.println(ll/(60*60*365));


        System.out.println(f.isFile());
    }
}
