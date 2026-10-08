// Program: JAction2.java -> p.567
// Author: Chase Stephenson
// Date Written: 10/7/2026

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

                                      //Allows class response to action events
public class JAction2 extends JFrame implements ActionListener 
{                                    
    //Creates components to be used as arguments sent to JFrame parent class
    JLabel label = new JLabel("Name?");    
    JTextField field = new JTextField(12);  
    JButton button = new JButton("Ok");

    public JAction2()
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
        Object source = e.getSource();
        if(source == button)
            label.setText("Pressed Button");
        else
            label.setText("Pressed Enter");
    }

    public static void main(String[] args)
    {
        JAction2 aFrame = new JAction2();       //Creates JAction
        final int width = 250, height = 150;    //Constants to set frame size
        aFrame.setSize(width, height);                            
        aFrame.setVisible(true);
    }
}
