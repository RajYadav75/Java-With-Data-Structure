package JavaEightFeatures.Lambdafunctions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main8 {
    JFrame jf;
    JButton jb;
    public Main8() {
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        jb = new JButton("Click Me");
        jb.addActionListener((ActionEvent e)-> JOptionPane.showMessageDialog(jf,"Button clicked") );
        jb.setBounds(100,100,100,100);
        jf.add(jb);



        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Main7();
    }
}
