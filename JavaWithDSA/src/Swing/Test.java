package Swing;
import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(600,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);


        JLabel jl = new JLabel("Enter Name : ");
        jl.setBounds(100, 50, 100, 20);
        jf.add(jl);

        JTextField jt = new JTextField();
        jt.setBounds(200, 50, 200, 40);
        jf.add(jt);

        JButton jb1 = new JButton("Click Me");
        jb1.setBounds(150,100,100, 50);  // x y width height
        jf.add(jb1);


        jf.setVisible(true);
    }
}
