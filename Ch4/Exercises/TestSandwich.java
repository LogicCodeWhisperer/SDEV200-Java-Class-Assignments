// Program: TestSandwich.java -> p.156
// Author: Chase Stephenson
// Date Written: 9/5/2026

import java.util.Scanner;
public class TestSandwich 
{
    public static void main(String[] args)
    {
        //Declared reference for objects
        Sandwich choice1 = new Sandwich();

        //Opening message
        System.out.println("All bread selections have a fixed price of $2");
        System.out.println("All main ingredient prices are listed during selection\n");

        //Call to method getInfo
        choice1 = getInfo(choice1);

        
        //Display choice information
        System.out.println("Details about chosen sandwich:");
        System.out.print("Bread is " + choice1.getBreadType() + "\n" +
                         "Main Ingredient is " + choice1.getMainIngredient() + "\n");
        System.out.printf("Price is $%.2f", choice1.getPrice());
    }

    //Method for getInfo()
    public static Sandwich getInfo(Sandwich choice)
    {
        //Declared variables
        String mainIngredient, breadType;
        double bread, ingredient, mainPrice, breadPrice = 2.00, price;
        Scanner input = new Scanner(System.in);

        //Output statments and user input for bread choice
        //System.out.println("Enter corresponding number for bread choice:");
        System.out.print("1. White\n" +
                         "2. Wheat\n" +
                         "3. Italian\n" +
                         "4. Rye\n" +
                         "Enter corresponding number for bread choice here: ");
        bread = input.nextInt();
        System.out.println();                                                //Inserts a blank line for spaceing and easy reading

        //Output statments and user input for main ingredieant choice
        //System.out.println("Enter corresponding number for main ingredient choice:");
        System.out.print("1. Turkey -- $4\n" +
                         "2. Chicken - $4\n" + 
                         "3. Ham ----- $3\n" +
                         "4. Tuna ---- $2\n" +
                         "Enter corresponding number for main ingredient choice here: ");
        ingredient = input.nextInt();
        System.out.println();                                                //Inserts a blank line for spaceing and easy reading

        //If statements for bread choice (NOTE: choice 4 is irrelivant currently, anything other than 1-3 will choose Rye)
        if (bread == 1)
            {breadType = "White";}

        else if (bread == 2)
            {breadType = "Wheat";}

        else if(bread == 3)
            {breadType = "Italian";}

        else if(bread == 4)
            {breadType = "Rye";}

        else
            {breadType = "No bread keto diet";
             breadPrice = 0.00;                  }

        //If statements for ingredient choice (NOTE: choice 4 is irrelivant currently, anything other than 1-3 will choose Tuna)
        if (ingredient == 1)
            {mainIngredient = "Turkey";
             mainPrice = 4.00;         }

        else if (ingredient == 2)
            {mainIngredient = "Chicken";
             mainPrice = 4.00;          }

        else if(ingredient == 3)
            {mainIngredient = "Ham";
             mainPrice = 3.00;      }

        else if(ingredient == 4)
            {mainIngredient = "Tuna";
             mainPrice = 2.00;       }
        
        else
            {mainIngredient = "No Main Ingredient Selected";
             mainPrice = 0.00;                                 }

        //calculations
        price = breadPrice + mainPrice;
        price = Math.round(price * 100.00) / 100.00;

        //Removes remaining enter key in input buffer after last numeric entry
        input.nextLine();

        choice.setMainIngredient(mainIngredient);
        choice.setBreadType(breadType);
        choice.setPrice(price);

        return choice;
    }
}
