// Program: PartyWithConstructor.java -> p.341
// Author: Chase Stephenson
// Date Written: 9/21/2026

public class PartyWithConstructor 
{
    //Declares guests data field
    private int guests;

    //No parameter cunstructor(default)
    public PartyWithConstructor()
    {
        System.out.println("Creating a Party");
    }

    //Get method that returns number of guests to the main program class
    public int getGuests()
    {
        return guests;
    }

    //Method that sets the number of guests that is returned in the get method 
    public void setGuests(int numGuests)
    {
        guests = numGuests;
    }

    //Method to be called when inventation needs displayed
    public void displayInvitation()
    {
        System.out.println("Please come to my party!");
    }

}
