package JavaEightFeatures.Lambdafunctions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main7 implements ActionListener {
    JFrame jf;
    JButton jb;
    public Main7() {
         jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

         jb = new JButton("Click Me");
        jb.addActionListener(this);
        jb.setBounds(100,100,100,100);
        jf.add(jb);



        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Main7();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == jb){
            JOptionPane.showMessageDialog(jf,"Button Clicked ");
        }
    }
}
