// Program: JFrameWithComponents.java -> p.561
// Author: Chase Stephenson
// Date Written: 10/7/2026

import javax.swing.*;
import java.awt.*;
public class JFrameWithComponents extends JFrame //Belongs to JFrame
{
    //Creates components to be used as arguments sent to JFrame parent class
    JLabel label = new JLabel("Name?");                 //Creates JLable instance with specified text
    JTextField field = new JTextField(12);              //Allows user to enter aproximately 12 characters (viewable)
    JButton button = new JButton("OK");                 //Creates new button with text

    public JFrameWithComponents()                       //No parameter constructor for class
    {
        super("Frame with Components");                 //Sets title of frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Gives functionality to close
        setLayout(new FlowLayout());                    //constructs new layout
        add(label);                                     //Adds JLabel to the JFrame
        add(field);                                     //Adds JTextField to the JFrame
        add(button);                                    //Adds JButton to the JFrame
    }

}
