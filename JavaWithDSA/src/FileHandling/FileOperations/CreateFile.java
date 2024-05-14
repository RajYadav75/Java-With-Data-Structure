package FileHandling.FileOperations;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File f = new File("/home/babayaga/Desktop/aaa.txt");
//            boolean b = f.createNewFile();
//            if (b){
//                System.out.println("File created Successfully");
//            }else {
//                System.out.println("File not created due to some error");
//            }
            if(f.createNewFile()){
                System.out.println("File created Successfully");
            }else {
                System.out.println("File not created due to some error");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
