// Program: CalculatorDemo.java -> p.430
// Author: Chase Stephenson
// Date Written: 10/1/2026

import java.util.Scanner;
import java.io.IOException;
public class CalculatorDemo 
{
    public static void main(String[] args) throws IOException  //Main method header with throws clause for IOException
    {
        Scanner input = new Scanner(System.in);         //Scanner object for user input 
        Process proc = Runtime.getRuntime().exec        //Process object that invokes built in calculator program calc.exe
            ("cmd /c C:\\Windows\\System32\\calc.exe");
        double num1 = 279.6, num2 = 872.8;              //Declares and initializes variables to be calculated       
        double answer = num1 + num2, userAnswer;        //Declares calculated variable and user input variable

        System.out.print("What is the sume of " + num1 + " and " + num2 + "? "); //Prompt for user to enter a calculated value
        userAnswer = input.nextDouble();                                         //Accepts and assigns user input
        if(userAnswer == answer)                                                 //Compares user input to calculated variable 
            System.out.println("Correct!");                                      //Displays if input is correct
        else
            System.out.println("Sorry - the answer is " + answer);               //Displays if input is incorrect 
    }
}
