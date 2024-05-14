package FileHandling.FileOperations;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HideFileDemo {
    public static void main(String[] args) {
        try{
            Path p = Paths.get("/home/babayaga/Desktop/aaa.txt");
            Files.setAttribute(p, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
