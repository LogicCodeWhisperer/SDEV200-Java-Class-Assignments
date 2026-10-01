// Program: PickMenu.java -> p.424
// Author: Chase Stephenson
// Date Written: 9/30/2026


//This class might throw exceptions but contains no methods to catch them
import javax.swing.*;
public class PickMenu 
{
    private Menu briefMenu;
    private String guestChoice = new String();

    public PickMenu(Menu theMenu)
    {
        briefMenu = theMenu;
        setGuestChoices();
    }

    //Displays menu and reads keyboard data entry
    public void setGuestChoices()
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
