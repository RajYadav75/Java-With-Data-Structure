package ChatApplications.ClientPort;

import javazoom.jl.player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;

import java.net.Socket;

public class Client {
    private DataInputStream dis;
    private DataOutputStream dos;

    private JFrame clientFrame;
    private JScrollPane scrollPane;
    private JTextField tf;
    private JTextArea ta;
    private Socket socket;
    String ipAddress;

    // ----------------------------------- Thread Created------------------------------------------------
    Thread thread = new Thread(){
        @Override
        public void run() {
            while (true){
                readMessage();
            }
        }
    };
    // ----------------------------------------Thread End -----------------------------------------------
    Client(){
        ipAddress = JOptionPane.showInputDialog("Enter IP Address : ");
//        System.out.println(ipAddress);

        if (ipAddress != null){
           if (!ipAddress.equals("")){
               connectToServer();
               clientFrame = new JFrame("Client");
               clientFrame.setSize(500,500);
               clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

               ta = new JTextArea();
               ta.setEditable(false);
               Font font = new Font("Arial",1,16);
               ta.setFont(font);
               scrollPane = new JScrollPane(ta);
               clientFrame.add(scrollPane);

               tf = new JTextField();
               tf.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent actionEvent) {
                       sendMessage(tf.getText());
                       ta.append(tf.getText()+"\n");
                       tf.setText("");
                   }
               });
               clientFrame.add(tf, BorderLayout.SOUTH);

               clientFrame.setVisible(true);
           }
        }


    }
    void connectToServer()
    {
        try{
            socket = new Socket(ipAddress,1111);
        }catch (Exception e){
            System.out.println(e);
        }
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
            showMessage("Server : "+message);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void showMessage(String message){
        ta.append(message+"\n");
        chatSound();
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
