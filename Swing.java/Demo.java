import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {

    JFrame frm;

    Demo() {
        frm = new JFrame();
        JButton btn = new JButton("Click");
        btn.setBounds(125, 100, 100, 40);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frm.dispose(); // Close the JFrame
            }
        });

        frm.add(btn);

        JButton btn2 = new JButton("Click");
        btn2.setBounds(225, 300, 100, 40);

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frm.dispose(); // Close the JFrame
            }
        });

        frm.add(btn2);

        frm.setSize(1000, 500);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the JFrame is closed
    }

    public static void main(String[] args) {
        new Demo();
    }
}
