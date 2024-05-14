package SocketProgramming.InfiniteTime.Client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientMine {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("192.168.194.253",2222);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str1 = "", str2 = "";
            while (!str1.equals("bye")){
                str2 = br.readLine();
                dos.writeUTF(str2);
                dos.flush();


                str1 = dis.readUTF();
                System.out.println("Server Says : "+str1);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
