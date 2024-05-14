package ChatApplications.ServerPort;

import javazoom.jl.player.Player;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;
    private JFrame serverFrame;
    private JScrollPane scrollPane;
    private JTextField tf;
    private JTextArea ta;
    private ServerSocket serverSocket;
    private InetAddress inetAddress;
    //--------------------------------------Thread Created-------------------------------------------
    Thread thread = new Thread(){
        @Override
        public void run() {
            while (true){
                readMessage();
            }
        }
    };
    //---------------------------------------------------------------------------------------
    Server(){
        serverFrame = new JFrame("Server");
        serverFrame.setSize(500,500);
        serverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ta = new JTextArea();
        ta.setEditable(false);
        Font font = new Font("Arial",1,16);
        ta.setFont(font);
        scrollPane = new JScrollPane(ta);
        serverFrame.add(scrollPane);

        tf = new JTextField();
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(tf.getText());
                ta.append(tf.getText()+"\n");
                tf.setText("");
            }
        });
        tf.setEditable(false);
        serverFrame.add(tf, BorderLayout.SOUTH);

        serverFrame.setVisible(true);
    }

    public void waitingToClient()
    {
        try{
            String ipaddress = getIpAddress();
            serverSocket = new ServerSocket(1111);
            ta.setText("To connect with server, please provide IP Address -->   "+ipaddress);
            socket = serverSocket.accept();
            ta.setText("Client Connected \n");
            ta.append("-----------------------------------------\n");

            tf.setEditable(true);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public String getIpAddress()
    {
        String ipAddress = "";
        try{
            inetAddress = InetAddress.getLocalHost();
            ipAddress = inetAddress.getHostAddress();
//            System.out.println(ipAddress);
        }catch (Exception e){
            System.out.println(e);
        }
        return ipAddress;
    }
    void setIOStreams(){
        try {
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
        }catch (Exception e){
            System.out.println(e);
        }
        thread.start();

    }
    public void showMessage(String message){

        ta.append(message+"\n");
        chatSound();
    }
    public void sendMessage(String message){
        try {
            dos.writeUTF(message);
            dos.flush();
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public void readMessage()
    {
        try {
            String message = dis.readUTF();
            showMessage("Client : "+message);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void chatSound()
    {
        try {
            FileInputStream fis = new FileInputStream("/home/babayaga/Desktop/JavaWithDSA/src/ChatApplications/Sound/yourSound.mp3");
            Player p = new Player(fis);
            p.play();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
