// Program: UseBook.java -> p.387
// Author: Chase Stephenson
// Date Written: 9/27/2026

import javax.swing.*;
public class UseBook 
{
    public static void main(String[] args)
    {
        String title;
        title = JOptionPane.showInputDialog(null, "Enter a Fiction book title");
        Fiction fStory = new Fiction(title);
        title = JOptionPane.showInputDialog(null, "Enter a NonFiction book title");
        NonFiction nStory = new NonFiction(title);

        //Statement displays the contents of the two objects
        JOptionPane.showMessageDialog(null, "\nBook descriptions:\n" +
                            fStory.toString() + "\n" + nStory.toString());
    }
}
