package SocketProgramming.SPServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1111);
            System.out.println("Server is waiting for client");

//            serverSocket.accept();
            Socket socket = serverSocket.accept();
            System.out.println("Client found");

            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String str = dis.readUTF();
            System.out.println("Message from Client : "+str);

            String str1 = "Hello Client....!!";
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(str1);

            dos.flush();

            dis.close();
            is.close();
            socket.close();
            serverSocket.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
