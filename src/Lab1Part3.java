import javax.swing.*;
import java.awt.*;

public class Lab1Part3 extends JFrame {
    Lab1Part3() {
        super("Lab1 Part3");
        Container contentPane = getContentPane();
        JPanel panel = new JPanel();

        //Icons
        Icon saveIcon = new ImageIcon("./images/bonfireSaveIcon.png");
        Icon openIcon = new ImageIcon("./images/OpenIcon.jpg");
        Icon deleteIcon = new ImageIcon("./images/DeleteIcon.png");
        Icon undoIcon = new ImageIcon("./images/UndoIcon.jpg");

        //buttons
        JButton button1 = new JButton("Save", saveIcon);
        JButton button2 = new JButton("Open", openIcon);
        JButton button3 = new JButton("Delete", deleteIcon);
        JButton button4 = new JButton("Undo", undoIcon);

        //panel components
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        //contentPane
        contentPane.add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,500);
        setSize(800,600);
        setVisible(true);

    }
}
