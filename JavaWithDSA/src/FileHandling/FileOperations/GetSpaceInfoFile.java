package FileHandling.FileOperations;

import java.io.File;

public class GetSpaceInfoFile {
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/aaa.txt");
        long l = f.getFreeSpace();
        System.out.println("Free Space : "+l/(1024*1024*1024));


        long l1 = f.getTotalSpace();
        System.out.println("Total space : "+l1/(1024*1024*1024));
    }
}
