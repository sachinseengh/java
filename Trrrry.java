// package testdb;
import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Trrrry {
    JTextField j;
    JFrame jf;
    JButton add, delete;
    
    Trrrry(){
        jf = new JFrame("Employee Form");
        jf.setLayout(null);
        jf.setSize(500, 500);
        j = new JTextField();
        j.setBounds(50, 50, 150, 30);
        
        add = new JButton("Add");
        add.setBounds(50, 100, 80, 30);
        
        delete = new JButton("Delete");
        delete.setBounds(150, 100, 80, 30);
        
        jf.add(j);
        jf.add(add);
        jf.add(delete);
        
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Trrrry();
    }
}
