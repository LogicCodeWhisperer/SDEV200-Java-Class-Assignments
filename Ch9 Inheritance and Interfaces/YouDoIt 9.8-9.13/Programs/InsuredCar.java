// Program: InsuredCar.java -> p.375
// Author: Chase Stephenson
// Date Written: 9/27/2026

import javax.swing.*;
public class InsuredCar extends Vehicle implements Insured
{
    private int coverage; //Holds amount covered by insurance

    public InsuredCar()
    {
        super("gas", 4); //Calls Vehicle superclass constructor passing arguments for InsuredCar power source and number of wheels
        setCoverage();   //
    }

    public void setPrice()  //Required by the Vehicle class
    {
        String entry;
        final int MAX = 60000;
        entry = JOptionPane.showInputDialog(null, "Enter car price ");
        price = Integer.parseInt(entry);
        if(price > MAX)
            price = MAX; //Sets price to MAX only if user input is greater than 60000
    }

    public void setCoverage()
    {
        coverage = (int)(price * 0.9);
    }

    public int getCoverage()
    {
        return coverage;
    }

    public String toString()
    {
        return("The insured car is powered by " + getPowerSource() +
               "; it has " + getWheels() + " wheels, costs $" +
               getPrice() + " and is insured for $" + getCoverage());
    }
}
