package ui;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {
    private JPanel panel1;
    private JPanel rootPanel;
    private JButton buttonRemove;
    private JButton buttonNewContact;
    private JTable tableContacts;

    public MainForm() {

        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //setLocation(int i: dim.width / 2 = getSize().width / 2, int i1: dim.height / 2 = getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

}
