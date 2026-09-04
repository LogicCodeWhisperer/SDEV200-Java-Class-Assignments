// Program: CreateSpaServices.java -> p.133
// Author: Chase Stephenson
// Date Written: 9/4/2026

import java.util.Scanner;
public class CreateSpaServices 
{
    public static void main(String[] args)
    {
        //Declared reference for objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        SpaService thirdService = new SpaService("Facial", 22.99);
        //Call to method getData()
        firstService = getData(firstService);
        //secondService = getData(secondService);

        //Displays first service details entered by user
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + 
                           " $" + firstService.getPrice());

        //Displays second service details entered by user
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + 
                           " $" + secondService.getPrice()); 

        //Displays third service details entered by user
        System.out.println("Third service details:");
        System.out.println(thirdService.getServiceDescription() + 
                           " $" + thirdService.getPrice()); 
    }

    //Method for getData()
    public static SpaService getData(SpaService service)
    {
        //Declared variables
        String serviceDescription;
        double price;
        Scanner keyboard = new Scanner(System.in);

        //Output statments and user input for first service
        System.out.print("Enter service >> ");
        serviceDescription = keyboard.nextLine();
        System.out.print("Enter service price >> ");
        price = keyboard.nextDouble();

        //Removes remaining enter key in input buffer after last numeric entry
        keyboard.nextLine();

        //Sets the variables to be seen in output
        service.setServiceDescription(serviceDescription);
        service.setPrice(price);

        //Closes input from user
        //keyboard.close();  -> If not commented out, java gives error at second service input
        return service;
    }
}
