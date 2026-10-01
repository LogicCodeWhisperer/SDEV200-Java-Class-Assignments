// Program: ExceptionDemo.java -> p.403
// Author: Chase Stephenson
// Date Written: 9/29/2026

import javax.swing.*;
public class ExceptionDemo 
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

        //Displays reguardless if try block succeeds or not
        JOptionPane.showMessageDialog(null, numerator + " / " + denominator + "\nResult is " + result);
    }
}
