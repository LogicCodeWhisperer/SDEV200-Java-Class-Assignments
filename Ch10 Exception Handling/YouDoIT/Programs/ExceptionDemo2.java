// Program: ExceptionDemo2.java -> p.407
// Author: Chase Stephenson
// Date Written: 9/29/2026

import javax.swing.*;
public class ExceptionDemo2 
{
    public static void main(String[] args)
    {
        //Declares two integers for user input and  a third for divided result
        //User input variables initialized before try block 
        int numerator = 0, denominator = 0, result;
        String inputString;  //Holds user input to be coverted

        //Prompts user for two numbers and coverts them from string to integer,
        //divides the values and assigns the calculated value to result
        try
        {
            inputString = JOptionPane.showInputDialog(null, "Enter a number to be divided");
            numerator = Integer.parseInt(inputString);
            inputString = JOptionPane.showInputDialog(null, "Enter a number to divide into the first number");
            denominator = Integer.parseInt(inputString);
            result = numerator / denominator;
        }
        //Catches division by 0 and executes, displaying an error message and setting result to 0
        catch(ArithmeticException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage());
            result = 0;
        }

        //Catches input values that cannot be converted to an integer, Assigns values to each integer variable
        catch(NumberFormatException exception)
        {
            JOptionPane.showMessageDialog(null, "This application accepts digits only!");
            numerator = 999;
            denominator = 999;
            result = 1;
        }

        //Displays reguardless of try block success
        JOptionPane.showMessageDialog(null, numerator + " / " + denominator + "\nResult is " + result);
    }
}
