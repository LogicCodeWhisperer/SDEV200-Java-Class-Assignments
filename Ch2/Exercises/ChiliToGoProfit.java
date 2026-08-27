// Program: ChiliToGo.java
// Author: Chase Stephenson
// Date Written 8/26/2026

import java.util.Scanner;
public class ChiliToGoProfit 
{
    public static void main(String[] args)
    {
        //Declarations
        int adultMealPrice = 7;
        int childMealPrice = 4;
        int numAdultMeals;
        int numChildMeals;
        int adultMealTotal;
        int childMealTotal;
        int total;
        Scanner input = new Scanner(System.in);

        //Initial Informative output statment
        System.out.println("Adult meals cost $7 and child meals cost $4\n");

        //User Input
        System.out.print("How many adult meals? >> ");
        numAdultMeals = input.nextInt();
        System.out.print("How many child meals? >> ");
        numChildMeals = input.nextInt();
        System.out.println();
        
        //Calculations
        adultMealTotal = adultMealPrice * numAdultMeals;  //Total for adult meals
        childMealTotal = childMealPrice * numChildMeals;  //Total for child meals
        total = adultMealTotal + childMealTotal;          //Total for all meals

        //Output Statements
        System.out.println("Total cost for adult meals is $" + adultMealTotal);
        System.out.println("Total cost for child meals is $" + childMealTotal);
        System.out.println("Total cost for all meals is $" + total);
    }
}
