package Swing;
import javax.swing.*;
public class RegistrationForm {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setLayout(null);
        jf.setSize(1000,1000);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl1 = new JLabel("Register Here ");
        jl1.setBounds(450,0,120,120);
        jf.add(jl1);

        JLabel jl2 = new JLabel("Name : ");
        jl2.setBounds(100,20,200,200);
        jf.add(jl2);

        JTextArea ja1 = new JTextArea(1,1);
        ja1.setBounds(300,105,300,20);
        jf.add(ja1);

        JLabel jl3 = new JLabel("Email : ");
        jl3.setBounds(100,60,200,200);
        jf.add(jl3);

        JTextArea ja2 = new JTextArea(1,1);
        ja2.setBounds(300,139,300,20);
        jf.add(ja2);

        JLabel jl4 = new JLabel("Password : ");
        jl4.setBounds(100, 200, 300, 20);
        jf.add(jl4);

        JPasswordField jp = new JPasswordField();
        
    }
}
