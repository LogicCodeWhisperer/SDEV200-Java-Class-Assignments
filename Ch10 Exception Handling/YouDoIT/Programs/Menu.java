// Program: Menu.java -> p.424
// Author: Chase Stephenson
// Date Written: 9/30/2026

import javax.swing.*;
public class Menu 
{   //Declarations
    protected String[] entreeChoices = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"}; //Array for three entree choices 
    private String menu = "";        //Used to build menu for display
    private int choice;              //Holds numeric equivalent of selection

    public String displayMenu()
    {
        //loop that stores menu, built by taking the string and adding to it until array size is reached 
        for(int i = 0; i < entreeChoices.length; ++i)
        {
            //(i + 1) is used to display the user expected option numbers starting from 1 whereas the array 
            //starts from 0. User choice is later reduced to the correct array stored option during return.
            menu = menu + "\n" + (i + 1) + " for " + entreeChoices[i];
        }
        String input = JOptionPane .showInputDialog(null, "Type your selection, then press enter." + menu);
        choice = Integer.parseInt(input);
        return (entreeChoices[choice - 1]); //Reduces user choice to array aligned option
    }
}
