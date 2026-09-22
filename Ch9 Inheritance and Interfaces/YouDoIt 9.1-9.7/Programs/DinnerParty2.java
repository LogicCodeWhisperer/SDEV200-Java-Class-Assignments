// Program: DinnerParty2.java -> p.338
// Author: Chase Stephenson
// Date Written: 9/21/2026

public class DinnerParty2 extends Party
{
    //Variable declaration to hold user choice
    private int dinnerChoice;

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
