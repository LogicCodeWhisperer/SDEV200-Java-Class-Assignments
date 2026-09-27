// Program: Sailboat.java -> p.355
// Author: Chase Stephenson
// Date Written: 9/23/2026

import javax.swing.*;
public class Sailboat extends Vehicle
{
    private int length;  //declaration for length field

    //-Constructor that first calls on the parent constructor and sends two
    // arguments to provide the values for powerSource and wheels 
    //-Then calls setLength to prompt user for length to be set for Sailboat Objects 
    public Sailboat()
    {
        super("wind", 0);
        setLength();
    }

    //Method to prompt for and assign user input to length
    public void setLength()
    {
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet ");
        length = Integer.parseInt(entry); 
    }

    //Method to return the assigned length
    public int getLength()
    {
        return length;
    }

    //This must be included because the parent class setPrice() method is abstract
    @Override public void setPrice()
    {
        String entry;                                                        //Declaration of user input string 
        final int MAX = 100000;                                              //Declarating for max price (to be compared) 
        entry = JOptionPane.showInputDialog(null, "Enter sailboat price ");  //Prompts user for price
        price = Integer.parseInt(entry);                                     //Parses string to integer representation
        if(price > MAX)                                                      //Compares user input price to max price
            price = MAX;                                                     //If user input is higher than max, the price is set to max
    }

    //Overrides toString object class version with this version
    @Override public String toString()
    {
        return ("The " + getLength() + " foot sailboat is powered by " + getPowerSource() + 
                "; it has " + getWheels() + " wheels and costs $" + getPrice());
    }
}
