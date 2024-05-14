package FileHandling.FileOperations;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/b.txt");
        if (f.delete()){
            System.out.println("Delete Successfully");
        }else {
            System.out.println("Cant delete");
        }
    }
}
