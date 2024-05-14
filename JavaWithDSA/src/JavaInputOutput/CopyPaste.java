package JavaInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/PythonCourse/Module_2/ThreadGroup.jpg");
            FileOutputStream fos = new FileOutputStream("/home/babayaga/Desktop/PythonCourse/Module_2/Xyz.jpg");

            int i;
            while ((i = fis.read())!= -1){
//                System.out.print((char)i);
                fos.write(i);
            }
            fis.close();
            fos.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
