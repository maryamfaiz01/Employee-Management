package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class JJava extends JFrame {
JTextField tname;
    JJava() {


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 900, 700);
        panel.setBackground(new Color(109, 164, 170));
        add(panel);

        JLabel label = new JLabel("NAME");
        label.setBounds(350,180,150,50);
        label.setFont(new Font("Raleway",Font.BOLD,26));
        panel.add(label);
 
        tname = new JTextField();
        tname.setBounds(350, 220, 150, 30);
//        tname.setBackground(new Color(177,252,197));
       panel.add(tname);


        JButton ADD = new JButton("ADD EMPLOYEE");
ADD.setBackground(Color.BLACK);
ADD.setForeground(Color.white);
ADD.setBounds(350,250,145,50);
panel.add(ADD);




        setSize(800,600);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);
    }

    static void main(String[] args) {
        new JJava();
    }
}











