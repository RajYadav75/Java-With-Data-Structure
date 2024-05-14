package JavaInputOutput.ReaderCharcterStream;

import java.io.FileReader;

public class ReadDemo
{
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/home/babayaga/Desktop/PythonCourse/Module_2/tute1.py");
            int i ;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
