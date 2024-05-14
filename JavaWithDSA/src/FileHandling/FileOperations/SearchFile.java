package FileHandling.FileOperations;

import java.io.File;

public class SearchFile {
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/");
        String[] str = f.list();
        for (String s: str){
            System.out.println(s);
        }
    }
}
