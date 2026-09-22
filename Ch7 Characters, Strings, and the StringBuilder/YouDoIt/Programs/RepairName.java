// Program: RepairName.java -> p.250-251
// Author: Chase Stephenson
// Date Written: 9/9/2026

import javax.swing.*;
public class RepairName 
{
    public static void main(String[] args)
    {
        //Declarations in main()
        String name, saveOriginalName;
        int stringLength, i;
        char c;

        //Initializes name to dialog box user input
        name = JOptionPane.showInputDialog(null, "Please enter your first and last name");

        //Saves original user input
        saveOriginalName = name;

        //Gets the name length
        stringLength = name.length();

        //Loops to examine every character
        for(i = 0; i < stringLength; i++)
        {
            //Checks individual characters starting from zero and increments to the next
            //line using i as the control variable 
            c = name.charAt(i);
            
            //Capitalizes the first character
            if(i == 0)
            {
                //When i is 0, the current character is manipulated to uppercase 
                c = Character.toUpperCase(c);
                //The character is placed back into the name
                name = c + name.substring(1, stringLength);
            }
            else 
                // Capitalizes the character after a whitespace
                if(name.charAt(i) == ' ')
                {
                    //Increment control variable
                    ++i;
                    //Gets the character imediately after the whitespace
                    c = name.charAt(i);
                    //Capitalze current character
                    c = Character.toUpperCase(c);
                    //The character is placed back into the name
                    name = name.substring(0, i) + c + name.substring(i + 1, stringLength);
                }
        }

        //Displays original name and repaird name
        JOptionPane.showMessageDialog(null, "Original name was " + saveOriginalName + 
                                            "\nRepaired name is " + name);
    }
}
