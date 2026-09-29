package Employee.Management.System;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main_class extends JFrame {
    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Main.png"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

     JLabel heading =new JLabel("Employee Management System");
      heading.setBounds(500,155,400,40);
      heading.setFont(new Font("Raleway",Font.BOLD,26));
      img.add(heading);

      JButton add = new JButton("Add Employee");
      add.setBounds(400,270,150,40);
      add.setBackground(Color.darkGray);
      add.setForeground(Color.white);
      img.add(add);

       add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();

            }
        });



        JButton view = new JButton("View Employee");
        view.setBounds(800,270,150,40);
        view.setBackground(Color.darkGray);
        view.setForeground(Color.white);
        img.add(view);
      view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewEmployee();

            }
        });




        JButton remove = new JButton("Remove Employee");
        remove.setBounds(600,370,150,40);
        remove.setBackground(Color.darkGray);
        remove.setForeground(Color.white);
        img.add(remove);
        remove.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new RemoveEmployee();

        }
    });


        setSize(1120,630);
        setLocation(120,60);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_class();


    }




    }

