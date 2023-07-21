
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Formed implements ActionListener {
   
    JFrame f;
    JTextField tf;
    JPasswordField tp;
    JButton tb;
    JCheckBox ck,ck2;
    /**
     * 
     */
    Formed(){
        f = new JFrame("example", null);



        tf= new JTextField("Enter your username");
        tf.setBounds(40,100, 500, 100);
        f.add(tf);
        tp= new JPasswordField();
        tp.setBounds(40,250, 500, 100);
        f.add(tp);



 ck = new JCheckBox("BCA", null, true);
        ck.setBounds(40,360, 50, 50);
        f.add(ck);
        ck2 = new JCheckBox("CSIT", null, false);
        ck2.setBounds(100,360, 500, 50);
        f.add(ck2);


         tb= new JButton("Submit");
        tb.setBounds(40,450, 500, 100);
        tb.addActionListener(this);
        f.add(tb);

       



        f.setSize(700, 700);
        f.setLayout(null);
        f.setVisible(true);


    }


      public void actionPerformed(ActionEvent e){

        if(e.getSource()== tb){
            System.out.println("Submitted");
        }
        
      }



      
    
   
   
   
    public static void main(String[] args) {
        new Formed();
    }
    
}
