
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jdialog  implements ActionListener{
    private static JDialog dg;

    Jdialog() {
        JFrame frm = new JFrame(null, null);
        dg = new JDialog(frm, "Alert", true);
        dg.setLayout(new FlowLayout());
        JButton b = new JButton("OK");

        b.addActionListener(this);

        dg.add(new JLabel("Click here"));
        dg.add(b);
        dg.setSize(300, 300);
        dg.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        
        
                Jdialog.dg.setVisible(false);
            }
    
    

    public static void main(String[] args) {
        new Jdialog();
    }
}
