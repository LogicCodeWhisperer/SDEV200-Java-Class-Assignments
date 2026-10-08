// Program: JAction.java -> p.567
// Author: Chase Stephenson
// Date Written: 10/7/2026

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JAction extends JFrame implements ActionListener
{
    //Creates components to be used as arguments sent to JFrame parent class
    JLabel label = new JLabel("Name?");    
    JTextField field = new JTextField(12);  
    JButton button = new JButton("OK");

    public JAction()
    {
        super("Action");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);
        button.addActionListener(this);
        field.addActionListener(this);
    }

    @Override public void actionPerformed(ActionEvent e)
    {
        label.setText("Thank you so much!");
        button.setText("Application done");
    }

    public static void main(String[] args)
    {
        JAction aFrame = new JAction();        //Creates JFrameWithComponents Object 
        final int width = 250, height = 150;   //Constants to set frame size
        aFrame.setSize(width, height);                            
        aFrame.setVisible(true);
    }
}
