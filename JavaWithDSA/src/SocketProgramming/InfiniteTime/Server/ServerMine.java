package SocketProgramming.InfiniteTime.Server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMine {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(2222);
            System.out.println("Server is waiting fo client");
            Socket socket = serverSocket.accept();
            System.out.println("Client Found");
            System.out.println("---------------------------------------");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str1 = "", str2 = "";
            while (!str1.equals("bye")){
                str2 = dis.readUTF();
                System.err.println("Client Says : "+str2);

                str1 = br.readLine();
                dos.writeUTF(str1);
                dos.flush();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
