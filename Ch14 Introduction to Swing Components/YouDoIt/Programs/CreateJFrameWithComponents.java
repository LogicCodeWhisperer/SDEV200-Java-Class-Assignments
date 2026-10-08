// Program: CreateJFrameWithComponents.java -> p.561
// Author: Chase Stephenson
// Date Written: 10/7/2026

//import javax.swing.*;
public class CreateJFrameWithComponents 
{
    public static void main(String[] args)
    {
        JFrameWithComponents aFrame = new JFrameWithComponents(); //Creates JFrameWithComponents Object 
        final int width = 350, height = 100;                      //Constants to set frame size
        aFrame.setSize(width, height);                                                        
        aFrame.setVisible(true);                                  //Sets visible property to true
    }
}
