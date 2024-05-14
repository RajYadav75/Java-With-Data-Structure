package FileHandling.FileOperations;

import java.io.File;

public class CreateFolder
{
    public static void main(String[] args) {
        File f = new File("/home/babayaga/Desktop/RajBabu");
        File f1 = new File("/home/babayaga/Desktop/RajBabu/hulk");
        if (f1.mkdir()){
            System.out.println("Successfully Created Folder");
        }else {
            System.out.println("Creating Folder Failed ");
        }

//        if (f1.mkdirs()){
//            System.out.println("Successfully Created Folder");
//        }else {
//            System.out.println("Creating Folder Failed ");
//        }
    }
}
