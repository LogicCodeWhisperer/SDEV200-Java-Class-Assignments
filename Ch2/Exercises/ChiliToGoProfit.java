// Program: ChiliToGoProfit.java
// Author: Chase Stephenson
// Date Written 8/27/2026

import java.util.Scanner;
public class ChiliToGoProfit 
{
    public static void main(String[] args)
    {
        //Declarations
        double adultMealPrice = 7;
        double childMealPrice = 4;
        double numAdultMeals;
        double numChildMeals;
        double adultMealTotalProfit;
        double childMealTotalProfit;
        double totalProfit;
        Scanner input = new Scanner(System.in);

        //Initial Informative output statment
        System.out.println("Adult meals cost $7 and child meals cost $4\n");

        //User Input
        System.out.print("How many adult meals? >> ");
        numAdultMeals = input.nextDouble();
        System.out.print("How many child meals? >> ");
        numChildMeals = input.nextDouble();
        System.out.println();
        
        //Profit Calculations
        adultMealTotalProfit = (adultMealPrice - 4.35) * numAdultMeals;  //Total profit for adult meals
        childMealTotalProfit = (childMealPrice - 3.10) * numChildMeals;  //Total profit for child meals
        totalProfit = adultMealTotalProfit + childMealTotalProfit;       //Total profit for all meals

        //Rounding Calculation
        adultMealTotalProfit = Math.round(adultMealTotalProfit * 100.00) / 100.00;
        childMealTotalProfit = Math.round(childMealTotalProfit * 100.00) / 100.00;
        totalProfit = Math.round(totalProfit * 100.00) / 100.00;

        //Output Statements
        System.out.printf("Total Profit for adult meals is $%.2f\n", adultMealTotalProfit);
        System.out.printf("Total Profit for child meals is $%.2f\n", childMealTotalProfit);
        System.out.printf("Total Profit for all meals is $%.2f\n", totalProfit);
    }
}
