// Program: Vehicle.java -> p.355
// Author: Chase Stephenson
// Date Written: 9/23/2026

public abstract class Vehicle 
{                                //Declarations
    private String powerSource;  //Private String data field, so child classes cannot access
    private int wheels;          //Private integer data field, so child classes cannot access
    protected int price;         //protected integer data field that allows access by child classes 

    //Constructor that accepts two parameters
    public Vehicle(String powerSource, int wheels)
    {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    //get methods that return data field values
    public String getPowerSource()
    {
        return powerSource;
    }
    public int getWheels()
    {
        return wheels;
    }
    public int getPrice()
    {
        return price;
    }

    //set methods to assign data field values
    public void setPowerSource(String source)
    {
        powerSource = source;
    }
    public void setWheels(int numWheels)
    {
        wheels = numWheels;
    }

    //abstract method to allow unique prompts in subclasses that use it
    public abstract void setPrice(); 
}
