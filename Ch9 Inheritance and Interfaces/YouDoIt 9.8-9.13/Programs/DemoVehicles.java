// Program: DemoVehicles.java -> p.355
// Author: Chase Stephenson
// Date Written: 9/23/2026

import javax.swing.*;
public class DemoVehicles 
{
    public static void main(String[] args)
    {   
        //Object declarations
        Sailboat aBoat = new Sailboat(); //creates Sailboat object aBoat
        Bicycle aBike = new Bicycle();   //creates Bicycle object aBike

        //Ststment desplays the contents of the two objects
        JOptionPane.showMessageDialog(null, "\nVehicle descriptions:\n" +
                            aBoat.toString() + "\n" + aBike.toString());
    }
}
