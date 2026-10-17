// Program: Purchase.java -> p.522
// Author: Chase Stephenson
// Date Written: 10/16/2026

public class Purchase implements Comparable<Purchase>
{
    private String category;
    private double price;

    //Two parameter constructor used to set two fields
    public Purchase(String cat, double pr)
    {
        category = cat;
        price = pr;
    }

    //Both methods return value for each field
    public String getCategory()
    {
        return category;
    }
    public double getPrice()
    {
        return price;
    }

    //Overrides object class compareTo() to use the String class compareTo() method 
    //to compare a Purchase’s category with another Purchase’s category
    @Override public int compareTo(Purchase p)        
    {
        int result;
        result = category.compareTo(p.getCategory());
        return result;
    }
}
