// Program: JDemoFrameThatCloses.java -> p.550
// Author: Chase Stephenson
// Date Written: 10/7/2026

import javax.swing.*;
public class JDemoFrameThatCloses
{
    public static void main(String[] args)
    {
        JFrame aFrame = new JFrame("This is a frame"); //Creates JFrame object and its Title
        final int width = 300, height = 250;           //Constants used to size JFrame box
        aFrame.setSize(width, height);                 //Sets fram pixel size
        aFrame.setVisible(true);                       //Must be true for user interaction
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
