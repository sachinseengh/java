import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//this is java code
import java.util.Scanner;

public class Adding implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1;
    JLabel jb,jb2;

    Adding() {
        JFrame f = new JFrame();

     jb = new JLabel("First Number");
     jb.setBounds(50,20,100,30);
     f.add(jb);



        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        jb2 = new JLabel("Second Number");
     jb2.setBounds(50,70,100,10);
     f.add(jb2);
        tf2.setBounds(50, 90, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 120, 150, 20);
        tf3.setEditable(false);
        b1 = new JButton("Add");
        b1.setBounds(50, 140, 100, 30);
        b1.addActionListener(this);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {
        Adding a = new Adding();
        System.out.println("Hello");
    }
}