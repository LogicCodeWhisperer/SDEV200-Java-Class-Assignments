// Program: AssignVolunteer.java -> p.168
// Author: Chase Stephenson
// Date Written: 9/6/2026

import java.util.Scanner;
public class AssignVolunteer 
{
    public static void main(String[] args)
    {
        //Declarations
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1, OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina", OTHER_PRICER = "Marco";

        //Gives ability for user input
        Scanner input = new Scanner(System.in);

        //Output statement for collecting user input
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + 
                         OTHER_CODE + " for anything else... ");

        //Input collection
        donationType = input.nextInt();

        //If statements
        if(donationType == CLOTHING_CODE)
            volunteer = CLOTHING_PRICER;
        else
            volunteer = OTHER_PRICER;

        //Output statements for displaying 
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
        
        //Closes user input
        input.close();
    } //End of public static void main(String[] args)
} //End of public class AssignVolunteer
