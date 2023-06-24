import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame implements ActionListener {
    MyFrame () {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setResizable(false);
        this.setTitle("JFrame Title");

        ImageIcon image = new ImageIcon("favicon.png");

        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0xffffff));
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            System.out.println("poo");
        }
    }
}
