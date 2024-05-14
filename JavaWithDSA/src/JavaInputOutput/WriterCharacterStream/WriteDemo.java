package JavaInputOutput.WriterCharacterStream;

import java.io.FileWriter;

public class WriteDemo {
    public static void main(String[] args) {
        try{
            String data = "this is my character stream demo....";
            FileWriter fw = new FileWriter("/home/babayaga/Desktop/Raj.txt");
            fw.write(data);
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
