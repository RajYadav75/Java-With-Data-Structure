package FileHandling.FileOperations;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("/home/babayaga/Desktop/aaa.txt","r");
            raf.seek(1);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
