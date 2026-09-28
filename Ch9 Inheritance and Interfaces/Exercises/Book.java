// Program: Book.java -> p.387
// Author: Chase Stephenson
// Date Written: 9/27/2026

public abstract class Book 
{
    //Declared Fields
    private String title;
    double price;

    //Constructor requiring book title parameter
    public Book(String title)
    {
        this.title = title;
    }

    //Method for title
    public String getTitle()
    {
        return title; 
    }
    
    //Method for price
    public double getPrice()
    {
        return price;
    }

    //Abstract method to allow unique prompts in subclasses that use it
    public abstract void setPrice(double price); 
}
