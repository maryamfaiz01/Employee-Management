package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener  {

    JTextField tusername;

    JPasswordField tpassword;

    JButton login, back ,sign;

    Login(){




        JLabel label = new JLabel("ADMIN LOGIN");
        label.setFont(new Font("Serif", Font.BOLD, 15));
        label.setBackground(new Color(1, 8, 19));
        label.setBounds(140, 10, 300, 20);
        add(label);

        JLabel username = new JLabel("Username");
        username.setBounds(60,40,100,25);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(170,40,150,25);
        add(tusername);

        JLabel password = new JLabel("Password");
        password.setBounds(60,80,100,25);
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(170,80,150,25);
        add(tpassword);

        login =new  JButton("LOGIN");
        login.setBounds(30,130,150,30);
        login.setBackground(Color.DARK_GRAY);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);



        back =new  JButton("BACK");
        back.setBounds(200,130,150,30);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.DARK_GRAY);
        back.addActionListener(this);
        add(back);



       sign =new  JButton("SIGNIN");
        sign.setBounds(118,180,150,30);
        sign.setBackground(new Color(13, 26, 46));
        sign.setForeground(Color.lightGray);
       // sign.addActionListener(this);
        add(sign);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/Login.png"));
        Image i22 =i11.getImage().getScaledInstance(700,450,Image.SCALE_DEFAULT);
        ImageIcon i33 =new ImageIcon(i22);
        JLabel imgg = new JLabel(i33);
        imgg.setBounds(370,10,600,450);
        add(imgg);

//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/simple1.jpg"));
//        Image i2 =i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
//        ImageIcon i3 =new ImageIcon(i2);
//        JLabel img = new JLabel(i3);
//        img.setBounds(0,0,600,300);
//        add(img);






        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            try {
                String username =tusername.getText();
                String password =tpassword.getText();

                Conn conn = new Conn();
                String query = ("select * from login where username = '" +username+ "' and password = '" +password+"'");
                ResultSet  resultSet = conn.statement.executeQuery(query);
                if(resultSet.next()){
                    setVisible(false);
                    new Main_class();

                }else {
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password");

                }

            }catch (Exception E){
                E.printStackTrace();
            }

        }else if (e.getSource() == back) {

            System.exit(90);
        }
    }


    static void main(String[] args) {
        new Login();

    }
}
