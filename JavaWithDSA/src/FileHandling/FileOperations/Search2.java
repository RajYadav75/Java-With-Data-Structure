package FileHandling.FileOperations;
import java.io.File;
import java.io.FilenameFilter;

public class Search2 {
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/");
       String[] str =f.list(new FilenameFilter() {
           @Override
           public boolean accept(File file, String s) {
//               return s.startsWith("C");
               return s.endsWith("java");
           }
       });

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}