// Program: UseDinnerParty.java -> p.333
// Author: Chase Stephenson
// Date Written: 9/20/2026

import java.util.*;
public class UseDinnerParty 
{
    public static void main(String[] args)
    {
        int guests, choice;                           //Holds number of guests and user choice
        Party aParty = new Party();                   //Constructs new Party object
        DinnerParty aDinnerParty = new DinnerParty(); //DinnerParty Object declaration 
        Scanner keyboard = new Scanner(System.in);    //Accepts user input 

        System.out.print ("Enter number of guests for the party: "); //Promts user to enter an integer for number of guests
        guests = keyboard.nextInt();                                 //Accepts and assigns user input to guests
        aParty.setGuests(guests);                                    //Sets the number of guests in the Party object
        System.out.println("The party has " + aParty.getGuests() +   //Displays number of party guests
                           " guests");
        aParty.displayInvitation();     //Displays party invitation
        

        System.out.print("Enter number of guests for the dinner party: "); //Displays meesage for user input for number of guests
        guests = keyboard.nextInt();    //Accepts and assigns user input for guests 
        aDinnerParty.setGuests(guests); //Assigns user input guests to aDinnerParty object that calls method 
                                        //----located in Party.java, a parent class of DinnerParty.java)
        
        System.out.print("Enter the menu option -- 1 for chicken or 2 for beef: ");              //Displays menu options for user to choose from
        choice = keyboard.nextInt();                                                             //Accepts and assigns menu option to choice   
        aDinnerParty.setDinnerChoice(choice);                                                    //Calls method located in Dinner party to set user choice
        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");      //Displays number of party guests to be served
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served"); //Displays menu option selection to be served

        aDinnerParty.displayInvitation();  //Calls displayInvitation method in Party.java
    
    }
}
