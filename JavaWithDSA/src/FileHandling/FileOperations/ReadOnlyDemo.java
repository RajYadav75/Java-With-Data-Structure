package FileHandling.FileOperations;

import java.io.File;

public class ReadOnlyDemo {
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/aaa.txt");
        if (f.setReadOnly()){
            System.out.println("success");
        }else {
            System.out.println("Fail");
        }
        System.out.println("--------------------------------------");

        System.out.println("File can be read : "+ f.canRead());
        System.out.println("File can be write : "+ f.canWrite());
    }
}
