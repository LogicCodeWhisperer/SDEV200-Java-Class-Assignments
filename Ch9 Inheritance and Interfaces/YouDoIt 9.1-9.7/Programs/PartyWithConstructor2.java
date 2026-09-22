// Program: PartyWithConstructor2.java -> p.341
// Author: Chase Stephenson
// Date Written: 9/21/2026

public class PartyWithConstructor2 
{
    //Declares guests data field
    private int guests;

    //Single parameter cunstructor
    public PartyWithConstructor2(int numGuests)
    {
        guests = numGuests;
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
