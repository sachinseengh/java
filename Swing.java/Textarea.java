
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Textarea {

    public static void main(String[] args) {
        JFrame f = new JFrame("TextField");

        JTextField t1;
        JTextField t2;

        t1 = new JTextField("Username");
        t1.setBounds(50, 150, 200, 30);

        t2 = new JTextField("Password");
        t2.setBounds(50, 100, 200, 30);

        f.add(t1);
        f.add(t2);
        f.setSize(400, 400);

        f.setLayout(null);
        f.setVisible(true);

    }
}
