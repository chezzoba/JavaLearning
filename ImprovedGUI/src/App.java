import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
/*         JFrame frame = new JFrame();
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("JFrame Title");

        frame.setVisible(true);

        ImageIcon image = new ImageIcon("favicon.png");

        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0xff1100)); */

        /* MyFrame frame = new MyFrame();

        ImageIcon image = new ImageIcon("icon.png");

        JLabel label = new JLabel("Label Text"); // or setText method
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.RED);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(10);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(10, 0, 250, 250);

        //frame.setLayout(null);

        frame.add(label);

        frame.setVisible(true);
        frame.pack(); */

        /* MyFrame frame = new MyFrame();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        
        frame.setLayout(null);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true); */

        MyFrame frame = new MyFrame();

        JButton button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(frame);
        button.setText("Button");
        button.setFocusable(false);

        frame.add(button);

        frame.setVisible(true);
    }
}
