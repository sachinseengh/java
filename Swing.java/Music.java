import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Color;
import javax.sound.sampled.*;

public class Music implements ActionListener {
    JFrame jf;
    JButton play, pause, next, previous;
    JButton select;

    JLabel welcome, Nowplaying, Music_name;
    JFileChooser fileChooser;
    File selectedFile;
    Clip clip;

    Music() {
        jf = new JFrame("Sachin's Music Player");
        jf.setSize(500, 400);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.orange);
        jf.getContentPane().setForeground(Color.black);

        welcome = new JLabel("Let's Vibe", null, 0);
        welcome.setBounds(150, 10, 150, 50);
        jf.add(welcome);

        select = new JButton("Select Music", null);
        select.setBounds(150, 70, 150, 50);
        select.addActionListener(this);
        jf.add(select);

        Nowplaying = new JLabel("Music Playing", 0);
        Nowplaying.setBounds(150, 130, 150, 30);

        jf.add(Nowplaying);

        Music_name = new JLabel();
        Music_name.setBounds(150, 170, 150, 30);
        jf.add(Music_name);

        ImageIcon previousimg = new ImageIcon("previous.png", "previous");
        previous = new JButton("Previous", previousimg);
        previous.setBounds(10, 240, 100, 50);
        jf.add(previous);

        ImageIcon playimg = new ImageIcon("play.png", "play");

        play = new JButton("Play", playimg);
        play.setBounds(120, 240, 100, 50);
        play.addActionListener(this);
        jf.add(play);

        ImageIcon pauseimg = new ImageIcon("pause.png", "pause");

        pause = new JButton("Pause", pauseimg);
        pause.setBounds(230, 240, 100, 50);
        pause.addActionListener(this);
        jf.add(pause);

        ImageIcon nextimg = new ImageIcon("next.png", "next");
        next = new JButton("Next", nextimg);
        next.setBounds(340, 240, 100, 50);
        jf.add(next);
        next.setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == select) {
            fileChooser = new JFileChooser("C:\\Users\\sachi\\OneDrive\\Desktop\\java\\Swing.java");
            fileChooser.showDialog(jf, null);

            int returnValue = fileChooser.showDialog(jf, "Open");

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                Music_name.setText(selectedFile.getName());
            }
            jf.add(fileChooser);
            // Close the file chooser dialog
            fileChooser.setVisible(false);
        } else if (e.getSource() == play) {
            if (selectedFile != null) {
                try {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(selectedFile);
                    clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == pause) {
            if (clip != null && clip.isRunning()) {
                Nowplaying.setText("Paused");
                clip.stop();

            }
        }
    }

    public static void main(String[] args) {
        new Music();
    }
}
