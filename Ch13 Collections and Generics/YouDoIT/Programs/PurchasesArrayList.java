// Program: PurchasesArrayList.java -> p.522
// Author: Chase Stephenson
// Date Written: 10/16/2026

import java.util.*;
public class PurchasesArrayList 
{
    private static final Scanner kb = new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayList<Purchase> purchases = new ArrayList<Purchase>();  //Creates ArrayList of purchases
        String category;
        double price;
        final String quit = "zzz";

        System.out.print("Enter category for purchase or " + quit + " to quit: ");
        category = kb.nextLine();                                                      //Accepts and assigns user input
        //Data entry loop continues until user enters zzz
        while(!category.equals(quit))                                                  //compares input to quit variable
        {
            System.out.print("Enter amount spent: ");
            price = kb.nextDouble();                                                   //Accepts and assigns user input
            kb.nextLine();                                                             //Clears input buffer
            purchases.add(new Purchase(category, price));                              //Adds category and price to ArrayList
            System.out.print("Enter category for purchase or " + quit + " to quit: ");
            category = kb.nextLine();                                                  //Accepts and assigns user input
        }

        System.out.println("\nBefore sort: ");
        display(purchases);                             //Calls method before sort to display ArrayList
        Collections.sort(purchases);                    //Method call to sort ArrayList
        System.out.println("After sort: ");
        display(purchases);                             //Calls method after sort to display ArrayList
    } 
    
    public static void display(ArrayList<Purchase> p)
    {
        int x;
        for(x = 0; x < p.size(); ++x)
            System.out.println("  " + p.get(x).getCategory() + " " + p.get(x).getPrice());
        System.out.println();
    }
}
