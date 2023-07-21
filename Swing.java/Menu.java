

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;
    JLabel l;

    Menu() {
JFrame f = new JFrame("Menu", null);
JMenuBar mb = new JMenuBar();

menu = new JMenu("Menu", false);
submenu =  new JMenu("Sub menu");

i1 = new JMenuItem("item 1");
i2 = new JMenuItem("item 2");
i3 = new JMenuItem("item 3");
i4 = new JMenuItem("item 4");
i5 = new JMenuItem("item 5");


l = new JLabel("hello", null, 0);
l.setBounds(40, 50, 100, 100);
f.add(l);


i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
i4.addActionListener(this);
i5.addActionListener(this);


menu.add(i1);
menu.add(i2);
menu.add(i3);
menu.add(i4);
menu.add(i5);
menu.add(submenu);
mb.add(menu);
f.setJMenuBar(mb);


f.setSize(500,400);
f.setVisible(true);
f.setLayout(null);

       
    }



    public void actionPerformed(ActionEvent e){
    


        // if(e.getSource() ==  i1){
        //     l.setText(i1.getText());
        // }

        
        JMenuItem clickedItem = (JMenuItem) e.getSource();
    
        // Get the text of the clicked menu item and set it to the label
        l.setText(clickedItem.getText());
        
        

    }

    public static void main(String[] args) {
        new Menu();
    }
}
