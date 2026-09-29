package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame{
    private JProgressBar progressBar;
    private int progress = 0;
    Splash(){

          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Spl.png"));
        Image i2 = i1.getImage().getScaledInstance(1170,648,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1170,648);
        add(image);

        progressBar = new JProgressBar();
        progressBar.setBounds(350, 560, 450, 20);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("Segoe UI", Font.BOLD, 12));
        progressBar.setForeground(new Color(40, 167, 69));
        image.add(progressBar);

        startLoading();
        // ✅ Smooth load

           setSize(1170,648);
           setLocation(100,50);
           setLayout(null);
           setVisible(true);
//
//          try{
//                Thread.sleep(5000);
//                setVisible(false);
//                new Login();
//          }catch (Exception e){
//              e.printStackTrace();
//          }

}

    // ✅ Smooth loading method
    private void startLoading() {
        Timer timer = new Timer(55, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progress++;
                progressBar.setValue(progress);

                if (progress >= 100) {
                    ((Timer) e.getSource()).stop();
                    dispose();
                    new Login();
                }
            }
        });
        timer.start();
    }

    static void main(String[] args) {
          new Splash();
    }
}

