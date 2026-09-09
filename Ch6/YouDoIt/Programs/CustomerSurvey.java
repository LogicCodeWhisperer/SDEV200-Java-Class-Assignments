// Program: CustomerSurvey.java -> p.209
// Author: Chase Stephenson
// Date Written: 9/8/2026

import java.util.*;
public class CustomerSurvey 
{
    public static void main(String args[])
    {
        //Declarations
        int rating;
        final int MIN = 1, MAX = 5;
        Scanner input = new Scanner(System.in);

        //Output statements explaining the range and meaning of the rating system
        /*Condenced output compared to book*/
        System.out.print("Please enter a value that represents\n" + 
                         "your satisfaction with our service.\n" + 
                         "Enter a value between " + MIN + " and " + MAX + "\n" +
                         "with " + MAX + " meaning highly satisfied and" + "\n" +
                         MIN + " meaning not at all satisfied.\n" +
                         "Enter your rating >> ");
        
        //This is the Primary Input before loop entrance 
        rating = input.nextInt();

        //Input validation loop
        while(rating < MIN || rating > MAX)
        {
            //Output statments that appear when an invalid entry has been made
            System.out.print("You must enter a value between " + MIN + " and " + MAX + "\n" +
                             "Please try again >> ");

            //User input inside the loop if the first entry was invalid 
            rating = input.nextInt();
        }

        System.out.println("Thank you.");
        input.close();
    } //End of public static void main(String args[])
} //End of public class CustomerSurvey
