// Program: Car.java -> p.315
// Author: Chase Stephenson
// Date Written: 9/16/2026

public class Car 
{
    private int year;
    private Model model;
    private Color color;

    //Constructor for class that accepts and hold parameter values for year, model, and color
    public Car(int yr, Model m, Color c)
    {
        year = yr;
        model = m;
        color = c;
    }

    //Displays Car objects data
    public void display()
    {
        System.out.println("Car is a " + year + " " +
                           color + " " + model);
        
    }
}

