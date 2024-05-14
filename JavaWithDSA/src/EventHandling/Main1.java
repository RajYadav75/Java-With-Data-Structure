package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Test1 implements ActionListener, MouseListener {
    JFrame jf;
    JTextField jt;
    JButton jb1,jb2;
    void createFrame(){
        jf = new JFrame();
        jf.setSize(600,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        jt = new JTextField();
        jt.setBounds(100,50,300,40);
        jf.add(jt);

        jb1 = new JButton("Click Me");
        jb1.addActionListener(this);
        jb1.addMouseListener(this);
        jb1.setBounds(100,150,120,50);
        jf.add(jb1);

        jb2 = new JButton("Clear");
        jb2.addActionListener(this);
        jb2.addMouseListener(this);
        jb2.setBounds(250,150,120,50);
        jf.add(jb2);



        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1){
            String name = jt.getText();
//            System.out.println("Hello "+name);
            if (name.equals("")){
                JOptionPane.showMessageDialog(jf,"Name cannot be empty ");
            }
            else{
                JOptionPane.showMessageDialog(jf,"Hello "+name);
            }
        }
        if (e.getSource() == jb2){
            jt.setText("");
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == jb1){
            jb1.setBackground(Color.red);
            jb1.setForeground(Color.BLUE);
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == jb1){
            jb1.setBackground(null);
            jb1.setForeground(Color.DARK_GRAY);
        }
    }
}
public class Main1 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.createFrame();
    }
}
