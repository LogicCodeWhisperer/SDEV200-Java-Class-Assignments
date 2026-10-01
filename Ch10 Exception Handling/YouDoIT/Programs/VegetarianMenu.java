// Program: VegetarianMenu.java -> p.424
// Author: Chase Stephenson
// Date Written: 9/30/2026

public class VegetarianMenu extends Menu
{
    String[] vegEntreeChoices = {"Spinach Lasagna", "Cheese Enchiladas", "Fruit Plate"}; //Array for three new menu choices

    public VegetarianMenu()
    {
        super();
        for (int i = 0; i < vegEntreeChoices.length; ++i)
            entreeChoices[i] = vegEntreeChoices[i];
    }
}
