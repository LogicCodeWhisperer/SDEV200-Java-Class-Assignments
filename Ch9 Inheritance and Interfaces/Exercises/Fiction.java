// Program: Fiction.java -> p.387
// Author: Chase Stephenson
// Date Written: 9/27/2026

public class Fiction extends Book
{
    //Fiction constructor with one parameter
    public Fiction(String title)
    {
        super(title);
        setPrice(24.99);
    }

    //Implement abstract method 
    @Override public void setPrice(double price)
    {
        super.price = price;
    }

    //Overrides built in toString method for displaying
    @Override public String toString()
    {
        return ("The fiction book title is " + getTitle() + " and costs $" + getPrice());
    }
}
