// Program: ArithmeticDemo.java
// Author: Chase Stephenson
// Date Written 8/26/2026

import java.util.Scanner;
public class ArithmeticDemo 
{
    public static void main(String[] args)
    {
        //Declarations
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;
        Scanner input = new Scanner(System.in);

        //User Input
        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer >> ");
        secondNumber = input.nextInt();

        //Calculations
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum/2;

        //Output Statments
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);

        
    }
}
