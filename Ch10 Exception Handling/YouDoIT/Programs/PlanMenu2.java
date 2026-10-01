// Program: PlanMenu2.java -> p.424
// Author: Chase Stephenson
// Date Written: 9/30/2026


//This application uses the PickMenu class and can catch the thrown exceptions from PickMenu
import javax.swing.*;
public class PlanMenu2 
{
    public static void main(String[] args)
    {
        Menu2 briefMenu = new Menu2();      //Constructs Menu named briefMenu
        PickMenu2 entree = null;            //Declares PickMenu object (Not constructed to allow for potential exception catch from PickMenu constructor)
        String guestChoice = new String();  //String that holds user menu selection

        try
        {
            PickMenu2 selection = new PickMenu2(briefMenu); //Constructs PickMenu item 
            entree = selection;                           //Assigns selection to entree object if construction is successful
            
            //Allowed because entree is a PickMenu object, so it can access getGuestChoice, 
            //therefore the returned value can be assigned to guestChoice String 
            guestChoice = entree.getGuestChoice();                                                                  
        }
        catch(MenuException charHandling) //Eception that handles a character input if first letter is same as exact entree first letter
        {
             guestChoice = charHandling.getMessage(); //Calls getMessage() method extended from the parent Exception Class using the catch exception reference
        }
        catch(Exception error)
        {
            guestChoice = "an invalid selection"; //Assigns Guest choice a value if the try block fails
        }
        
        //Displays customer choice after try catch, reguardless of exception error
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }   
}
