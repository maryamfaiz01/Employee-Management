package Employee.Management.System;


import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddEmployee extends JFrame implements ActionListener {
    Random ran = new Random();
    int number = ran.nextInt(999999);
    JTextField tname, tfname, taddress, tphone, tnic, temail, tsalary, tdesignation;
    JLabel tempid;
    JDateChooser tdob;

    JButton add, back;

    JComboBox Boxeducation;

    AddEmployee() {

        getContentPane().setBackground(new Color(214, 228, 241));

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(280, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 25));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50, 120, 150, 30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(name);

        tname = new JTextField();
        tname.setBounds(200, 120, 150, 30);
//        tname.setBackground(new Color(177,252,197));
        add(tname);

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400, 120, 150, 30);
        fname.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(fname);

        tfname = new JTextField();
        tfname.setBounds(600, 120, 150, 30);
//        tfname.setBackground(new Color(177,252,197));
        add(tfname);

        JLabel dob = new JLabel("Date Of Birth");
        dob.setBounds(50, 170, 150, 30);
        dob.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(dob);

        tdob = new JDateChooser();
        tdob.setBounds(200, 170, 150, 30);
//        tdob.setBackground(new Color(177,252,197));
        add(tdob);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(400, 170, 150, 30);
        salary.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(600, 170, 150, 30);
//        tsalary.setBackground(new Color(177,252,197));
        add(tsalary);

        JLabel address = new JLabel("Address");
        address.setBounds(50, 270, 150, 30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(address);

        taddress = new JTextField();
        taddress.setBounds(200, 270, 150, 30);
//        taddress.setBackground(new Color(177,252,197));
        add(taddress);


        JLabel phone = new JLabel("Phone");
        phone.setBounds(400, 220, 150, 30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(600, 220, 150, 30);
//        tphone.setBackground(new Color(177,252,197));
        add(tphone);

        JLabel email = new JLabel("Email");
        email.setBounds(50, 220, 150, 30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(email);

        temail = new JTextField();
        temail.setBounds(200, 220, 150, 30);
//        temail.setBackground(new Color(228, 207, 187));
        add(temail);

        JLabel education = new JLabel("Higest Education");
        education.setBounds(400, 270, 150, 30);
        education.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(education);

        String items[] = {"BBA", "B.Tech", "HNDIT", "BA", "BSC", "B.COM", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        Boxeducation = new JComboBox(items);
//        Boxeducation.setBackground(new Color(177,252,197));
        Boxeducation.setBounds(600, 270, 150, 30);
        add(Boxeducation);

        JLabel nic = new JLabel("NIC Number");
        nic.setBounds(400, 320, 150, 30);
        nic.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(nic);

        tnic = new JTextField();
        tnic.setBounds(600, 320, 150, 30);
//        tnic.setBackground(new Color(177,252,197));
        add(tnic);


        JLabel empid = new JLabel("Employee ID");
        empid.setBounds(50, 370, 150, 30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(empid);

        tempid = new JLabel("" + number);
        tempid.setBounds(200, 370, 150, 30);
        tempid.setFont(new Font("SAN_SARIF", Font.BOLD, 15));
        tempid.setForeground(Color.RED);
        add(tempid);

        JLabel designation = new JLabel("Designation");
        designation.setBounds(50, 320, 150, 30);
        designation.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        add(designation);

        tdesignation = new JTextField();
        tdesignation.setBounds(200, 320, 150, 30);
//        tdesignation.setBackground(new Color(177,252,197));
        add(tdesignation);

        add = new JButton("ADD");
        add.setBounds(470, 420, 150, 40);
        add.setBackground(Color.DARK_GRAY);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back = new JButton("BACK");
        back.setBounds(200, 420, 150, 40);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);


        setSize(820, 550);
        setLayout(null);
        setLocation(280, 50);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {

            this.dispose();   // close current AddEmployee window

            new Main_class();
        }

        if (e.getSource() == add) {
            if (
                    tname.getText().isEmpty() ||
                            tfname.getText().isEmpty() ||
                            tsalary.getText().isEmpty() ||
                            tnic.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please fill all required fields!");
                return;



            }
            if (e.getSource() == add) {
                String name = tname.getText();
                String fname = tfname.getText();
                String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
                String salary = tsalary.getText();
                String address = taddress.getText();
                String nic = tnic.getText();
                String phone = tphone.getText();
                String email = temail.getText();
                String education = (String) Boxeducation.getSelectedItem();
                String designation = tdesignation.getText();
                String empID = tempid.getText();

                try {
                    Conn c = new Conn();
                    String query = "insert into employee values('" + name + "', '" + fname + "', '" + dob + "', '" + salary + "','" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" + designation + "','" + nic + "', '" + empID + "')";
                    c.statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Details added successfully");
                    setVisible(false);
                    new Main_class();

                } catch (Exception E) {
                    E.printStackTrace();
                }



            }
        }
    }
        public static void main (String[]args){
            new AddEmployee();

        }
    }
