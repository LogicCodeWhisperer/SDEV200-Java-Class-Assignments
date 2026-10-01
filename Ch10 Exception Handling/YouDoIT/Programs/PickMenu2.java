// Program: PickMenu2.java -> p.424
// Author: Chase Stephenson
// Date Written: 9/30/2026


//This class might throw exceptions but contains no methods to catch them
import javax.swing.*;
public class PickMenu2 
{
    private Menu2 briefMenu;
    private String guestChoice = new String();

    public PickMenu2(Menu2 theMenu) throws MenuException //Also place throws clause in header of called method that calls displayMenu() which actually throws the Exception
    {
        briefMenu = theMenu;
        setGuestChoices(); 
    }

    //Displays menu and reads keyboard data entry
    public void setGuestChoices() throws MenuException //indirect throw of displayMenu() MenuException;
    {
        JOptionPane.showMessageDialog(null, "Choose from the following menu:");
        guestChoice = briefMenu.displayMenu();
    }

    //returns guests string selection from PickMenu
    public String getGuestChoice()
    {
        return(guestChoice);
    }
}
