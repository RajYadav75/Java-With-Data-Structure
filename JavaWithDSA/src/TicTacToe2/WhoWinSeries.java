package TicTacToe2;

import javax.swing.*;
import java.awt.*;

public class WhoWinSeries {
    public WhoWinSeries(String message) {
        JFrame jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);


        JLabel jl = new JLabel(message);
        jl.setBounds(50,100,300,50);
        jl.setFont(new Font("Arial",1,30));
        jl.setForeground(Color.red);
        jf.add(jl);

        jf.setVisible(true);
    }
}
