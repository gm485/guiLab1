import javax.swing.*;
import java.awt.*;

public class Lab1Part2 extends JFrame {
    Lab1Part2() {
        super("Lab1Part2");
        setLocation(500,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        JPanel panel = new JPanel();

        //Icons
        Icon bugIcon = new ImageIcon("./images/bug1.GIF");
        Icon kennoIcon = new ImageIcon("./images/Kenno.jpg");

        //first label frame
        JLabel labelNoImage = new JLabel("Label with no image");
        //second label
        JLabel imageLabel = new JLabel("Label with image");
        imageLabel.setIcon(bugIcon);
        imageLabel.setHorizontalAlignment(JLabel.RIGHT);
        //third label
        JLabel myImageChoiceLabel = new JLabel("My text");
        Font thirdLabelFont = new Font("Serif", Font.BOLD | Font.ITALIC, 32);
        myImageChoiceLabel.setFont(thirdLabelFont);
        myImageChoiceLabel.setIcon(kennoIcon);

        panel.add(labelNoImage);
        panel.add(imageLabel);
        panel.add(myImageChoiceLabel);

        contentPane.add(panel);

        setSize(600,300);
        setVisible(true);



    }
}
