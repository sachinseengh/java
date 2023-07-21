
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringReverseve implements ActionListener {

    JFrame f;
    JButton b;
    JTextField tf;

    JLabel l, r;

    StringReverseve() {
        f = new JFrame("String Reverser", null);


        l = new JLabel("Enter your String", null, 0);
        l.setBounds(115, 73, 500, 52);
        f.add(l);
        
        tf = new JTextField(null, null, 0);
        tf.setBounds(115,123,500,80);
        f.add(tf);


        b = new JButton("Reverse", null);
        b.setBounds(115,205,500,80);
        b.addActionListener(this);
        f.add(b);



        r = new JLabel(null, null, 0);
        r.setBounds(115,300,500,50);
        f.add(r);

        
        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
    }

        public void actionPerformed(ActionEvent e){
            StringBuffer s = new StringBuffer();
            // s= tf.getText(0, 0);
            s.append(tf.getText());
            if(e.getSource() == b){
                s.reverse();

               
            }
             r.setText(s.toString());
        }
    public static void main(String[] args) {

        new StringReverseve();

    }
}
