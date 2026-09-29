package Employee.Management.System;

import com.sun.tools.javac.Main;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateEmployee extends JFrame implements ActionListener {
    JTextField teducation, tfname, taddress,tphone,tname, tnic, temail, tsalary,tdesignation;
    JLabel tempid;
    JButton add,back;
    String number;
    UpdateEmployee(String number){

        this.number = number;
        getContentPane().setBackground(new Color(217, 232, 234));

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(280,30,500,50);
        heading.setFont(new Font("serif", Font.BOLD,25));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50,120,150,30);
       name.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(name);

        JLabel tname = new JLabel();
        tname.setBounds(200,120,150,30);
       // tname.setBackground(new Color(177,252,197));
        add(tname);

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400,120,150,30);
        fname.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(fname);

        tfname = new JTextField();
        tfname.setBounds(600,120,150,30);
        //tfname.setBackground(new Color(177,252,197));
        add(tfname);

        JLabel dob = new JLabel("Date Of Birth");
        dob.setBounds(50,170,150,30);
        dob.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(dob);

        JLabel tdob = new JLabel();
        tdob.setBounds(200,170,150,30);
        tdob.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tdob);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(400,170,150,30);
        salary.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(600,170,150,30);
       // tsalary.setBackground(new Color(177,252,197));
        add(tsalary);

        JLabel address = new JLabel("Address");
        address.setBounds(50,220,150,30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(address);

        taddress= new JTextField();
        taddress.setBounds(200,220,150,30);
     //   taddress.setBackground(new Color(177,252,197));
        add(taddress);


        JLabel phone = new JLabel("Phone");
        phone.setBounds(400,220,150,30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(phone);

        tphone= new JTextField();
        tphone.setBounds(600,220,150,30);
      //  tphone.setBackground(new Color(177,252,197));
        add(tphone);

        JLabel email = new JLabel("Email");
        email.setBounds(50,270,150,30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(email);

        temail= new JTextField();
        temail.setBounds(200,270,150,30);
      //  temail.setBackground(new Color(177,252,197));
        add(temail);

        JLabel education = new JLabel("Higest Education");
        education.setBounds(400,270,150,30);
        education.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(education);

        teducation= new JTextField();
        teducation.setBounds(600,270,150,30);
       // teducation.setBackground(new Color(177,252,197));
        add(teducation);

        JLabel nic = new JLabel("NIC Number");
      nic.setBounds(400,320,150,30);
       nic.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(nic);

        JLabel tnic= new JLabel();
        tnic.setBounds(600,320,150,30);
       // tnic.setBackground(new Color(177,252,197));
        add(tnic);


        JLabel empid = new JLabel("Employee ID");
        empid.setBounds(50,370,150,30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(empid);

        tempid= new JLabel();
        tempid.setBounds(200,370,150,30);
        tempid.setFont(new Font("SAN_SARIF", Font.BOLD,15));
        tempid.setForeground(Color.RED);
        add(tempid);

        JLabel designation = new JLabel("Designation");
        designation.setBounds(50,320,150,30);
        designation.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        add(designation);

        tdesignation= new JTextField();
        tdesignation.setBounds(200,320,150,30);
       // tdesignation.setBackground(new Color(177,252,197));
        add(tdesignation);

        try {
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+number+"'";
            ResultSet resultSet = c.statement.executeQuery(query);
            while (resultSet.next()){
                tname.setText(resultSet.getString("name"));
                tfname.setText(resultSet.getString("fname"));
                tdob.setText(resultSet.getString("dob"));
                taddress.setText(resultSet.getString("address"));
                tsalary.setText(resultSet.getString("salary"));
                tphone.setText(resultSet.getString("phone"));
                temail.setText(resultSet.getString("email"));
                teducation.setText(resultSet.getString("education"));
                tnic.setText(resultSet.getString("nic"));
                tempid.setText(resultSet.getString("empId"));
                tdesignation.setText(resultSet.getString("designation"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        add = new JButton("UPDATE");
        add.setBounds(470,420,150,40);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back = new JButton("BACK");
        back.setBounds(200,420,150,40);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(820,550);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String fname = tfname.getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String education = teducation.getText();
            String designation = tdesignation.getText();

            try {
                Conn c = new Conn();
                String query = "update employee set fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+number+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new Main_class();
            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
            new ViewEmployee();
        }
    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}