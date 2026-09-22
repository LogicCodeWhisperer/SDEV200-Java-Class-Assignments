// Program: NumberInput.java -> p.252
// Author: Chase Stephenson
// Date Written: 9/9/2026

import javax.swing.*;
public class NumberInput 
{
    public static void main(String[] args)
    {
        //Declarations
        String inputString;
        int inputNumber, result;
        final int FACTOR = 10;

        //Initializes inputString to dialog box user input
        inputString = JOptionPane.showInputDialog(null, "Enter a number");

        //Converts input string to an integer
        inputNumber = Integer.parseInt(inputString);

        //Calculation for converted string integer * 10
        result = inputNumber * FACTOR;

        //Displays the result
        JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR +
                                            " = " + result);
    }
}
