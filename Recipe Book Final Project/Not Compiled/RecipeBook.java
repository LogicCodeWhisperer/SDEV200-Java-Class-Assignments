// Program: RecipeBookMain.java --> Final Project
// Author: Chase Stephenson
// Date Started: 9/17/2026
/*
=============================================================================================================================================================================================================================================|
* 9/17/2026                                                                     | 9/22/2026                                                                     | 9/23/2026                                                                  |
*  Added:                                                                       |  Name change of main program from RecipeBookTest to RecipeBookMain            |  Added:                                                                    |
*   imports for swing and util                                                  |  Moved global constant to RecipeCard Parent class for inheritance use         |   ProgramInfoTips()                                                        |
*   declared constant for max recipe cards array index (can be inherited)       |   Added:                                                                      |    -Displays program information message before entering tip menu          |
*   user choice to main(String[] args) for menu choice and loop control         |    AddRecipe()                                                                |    -Tip menu that takes user input as a string and converts to integer     |
*   public static int MainMenu() for user visual selection                      |     -"Empty" check to avoid dispalaying empty RecipeCard                      |    -Uses switch case inside while loop to display input until user exit    |
*    -displays menu selection choices for user needs and return user choice     |    RemoveRecipe()                                                             |    -Currently has 1 tip for view recipe lookup error                       |
*     to the main(String[] args) method for while loop switch case              |     -ask user to enter recipe name to remove                                  |============================================================================|
*   public static void AddRecipe() to add a recipie to array object             |     -Loop to check in bounds array elements for recipe name                   | 9/28/2026                                                                  |
*    -recipe[i] = new RecipeCard() to allocate memory for each array element    |     -If statement checks if an in bounds element is the same as input         |  Added:                                                                    |
*    -while loop allows user to enter multiple recipes if they choose           |       -method variables are set to null                                       |   new Recipe.java superclass                                               |
*    -recipe details are set by calling set methods in RecipeCards.java         |       -set methods are called in Recipe to pass empty values                  |    -Placed all contents from RecipeCard.java in new super class            |
*   public static void ViewRecipe() to display recipes or list of recipes       |       -indexed array element values are set to empty                          |  Changes:                                                                  |    
*    -while loop to prompt user for recipe or list to view                      |       -break statement exits loop to avoid checking the rest of array         |   Main Menu is now InputDialog box                                         |
*    -for loop with nested if statement to search for recipe existance          |     -Method ends and returns to main menu                                     |   RecipeCard currently only contains inherited contructor from Recipe.java |
*    -if statement to check if the user wants to view the current list          |    ***********************************************************************    |    -Recipe.java is abstract forcing RecipeCard() object creation           |
*    --Both the for loop and if statement call get methods to display           |    * This method currently eliminates the display of any recipes stored  *    |   Creation of RecipeCard() object placed in AddRecipe()                    |
*      desired information                                                      |    * in a higher index --need to add sort to correct issue--             *    |   RemoveRecipe() now sets name to null, eliminating the entire object      |
*                                                                               |    ***********************************************************************    |   Logic now reflects null comparisons instead of "Empty"                   |
=============================================================================================================================================================================================================================================|
* 10/3/2026                                                    | 10/4/2026                                                                         | 10/5/2026                                                                               |              
*  Added:                                                      |  Added:                                                                           |  Added:                                                                                 |
*   RemoveRecipe()                                             |   main()                                                                          |   UpdateRecipe()                                                                        |
*    -User can choose exit to Main menu                        |    -try-catch for file reading                                                    |    -For-loop runs through array size                                                    |
*    -try{}catch{(Exception e)} generic error                  |     -Declarations for Array index, list population, file path, and array of files |     -if-statement checks for not null and checks that input recipe name exists          |
*    -do-while controls user input and confirmation            |     -if-statement checks for files, if none exist program goes to MainMenu()      |      -do-while-loop continues until user chooses option 4                               |
*    -Boolean variable                                         |      -for-loop checks each existing file in path folder                           |      	-User input menu allows user to choose what needs updated (integer input)        |
*    -Creates file-object to delete saved recipes              |       -Scanner object created in each new iteration to read current file          |	 -if input is out of bounds, message displays and continues to next iteration        |
*   CreateRecipeFile() <---Located in RecipeCard.java          |       -Scanner reads first line and assigns name                                  |	 -Option one                                                                         |
*    -Set name to indexed recipe to reduce typing              |       -During file creation a new object is created for each file read            |      -Sets current name to String variable                                              |
*    -declare String to hold file path                         |       -while-loop continues until empty line is reached                           |      -Takes user input for new name                                                     |
*    -Creates BufferedWriter Object                            |        -if statement checks for line separator to switch list                     |      -Sets file path for old file removal                                               |
*    -Creates wrapped FileWriter Object to create file         |         -while list == 1, prints to AddIngredients()                              |      -Deletes stored text file in folder                                                |
*    -for-loop processes and writes Directions list to file    |         -while list == 2, prints to AddDirections()                               |      -Places new name in recipe name object index                                       |
*    -for-loop processes and writes Ingredients list to file   |      -Dialog box show successful file load                                        |      -Sorts Recipes (Ensures the new name is in alphabetical order                      |
*   AddRecipe()                                                |  Changed:                                                                         |     -Option two(ingredients) and (directions)                                           |
*    -Call to CreateRecipeFile() in RecipeCard Class           |   ViewRecipe()                                                                    |      -for-loop array list to build a string                                             |
*  Changed:                                                    |    -Interface is now dialog boxes for initial prompt and 'list'                   |      -Displays built string list with a numerical line choice                           |
*   RemoveRecipe()                                             |===================================================================================|      -Accepts and convers user choice from string to integer                            |
*    -interface is now dialog boxes                            | 10/10/2026                                                                        |	  -Accepts new user input for chosen line                                            |
===============================================================|  Added:                                                                           |      -Sends array, index and user input to corresponding change method                  |
* 10/9/2026                                                    |   -New MainMenu class for JFrame                                                  |     -Option 4                                                                           |
*  Added:                                                      |  Changed:                                                                         |      -Exits loop and returns to Main Menu                                               |
*   RecipeSort()                                               |   -Main Menu now operates using the new JFrame                                    |     -After options execute, method call in RecipeCard.java replaces stored file         |
*    -Outer for-loop to go through each Array Object           |   -MainMenu() removed from RecipeBook.java due to new operational menu            |=========================================================================================|
*    -Inner for-loop performs alphabetical order Bubble Sort   |   -Removed main(String[] args) *Now located in MainMenu.java*                     | 10/16/2026                                                                              |
*     >Loop also sorts null to a higher index                  |===================================================================================|  Added:                                                                                 |
*    -Outer loop decrements inner loop after inner executes    | 10/15/2026                                                                        |   -if-statements throughout code to "catch" a null entry for Close and Cancel buttons   |
*    -Added method to:                                         |  Fixed:                                                                           |   ViewRecipe()                                                                          |    
*      >AddRecipe(), UpdateRecipe(), and RemoveRecipe()        |   UpdateRecipe()                                                                  |    -If the user preses enter immediately, the first recipe in the list displays         |
*  Changed:                                                    |    -Loop now resets String Builder and line number variables                      |   DropList()                                                                            |
*   ProgramInfoTips()                                          |     *This eliminates duplicate list items*                                        |    -New method to create a drop list menu called from View, Add, or Remove Recipe       |
*    -Option is now empty due to other changes                 |  Changed:                                                                         |  Changed:                                                                               |
*   ViewRecipe()                                               |   AddRecipe()                                                                     |   -Input recipe name boxes replaced with drop lists in View, Add, and Remove sections   |
*    -Now uses String Builder to display using dialog box      |    -JOptionPane YES_NO_OPTION dialog replaced generic JOptionPane input dialog    |=========================================================================================|
***************************************************************|   UpdateRecipe()                                                                  |
**Every window in the program has been updated to dialog boxes*|    -JOptionPane option dialog replaced generic JOptionPane input dialog menu      |
***************************************************************|                                                                                   |
===================================================================================================================================================|
*/
//import java.util.*;
import javax.swing.*;
import java.io.*;        //Needed for output stream and BufferedWriter
public class RecipeBook
{
    public static void ViewRecipe(Recipe[] recipes)
    {
        int i;                                                     //Declares index veriable
        boolean exit = false;                                      //Declares while loop exit variable
        String rName; //listString = "";                           //rName for user input, list to compare user input for descisions, ListName to build Recipe list
        String sb = "";                                            //Initialized to nothing for multiple uses as (s)tring(b)uilder

        while(exit != true)
        {
            rName = DropList(recipes, 1);  //Call recieves user input
            if(rName == null)                                                                         
                return;                                                                               //Returns to main menu if user clicks cancel or [X] 
            for(i = 0; i < recipes.length; ++i)                                                       //Loop to compare if index is less than or equal to array size
            {   
                if(recipes[i] != null && rName.equalsIgnoreCase(recipes[i].getRecipeName()))
                {   
                    sb = "\nRecipe Name: " + recipes[i].getRecipeName() + "\n" +    //Adds Recipe Name header to String builder
                         "\nIngredients: \n";                                       //Adds Ingredients header to String Builder
                    for(String ingredient : recipes[i].getIngredients())            //Loops through ingredient list
                        {sb = sb + ingredient + "\n";}                              //Adds each line from ingredient array list to String builder                         
                    sb = sb + "\nDirections:\n";                                    //Adds Directions header to String Builder
                    for(String directions : recipes[i].getDirections())             //Loops through directions list
                        {sb = sb + directions + "\n";}                              //Adds each line from directions array list to String builder
                    JOptionPane.showMessageDialog(null, sb, "View Recipe", 
                     /*Blocking anoying lines*/   JOptionPane.INFORMATION_MESSAGE); //Displays Built String
                    exit = true;                                                    //Sets exit to true for while loop exit
                    break;                                                          //breaks out of for loop once recipe is found and displayed
                }
            }  
            if(exit != true)                                                        //exit stays false until user enters acceptable input
                JOptionPane.showMessageDialog(null, "Input Error, please try again.", 
                 /*Just blocking anoying lines*/    "View Recipe", JOptionPane.INFORMATION_MESSAGE); //Error for incorrect input   
        }                                                                           //End of while-loop
    }                                                                               //End of ViewRecipe()
    
    public static void AddRecipe(Recipe[] recipes)
    {
        String rName, ingredients = "", directions = ""; //Each variable holds user input for recipe name, ingredients, and directions in a recipe card object
        int choice = JOptionPane.YES_OPTION;             //Assigns user choice to enter another recipe
        int i;                                           //Used as loop index for recipe array
         
        for(i = 0; i < recipes.length; i++)
        {
            try
            {
                //Checks if recipe name has value "Empty", loop continues until user enters 'n' or 'N'
                while(recipes[i] == null && i < recipes.length && choice == JOptionPane.YES_OPTION) 
                {
                    //Prompts user to enter recipe name
                    rName = JOptionPane.showInputDialog(null, "Enter recipe name: ", 
                     /*Just blocking anoying lines*/          "Add Recipe Name", JOptionPane.QUESTION_MESSAGE);  //Assigns user input to rName 
                    if(rName == null)                                                                         
                        return;                                                       //Returns to main menu if user clicks cancel or [X]                                   
                    recipes[i] = new RecipeCard(rName);                               //Creates new RecipeCard object for each new index (Must use RecipeCard.java for inheritance requirement)
                    //Prompts user to enter recipe ingredients individually
                    ingredients = JOptionPane.showInputDialog(null, "Enter recipe ingredients one at a time.\n" +
                     /*Just blocking anoying lines*/                "            Enter 'done' when finished.     ", 
                     /*                           */                "Add Recipe Ingredients", JOptionPane.QUESTION_MESSAGE);
                    if(ingredients == null)
                    {
                        recipes[i] = null;
                        return;
                    }
                    while(!ingredients.equalsIgnoreCase("done"))       //while loop input check condition
                    {
                        recipes[i].AddIngredient(ingredients);         //Adds next ingredient to array list for current indexed array object 
                        ingredients = JOptionPane.showInputDialog(null, "Ingredients:\nEnter another or 'done': ", 
                         /*                           */                "Add Recipe Ingredients", JOptionPane.QUESTION_MESSAGE); //Assigns user input to ingredients  
                    }
                    //Prompts user to enter recipe directions individually
                    directions = JOptionPane.showInputDialog(null, "Enter recipe directions one at a time.\n" +
                     /*Just blocking anoying lines*/               "         Enter 'done' when finished.    ", 
                     /*                           */                "Add Recipe Directions", JOptionPane.QUESTION_MESSAGE);     //Assigns user input to directions
                    if(directions == null)
                    {
                        recipes[i] = null;
                        return;
                    }
                    while(!directions.equalsIgnoreCase("done"))                                                     //while loop input check condition
                    {
                        recipes[i].AddDirections(directions);                                                       //Adds next direction to array list for current indexed array object 
                        directions = JOptionPane.showInputDialog(null, "Directions:\nEnter another or 'done': ", 
                         /*                           */               "Add Recipe Directions", JOptionPane.QUESTION_MESSAGE); //Assigns user input to directions                                    
                    }
                    RecipeCard.CreateRecipeFile(recipes, i, true);                                                  //Sends all entered data to a method in RecipeCard.java to create text files to store recipes  **10/5/2026**
                    MainJFrame.setViewButton(true);
                    RecipeSort(recipes);                                                                            //Sends Array of objects to sort method
                    i++;                                                                                            //Increments Loop index before out of bounds check to add another
                    if(i < recipes.length)                                                                          //Checks if index has become 'Out of Bounds'
                        choice = JOptionPane.showConfirmDialog(null, "Do you want to add another recipe?",          //Accepts and assigns user choice
                         /*Just blocking anoying lines*/             "Add Recipe", JOptionPane.YES_NO_OPTION);
                    else
                    {
                        JOptionPane.showMessageDialog(null, "You have reached the maximum recipes allowed by the program!", 
                         /*                           */                "Add Recipe", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }    
            } 
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            } 
        }                                                                        //End of outer for loop
        if(i == recipes.length && choice == JOptionPane.YES_OPTION)              //Checks if max cards has been reached
                JOptionPane.showMessageDialog(null, "Recipe Book is full! Please remove a recipe before adding another.",
                  /*                           */   "Add Recipe", JOptionPane.INFORMATION_MESSAGE);
    }                                                                            //End of public static void AddRecipe(RecipeCard[] recipe)

    public static void UpdateRecipe(Recipe[] recipes)
    {
        String rName, choiceString;                                //Holds user input for a recipe card name, holds user choice, String Builder
        int i, choiceNum;                                          //Loop index for recipe array, holds converted user choice   
        boolean done = false;
        Object[] buttons = {"Name", "Ingredients", "Directions", "Different Recipe", "Return to main menu"};  //Array for menu button options
        
        rName = DropList(recipes, 2);  //Call recieves user input

        if(rName == null)                                                                         
                return;                                                    //Returns to main menu if user clicks cancel or [X] 
        for(i = 0; i < recipes.length; ++i)
        {
            if(recipes[i] != null && rName.equalsIgnoreCase(recipes[i].getRecipeName()))
            {   
                do 
                {      
                    String sb = "";                                                                          //Initialized to nothing for multiple uses as (s)tring(b)uilder -> Declared inside loop to reset Variable
                    int num = 1;                                                                             //Used to identify list item -> Declared inside loop to reset variable
                    choiceNum = JOptionPane.showOptionDialog(null, "Select update option for " + rName + ".\n", 
                                                                       "Update Recipe", JOptionPane.DEFAULT_OPTION, 
                                                            JOptionPane.QUESTION_MESSAGE, null, buttons, null); 
                    if(choiceNum == 0)
                    {
                        String oldName = recipes[i].getRecipeName();                                         //Holds previous name to identify file name to be deleted from storage
                        rName = JOptionPane.showInputDialog(null, "Enter the new name for recipe " + rName, 
                        /*                           */           "Update Recipe", JOptionPane.QUESTION_MESSAGE);
                        if(rName == null)                                                                         
                            return;                                                                          //Returns to main menu if user clicks cancel or [X]
                        File removeRecipe = new File("StoredRecipes\\" + oldName + ".txt");                  //Inserts old name for current recipe to file path
                        removeRecipe.delete();                                                               //Deletes file named in file path
                        recipes[i].setNewRecipeName(rName);                                                  //Sets new recipe name for current array index
                        RecipeSort(recipes); 
                    }
                    else if(choiceNum == 1)
                    {
                        for(String ingredient : recipes[i].getIngredients())                                //Loops the directions array list   
                            {sb = sb + num + ") " + ingredient + "\n"; num++;}                              //Builds array list as String
                        choiceString = JOptionPane.showInputDialog(null, "Enter the corisponding ingredient number:\n" + sb, 
                        /*                           */                  "Update Recipe", JOptionPane.QUESTION_MESSAGE);
                        if(choiceString == null)                                                                         
                            return;                                                                         //Returns to main menu if user clicks cancel or [X]
                        else
                            num = Integer.parseInt(choiceString);                                           //Converts User input to integer
                        choiceString = JOptionPane.showInputDialog(null, "Enter new ingredient:", 
                        /*                           */                  "Update Recipe", JOptionPane.QUESTION_MESSAGE);            
                        if(choiceString == null)                                                                         
                            return;                                                                         //Returns to main menu if user clicks cancel or [X]                        
                        Recipe.ChangeIngredient(recipes, i, num, choiceString);                             //Call to superclass method to change chosen line
                    }                                                                                       
                    else if(choiceNum == 2)                                                                 
                    {                                                                                       
                        for(String directions : recipes[i].getDirections())                                 //loops the directionsarray list     
                            {sb = sb + num + ") " + directions + "\n"; num++;}                              //builds array list as String to 
                        choiceString = JOptionPane.showInputDialog(null, "Enter the corisponding direction number:\n" + sb, 
                        /*                           */                  "Update Recipe", JOptionPane.QUESTION_MESSAGE);
                        if(choiceString == null)                                                                         
                            return;                                                                         //Returns to main menu if user clicks cancel or [X]
                        else
                            num = Integer.parseInt(choiceString);                                           //Converts User input to integer
                        choiceString = JOptionPane.showInputDialog(null, "Enter new direction:", 
                        /*                           */                  "Update Recipe", JOptionPane.QUESTION_MESSAGE);            
                        if(choiceString == null)                                                                         
                            return;            
                        Recipe.ChangeDirection(recipes, i, num, choiceString);                              //Call to superclass method to change chosen line
                    }
                    else if(choiceNum == 3)
                    {
                        i = 0;
                        rName = DropList(recipes, 2);  //Call recieves user input
                        if(rName == null)                                                                         
                            return;                                                                        //Returns to main menu if user clicks cancel or [X]
                        break;
                    }
                    else if(choiceNum == 4)
                        return;                                                                            //Returns to main menu
                    RecipeCard.CreateRecipeFile(recipes, i, false);                                        //Sends all entered data to a method in RecipeCard.java to create text files to store recipes 
                    if(recipes[0] == null)
                        MainJFrame.setViewButton(false);
                }while(done == false);
            }                                                                                              //End of if-statment (recipes[i] != null && rName.equalsIgnoreCase(recipes[i].getRecipeName()))
        }                                                                                                  //End of for-loop
    }                                                                                                      //End of UpdateRecipt()

    public static void RemoveRecipe(Recipe[] recipes)
    {
        String rName; //Variable holds user input for a recipe card name in the recipe
        int i;                         //loop index for recipe array
        boolean found = false;         //do-while loop as exit variable and for-loop if-statement condition message "Recipe not found" 
        int delete;                    //Holds user input for condition

        try
        {   //Try block deletes user chosen recipe from the program and StoredRecipes folder
            rName = DropList(recipes, 3);  //Call recieves user input

            if(rName == null)                                                                         
                return;                                                                   //Returns to main menu if user clicks cancel or [X]
            for(i = 0; i < recipes.length; ++i)
            {
                if(rName.equalsIgnoreCase(recipes[i].getRecipeName()))
                {
                    //Meesage displays only after User has not exited RemoveRecipe() 
                    delete = JOptionPane.showConfirmDialog(null, "Are you sure you want to permanently delete " + rName + "?",          //Accepts and assigns user choice
                         /*Just blocking anoying lines*/             "Remove Recipe", JOptionPane.YES_NO_OPTION);
                    if(delete == JOptionPane.YES_OPTION)
                    {
                        recipes[i] = null;                                                //Sets current recipe index to null, eliminating the object from the array
                        found = true;                                                     //Sets found to true only if the recipe is found in the array
                        File removeRecipe = new File("StoredRecipes\\" + rName + ".txt"); //Inserts input to file path of created file-object
                        removeRecipe.delete();                                            //Deletes file named in file path
                        RecipeSort(recipes);                                              //Sends Array of objects to sort method 
                        break;                                                            //break out of for-loop
                    }
                    else if(delete == JOptionPane.NO_OPTION)
                        return;
                }
            }
            if(found == false)
                JOptionPane.showMessageDialog(null, "Recipe not found", "Remove Recipe", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong, recipe not properly deleted",
             /*Just blocking anoying lines*/    "Remove Recipe", JOptionPane.YES_NO_OPTION);          //Generic error message for try-catch
        }        
    }                                                                                                 //End of RemoveRecipe()

    public static void RecipeSort(Recipe[] recipes)
    {
        int i, s, sorts = recipes.length - 1;    //Both for-loop indexes, number of bjects set to variable numRecipes
        Recipe sortTemp;                         //Declares object to sort entire element according to name

        for(i = 0; i < recipes.length - 1; ++i)
        {
            for(s = 0; s < sorts; ++s)
            {
                if(recipes[s] == null && recipes[s+1] != null)  //If current indexed object doesn't exist but the next indexed object does exist then sort 
                {    
                    sortTemp = recipes[s];
                    recipes[s] = recipes[s+1];
                    recipes[s+1] = sortTemp;
                }
                if(recipes[s+1] == null)                        //If next object doesn't exist, leave the current object in place and continue to next iteration 
                    continue;
                if(recipes[s].getRecipeName().compareToIgnoreCase(recipes[s+1].getRecipeName()) > 0) //Sorts named objects into order
                {    
                    sortTemp = recipes[s];
                    recipes[s] = recipes[s+1];
                    recipes[s+1] = sortTemp;
                }
            }
            --sorts;
        }
    }

    public static String DropList(Recipe[] recipes, int Method)
    {
        String rName, calledFrom = "";
        String[] list = new String[recipes.length];                    //Array holds recipe names to create drop list
        for(int i = 0; i < recipes.length && recipes[i] != null ; i++) //Loop to check indexed array is in bounds and not null 
             list[i] = recipes[i].getRecipeName();                     //Populates string array with recipe name from recipes object
        
        if(Method == 1)
            calledFrom = "View Recipe";      //Call came from ViewRecipe Method in RecipeBook.java (int method hard coded into call)
        else if(Method == 2)
            calledFrom = "Update Recipe";    //Call came from UpdateRecipe Method in RecipeBook.java (int method hard coded into call)
        else
            calledFrom = "Remove Recipe";    //Call came from RemoveRecipe Method in RecipeBook.java (int method hard coded into call)
        
        rName = (String) JOptionPane.showInputDialog(null, "Choose recipe name from list:\n",
         /*                                   */  calledFrom , JOptionPane.QUESTION_MESSAGE,
         /*                                   */   null, list, list[0]);                       //Prompts the user to input recipe name
        return rName;
    }
}//End of public class RecipeBookMain