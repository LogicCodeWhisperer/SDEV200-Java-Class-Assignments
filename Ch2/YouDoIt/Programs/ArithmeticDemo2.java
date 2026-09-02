// Program: ArithmeticDemo2.java -> p.71
// Author: Chase Stephenson
// Date Written 8/26/2026

import java.util.Scanner;
public class ArithmeticDemo2 
{
    public static void main(String[] args)
    {
        //Declarations
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;
        Scanner input = new Scanner(System.in);

        //User Input
        System.out.print("Please enter a double >> ");
        firstNumber = input.nextDouble();
        System.out.print("Please enter another double >> ");
        secondNumber = input.nextDouble();
        System.out.println();

        //Calculations
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        //Output Statments
        System.out.println("Before rounding");
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
        System.out.println();

        //Calculations 
        sum = sum * 100;
        sum = sum + 0.5;
        sum = (int)sum;
        sum = sum / 100;
        average = average * 100;
        average = average + 0.5;
        average = (int)average;
        average = average / 100;

        //Output Statments
        System.out.println("After rounding");
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
        input.close();
    }
}
