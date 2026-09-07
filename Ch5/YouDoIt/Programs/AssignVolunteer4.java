// Program: AssignVolunteer4.java -> p.184
// Author: Chase Stephenson
// Date Written: 9/6/2026

import java.util.Scanner;
public class AssignVolunteer4 
{
    public static void main(String[] args)
    {
        //Declarations (added String message during AssignVolunteer2.java)
        int donationType;
        String volunteer , message;
        final int CLOTHING_CODE = 1, FURNITURE_CODE = 2, ELECTRONICS_CODE = 3, OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina", FURNITURE_PRICER = "Wei", ELECTRONICS_PRICER = "Lydia",
                     OTHER_PRICER = "Marco"; 
        

        //Gives ability for user input
        Scanner input = new Scanner(System.in);

        //Output for collecting user input
        System.out.println("What type of donation is this?");
        System.out.print("Enter an integer...");

        //Input collection
        donationType = input.nextInt();

        //Switch statement replaced if statements during AssignVolunteer4.java
        switch(donationType) 
        {
            case(CLOTHING_CODE):
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;                          
                 
            case(FURNITURE_CODE):                
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
 
            case(ELECTRONICS_CODE):
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break;
                
            case(OTHER_CODE):
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;

            default:
                volunteer = "invalid";
                message = "an invalid donation type";
        }
        
            
        //Output statements for input information, added ("This is " + message) during AssignVolunteer2.java
        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
        
        //Closes user input
        input.close();

    } //End of public static void main(String[] args)
} //End of public class AssignVolunteer
