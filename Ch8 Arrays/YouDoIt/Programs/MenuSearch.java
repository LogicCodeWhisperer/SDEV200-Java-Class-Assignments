// Program: TwoDimensionalArrayDemo.java -> p.310-311
// Author: Chase Stephenson
// Date Written: 9/15/2026

import java.util.*;
import javax.swing.*;
public class MenuSearch 
{
    public static void main(String[] args)
    {
        String[] menuChoices = new String[10];   //Declares menuChoices array, allowing the user to enter up to 10 choices.
        String entry = "", menuString = "";      //entry holds current entry, menuString accummulates the entire entered list. Both or initialized to empty.
        int i = 0;                               //Array index variable
        int numEntered;                          //Holds number of menu items entered
        int highestSub = menuChoices.length - 1; //Holds the highest allowed index

        Arrays.fill(menuChoices, "zzzzzzz");     //Fills every element of the array with zzzzzzz
        menuChoices[i] = JOptionPane.showInputDialog(null, "Enter an item for today's" + //Prompts user to enter an item
                                                           "menu, or zzz to quit");      //or enter "dummy value" to quit
        while(!menuChoices[i].equals("zzz") && i < highestSub)     //While the user has not entered the dummy value or a number higher than highest allowed index  
        {
            menuString = menuString + menuChoices[i] + "\n";       //Adds entered item to menu list
            ++i;                                                   //increments index
            if(i < highestSub)                                     //Checked if index is less than highest allowed index
                menuChoices[i] = JOptionPane.showInputDialog(null, "Enter an item for today's" + //Prompts user to enter an item
                                                                   "menu, or zzz to quit");      //or enter "dummy value" to quit
        }
        numEntered = i;                                            //Saves the number of menu items entered

        entry = JOptionPane.showInputDialog(null, "Today's menu is:\n" + menuString + //Displays accumulated menu entries
                                                  "Please make a selection:");

        Arrays.sort(menuChoices, 0, numEntered);                     //Sorts the array into ascending order
        
        i = Arrays.binarySearch(menuChoices, entry);                 //Stores binary search result in i (index variable)(NOTE: should only use after sort)
        if(i >= 0 && i < numEntered)                                 //Checks that user entery is within the valid range
            JOptionPane.showMessageDialog(null, "Excellent choice"); //Displays a "found message"
        else
            JOptionPane.showMessageDialog(null, "Sorry - that item is not on tonight's menu"); //Displays invalid entry message  
    }    
}
