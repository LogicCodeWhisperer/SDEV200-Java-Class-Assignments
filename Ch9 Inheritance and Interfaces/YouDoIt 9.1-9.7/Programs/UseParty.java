// Program: UseParty.java -> p.333
// Author: Chase Stephenson
// Date Written: 9/20/2026

import java.util.*;
public class UseParty 
{
    public static void main(String[] args)
    {
        //Declarations
        int guests;                                //Holds number of guests
        Party aParty = new Party();                //Creates new Party object
        Scanner keyboard = new Scanner(System.in); //Accepts user input 

        System.out.print ("Enter number of guests for the party: "); //Promts user to enter an integer for number of guests
        guests = keyboard.nextInt();                                 //Accepts and assigns user input to guests
        aParty.setGuests(guests);                                    //Sets the number of guests in the Party object
        System.out.println("The party has " + aParty.getGuests() +   //Displays number of party gets
                           " guests");
        aParty.displayInvitation();   //Displays party invitation
        keyboard.close();             //Closes user input
    }
}
