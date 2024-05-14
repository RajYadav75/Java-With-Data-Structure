package FileHandling.FileOperations;

import java.io.File;
import java.io.FilenameFilter;

class Myfilter implements FilenameFilter {
    String  name;
    Myfilter(String name){
        this.name = name;
    }
    @Override
    public boolean accept(File file, String s) {

        return name.startsWith(name);
    }
}
public class SearchFile1 {
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/");
        Myfilter mf = new Myfilter("C");


        String[] str =  f.list(mf);
        for (String s : str) {
            System.out.println(s);
        }
    }
}
