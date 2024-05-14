package SocketProgramming.SPClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("192.168.194.253",1111);

            OutputStream os = socket.getOutputStream();

            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("Hello Server");

            dos.flush();
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String str1 = dis.readUTF();
            System.out.println("Message From Server : "+str1);



            dos.close();
            os.close();
            socket.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
