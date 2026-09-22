// Program: SpaService.java -> p.123-124
// Author: Chase Stephenson
// Date Written: 9/2/2026

public class SpaService 
{
    //Field declarations
    private String serviceDescription;
    private double price;

    //Parameterless constructor
    public SpaService()
    {
        //Send default values to the two parameter constructor
        this("XXX", 0);
    }

    //Contructor with parameters
    public SpaService(String desc, double pr)
    {
        serviceDescription = desc;
        price = pr;
    }

    //Method declarations
    public void setServiceDescription(String service)
    {
        serviceDescription = service;
    } 

    public void setPrice(double servicePrice)
    {
        price = servicePrice;
    }

    public String getServiceDescription()
    {
        return serviceDescription;
    }

    public double getPrice()
    {
        return price;
    }
}
