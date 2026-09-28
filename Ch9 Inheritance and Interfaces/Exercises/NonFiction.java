// Program: NonFiction.java -> p.387
// Author: Chase Stephenson
// Date Written: 9/27/2026

public class NonFiction extends Book
{
    //NonFiction constructor with one parameter
    public NonFiction(String title)
    {
        super(title);
        setPrice(37.99);
    }

    //Implement abstract method 
    @Override public void setPrice(double price)
    {
        super.price = price;
    }

    //Overrides built in toString method for displaying
    @Override public String toString()
    {
        return ("The nonfiction book title is " + getTitle() + " and costs $" + getPrice());
    }
}
