// Program: PlanVegetarianMenu.java -> p.424
// Author: Chase Stephenson
// Date Written: 9/30/2026


//This application uses the PickMenu class and can catch the thrown exceptions from PickMenu
import javax.swing.*;
public class PlanVegetarianMenu 
{
    public static void main(String[] args)
    {
        VegetarianMenu briefMenu = new VegetarianMenu(); //Constructs Menu named briefMenu
        PickMenu entree = null;            //Declares PickMenu object (Not constructed to allow for potential exception catch from PickMenu constructor)
        String guestChoice = new String(); //String that holds user menu selection

        try
        {
            PickMenu selection = new PickMenu(briefMenu); //Constructs PickMenu item 
            entree = selection;                           //Assigns selection to entree object if construction is successful
            
            //Allowed because entree is a PickMenu object, so it can access getGuestChoice, 
            //therefore the returned value can be assigned to guestChoice String 
            guestChoice = entree.getGuestChoice();                                                                  
        }
        catch(Exception error)
        {
            guestChoice = "an invalid vegetarian selection"; //Assigns Guest choice a value if the try block fails
        }
        
        //Displays customer choice after try catch, reguardless of exception error
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }   
}
