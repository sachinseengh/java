
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.filechooser.*;

public class WordCount implements ActionListener {

    JFrame f;
    JButton b;

    JLabel l,l2, r, r2;
    JFileChooser jc;


    
      
        

    WordCount() {
        f = new JFrame("String Reverser", null);



        //Code of File chooser
        jc = new JFileChooser("C:\\Users\\sachi\\OneDrive\\Desktop\\java\\Swing.java",
                FileSystemView.getFileSystemView());
        
        jc.showDialog(f,"Count");

        f.add(jc);

       jc.addActionListener(this);



//Label file selected
        l = new JLabel();
        l.setBounds(115, 400, 100, 52);
        l.setText("File Selected");
        f.add(l);
        

//Label for Total Word
        l2 = new JLabel();
        l2.setBounds(300, 400, 100, 52);
        l2.setText("Total word");
        f.add(l2);
        

//show which file is selected
        r = new JLabel();
        r.setBounds(115, 450, 50, 50);
        r.setText(jc.getSelectedFile().getName());
        f.add(r);
        
//Finding the total number of words


        String line;
        int count = 0;
        try {
            FileReader file = new FileReader(""+(r.getText()));
            BufferedReader br = new BufferedReader(file);

            while ((line = br.readLine()) != null) {

                String words[] = line.split(" ");
                
                count = count + words.length;
            }

            }catch (Exception e) {

            System.out.println(e);
            }

        
//Label displaying the result of total word
        r2 = new JLabel();
        r2.setBounds(300, 450, 500, 50);
        f.add(r2);
        r2.setText("= "+Integer.toString(count));
        
        
//Adding JFrame
        f.setSize(800, 700);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
   
        // if(JFileChooser.APPROVE_OPTION == jc.showOpenDialog(null)){
        //         f.dispose();
        //     new WordCount();
            
        // }

    }

    public static void main(String[] args) {
        new WordCount();
    }
}
