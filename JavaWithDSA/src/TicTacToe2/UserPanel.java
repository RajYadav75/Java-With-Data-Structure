package TicTacToe2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserPanel implements ActionListener {
    JFrame jf;
    JLabel jl1,jl2, jl3;
    JTextField jt1, jt2;
    JButton jb;
    JComboBox jComboBox;
    UserPanel()
    {
        jf = new JFrame("TicTacToe Game by Raj Yadav");
        jf.setSize(600,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        jl1 = new JLabel("Enter Player One : (X) ");
        jl1.setBounds(50,50,170,30);
        jf.add(jl1);

        jt1 = new JTextField();
        jt1.setBounds(300,50,250,40);
        jf.add(jt1);

        jl2 = new JLabel("Enter Player Two : (0) ");
        jl2.setBounds(50,100,170,30);
        jf.add(jl2);

        jt2 = new JTextField();
        jt2.setBounds(300,100,250,40);
        jf.add(jt2);

        jl3 = new JLabel("Select Series");
        jl3.setBounds(50,280,150,50);
        jf.add(jl3);

        String[] series = {"3","5","7","9"};
        jComboBox = new JComboBox(series);
        jComboBox.setBounds(200,250,250,40);
        jf.add(jComboBox);


        jb = new JButton("Start Game : ");
        jb.setBounds(150,380,150,50);
        jb.addActionListener(this);
        jf.add(jb);



        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == jb)
        {
            String player1 = jt1.getText();
            String player2 = jt2.getText();


            String  series = (String) jComboBox.getSelectedItem();
            GamePanel gp = new GamePanel(player1,player2,Integer.parseInt(series));
            gp.openGamePanel();
            jf.setVisible(false);
        }
    }
}
