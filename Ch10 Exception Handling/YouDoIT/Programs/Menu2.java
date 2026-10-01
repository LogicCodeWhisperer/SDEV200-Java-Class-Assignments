// Program: Menu2.java -> p.424
// Author: Chase Stephenson
// Date Written: 9/30/2026

import javax.swing.*;
public class Menu2 
{   //Declarations
    protected String[] entreeChoices = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"}; //Array for three entree choices 
    private String menu = "";        //Used to build menu for display
    private int choice;              //Holds numeric equivalent of selection
    protected char initials[] = new char[entreeChoices.length]; //Array of characters that can hold first letter of each entree

    public String displayMenu() throws MenuException //added throws clause 
    {
        //loop that stores menu, built by taking the string and adding to it until array size is reached 
        for(int i = 0; i < entreeChoices.length; ++i)
        {
            //(i + 1) is used to display the user expected option numbers starting from 1 whereas the array 
            //starts from 0. User choice is later reduced to the correct array stored option during return.
            menu = menu + "\n" + (i + 1) + " for " + entreeChoices[i];

            initials[i] = entreeChoices[i].charAt(0); //Holds first character of each entreeChoices array element in corrisponding element of initials array
        }
        String input = JOptionPane .showInputDialog(null, "Type your selection, then press enter." + menu);

        for(int y = 0; y < entreeChoices.length; ++y)        //Loop to compare first letter of user choice to each initial of valid menu options 
            if(input.charAt(0) == initials[y])               //Checks if initial exists in array
                throw (new MenuException(entreeChoices[y])); //throws caught exception of user string entry before causing NumberFormatException

        choice = Integer.parseInt(input);

        return (entreeChoices[choice - 1]); //Reduces user choice to array aligned option
    }
}
