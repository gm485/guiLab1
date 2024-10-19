import javax.swing.*;
import java.awt.*;

public class Lab1Part4 extends JFrame {
    Lab1Part4() {
        super("About My Pet");
        Container contentPane = getContentPane();
        JPanel holderPanel = new JPanel();
        //panel settings 
        holderPanel.setLayout(new GridLayout(4,1, 30,20));
        //Label Icons and Fonts
        Icon myIcon = new ImageIcon("./images/Kenno.jpg");
        Font lblFont = new Font("Serif", Font.BOLD | Font.ITALIC, 13);
        //Button Icons
        Icon btnIcon = new ImageIcon("./images/LikeIcon.png");
        //label
        JLabel mylbl = new JLabel("This is My Pet");
        mylbl.setFont(lblFont);
        mylbl.setIcon(myIcon);
        mylbl.setHorizontalAlignment(JLabel.LEFT);
        //text field
        JTextField textField = new JTextField();
        textField.setText("Milo the Cat");
        
        //text area
        JTextArea textArea = new JTextArea();
        textArea.setText("Milo is a Cat, he likes to sleep on anything high \n he will tell us when he is hungry!");
        //button
        JButton mybtn = new JButton("Like", btnIcon);

        //panel components
        holderPanel.add(textField);
        holderPanel.add(textArea);
        holderPanel.add(mylbl);
        holderPanel.add(mybtn);
        //contentPane
        contentPane.add(holderPanel);
        //frame settings
        setLocation(500, 100);
        setSize(200, 400);
        setVisible(true);
    }
}
