// Program: Bicycle.java -> p.355
// Author: Chase Stephenson
// Date Written: 9/23/2026

import javax.swing.*;
public class Bicycle extends Vehicle
{
    //Constructor that calls on the parent constructor and sends two
    //arguments to provide the values for powerSource and wheels 
    public Bicycle()
    {
        super("a person", 2);
    }

    //This must be included because the parent class setPrice() method is abstract
    @Override public void setPrice()
    {
        String entry;                                                        //Declaration of user input string 
        final int MAX = 4000;                                                //Declarating for max price (to be compared)
        entry = JOptionPane.showInputDialog(null, "Enter bicycle price ");   //Prompts user for price
        price = Integer.parseInt(entry);                                     //Parses string to integer representation
        if(price > MAX)                                                      //Compares user input price to max price
            price = MAX;                                                     //If user input is higher than max, the price is set to max
    }

    //Overrides toString object class version with this version
    @Override public String toString()
    {
        return ("The bicycle is powered by " + getPowerSource() + 
                "; it has " + getWheels() + " wheels and costs $" + getPrice());
    }
}
