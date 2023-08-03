package Applets;
import java.applet.Applet;
import java.awt.Graphics;

public class DemoApplet  extends Applet{
    public void paint(Graphics g){
        g.drawString("Demo", 250, 250);
    }
    
}
/*
 <applet code = "DemoApplet.class" width="300" height="300">
 </applet>
 */