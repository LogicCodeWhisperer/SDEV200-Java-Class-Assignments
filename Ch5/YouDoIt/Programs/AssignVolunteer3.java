// Program: AssignVolunteer3.java -> p.173
// Author: Chase Stephenson
// Date Written: 9/6/2026

import java.util.Scanner;
public class AssignVolunteer3 
{
    public static void main(String[] args)
    {
        //Declarations (added String message for AssignVolunteer2.java)
        int donationType;
        String volunteer , message;
        final int CLOTHING_CODE = 1, OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina", OTHER_PRICER = "Marco";

        //Gives ability for user input
        Scanner input = new Scanner(System.in);

        //Output for collecting user input
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + 
                         OTHER_CODE + " for anything else... ");

        //Input collection
        donationType = input.nextInt();

        //If statements (decisions) for AssignVolunteer3.java
        if(donationType == CLOTHING_CODE || donationType == OTHER_CODE)
            if (donationType == CLOTHING_CODE)
                {volunteer = CLOTHING_PRICER;
                 message = "a clothing donation";}
            else
                {volunteer = OTHER_PRICER;
                 message = "a non-clothing donation";}
        else
            {volunteer = "invalid";
             message = "an invalid donation type";}
            
        //Output statements for input information, added ("This is " + message) for AssignVolunteer2.java
        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
        
        //Closes user input
        input.close();

    } //End of public static void main(String[] args)
} //End of public class AssignVolunteer
