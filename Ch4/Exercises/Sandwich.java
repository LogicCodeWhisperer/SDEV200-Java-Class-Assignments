// Program: Sandwich.java -> p.156
// Author: Chase Stephenson
// Date Written: 9/5/2026

public class Sandwich 
{
    //Field declarations
    private String mainIngredient, breadType;
    private double price;

/*  //Constructors
    public Sandwich()
    {

    }
/*
    public Sandwich(String MI, String BT, double PR)
    {
        mainIngredient = MI;
        breadType = BT;
        price = PR;
    }
*/
    //Method declarations
    public void setBreadType(String choice)
    {
        breadType = choice;
    }

    public void setMainIngredient(String choice)
    {
        mainIngredient = choice;
    }
    
    public void setPrice(double sandwichPrice)
    {
        price = sandwichPrice;
    }

    public String getBreadType()
    {
        return breadType;
    }

    public String getMainIngredient()
    {
        return mainIngredient;
    }

    public double getPrice()
    {
        return price;
    }
}
