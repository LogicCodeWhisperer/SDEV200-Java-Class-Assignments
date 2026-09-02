// Program: SpaService.java -> p.123-124
// Author: Chase Stephenson
// Date Written: 9/2/2026

public class SpaService 
{
    //Field declarations
    private String serviceDescription;
    private double price;

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
