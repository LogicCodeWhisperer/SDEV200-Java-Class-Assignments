// Program: DinnerPartyWithConstructor2.java -> p.341
// Author: Chase Stephenson
// Date Written: 9/21/2026

public class DinnerPartyWithConstructor2 extends PartyWithConstructor2 
{
    //Variable declaration to hold user input for dinnerChoice
    private int dinnerChoice;

    public DinnerPartyWithConstructor2(int numGuests)
    {
        super(numGuests);
    }

    //Methhod to return user dinner choice
    public int getDinnerChoice()
    {
        return dinnerChoice;
    }

    //Sets user dinner choice
    public void setDinnerChoice(int choice)
    {
        dinnerChoice = choice;
    }

    //Overrides parent class method of the same name
    @Override public void displayInvitation()
    {
        System.out.println("Please come to my dinner party!");
    }
}
