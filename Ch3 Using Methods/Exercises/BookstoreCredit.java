// Program: BookstoreCredit -> p.112
// Author: Chase Stephenson
// Date Written: 8/31/2026

import java.util.Scanner;
public class BookstoreCredit 
{
    public static void main(String[] args)
    {
        //Declared variables
        double gpa;
        String name;
        Scanner input = new Scanner(System.in);
        
        //Output statments and user input
        System.out.println();
        System.out.print("What is your Name? ");
        name = input.nextLine();
        System.out.print("What is your GPA? ");
        gpa = input.nextDouble();
        System.out.println();
        
        //Call to displayCredit() method with arguments
        displayCredit(gpa, name);
        input.close();
    }   
    
    //Method to display accepted parameters and calculation for credit
    public static void displayCredit(double gpa, String name)//These are parameters in the parentheses for argument acceptance
    {
        //Declared variable in displayCredit() method
        double credit;

        //Credit calculation
        credit = gpa * 10;

        //Output statements displaying student name, GPA and credit amount
        System.out.printf(name + ", based on a GPA of " + gpa + " your bookstore credit is $%.2f\n", credit);
        System.out.println();
    }
}
