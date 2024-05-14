package FileHandling.FileOperations;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/aaa.txt");
        File f1 = new File("/home/babayaga/Desktop/b.txt");

        if (f.renameTo(f1)){
            System.out.println("Rename Successfully");
        }else {
            System.out.println("Error");
        }
    }
}
