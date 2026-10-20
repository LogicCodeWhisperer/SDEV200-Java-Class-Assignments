import java.io.*;
import java.util.Scanner;
import javax.swing.*;
public class RecipeCard extends Recipe
{ 
    //Created to fulfill assignment requirement for inheritance
    public RecipeCard(String name)
    {
        super(name);
    }
    
    public static void CreateRecipeFile(Recipe[] recipe, int i, boolean newCard)
    {
        //Declarations
        String name;    
        String next = "-";                                           
        name = recipe[i].getRecipeName();                          //Used to alter file path based on user input
        String newRecipeFile = "StoredRecipes\\" + name + ".txt";  //Holds file path that alters based on user input
        try
        {
            BufferedWriter newFile = new BufferedWriter(new FileWriter(newRecipeFile)); //Creates wrapped FileWriter Object to create file
            newFile.write(name);                                                        //Writes recipe name to file
            newFile.newLine();                                                          //"newLinecharacter" moves curser to next line for writing 
            newFile.write(next);                                                        //Writes data divider to fil
            newFile.newLine();
            for(String ingredient : recipe[i].getIngredients())                         //for-loop processes ingredients list until list is null
            {
                newFile.write(ingredient);                                              //Writes ingredient on current line
                newFile.newLine();                                                      //"newLinecaracter" moved curser to next line for writing
            }
            newFile.write(next);                                                        //Writes data divider to file
            newFile.newLine();
            for(String directions : recipe[i].getDirections())                          //for-loop processes Directions list until list is null
            {
                newFile.write(directions);                                              //Writes a step on current line
                newFile.newLine();                                                      //"newLinecaracter" moved curser to next line for writing
            }
            newFile.close();                                                            //Closes open file after writing is complete
            if(newCard == true) //used to determine file creation, recieving true from AddRecipe() or false from UpdateRecipe() in RecipeBook.java
                JOptionPane.showMessageDialog(null,  name + " saved to RecipeBook", "Storage", 
                 /*Just blocking anoying lines*/     JOptionPane.INFORMATION_MESSAGE);    //Informs user recipe is stored - Created when called from AddRecipe() in RecipeBook.java 
            else
            {
                //ReadStoredRecipes(recipe, false);                                       
                JOptionPane.showMessageDialog(null, "Stored recipe has been succeffully updated", 
                /*Just blocking anoying lines*/"Update Recipe", JOptionPane.INFORMATION_MESSAGE); //Stored recipe is recreated when called from UpdateRecipe() in RecipeBook.java  /**10/5/2026**/
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong, recipe not saved"); //Generic error message
        }
        
    }

    public static void ReadStoredRecipes(Recipe[] recipes, boolean onStart)
    {    
        try
        { 
            int i = 0, list;                             //Array index and variable to change which list is being populated
            String name, listItem;                       //Holds Recipe file contents
            File folder = new File("StoredRecipes");     //Creates file object for file path folder
            File[] files = folder.listFiles();           //Creates an array of files to read from
            if(files == null || files.length == 0)
            {
                JOptionPane.showMessageDialog(null, "Currently no recipes are stored, continuing to main menu", "Storage", 
                 /*Just blocking anoying lines*/     JOptionPane.INFORMATION_MESSAGE);
                MainJFrame.setViewButton(false);
            }
                else
            {
                for(File current : files)                        //Reads array of files until no more files exist
                {                                                //current holds current file name the for-loop is reading
                    list = 1;                                    //initializes list to one during every for-loop iteration
                    Scanner read = new Scanner(current);
                    name = read.nextLine();                      //reads first line and assigns to name
                    read.nextLine();                             //reads separator line and does nothing with it
                    if(onStart == true)
                        recipes[i] = new RecipeCard(name);       //Creates new RecipeCard object for each new index (Must use RecipeCard.java for inheritance requirement)
                    else
                        recipes[i].setNewRecipeName(name);
                    while(read.hasNextLine())                    //Loop continues until no more contents are in file
                    {
                        listItem = read.nextLine();              //Reads line and assigns to listItem
                        if(listItem.equals("-"))                 //line separator sets list to 2 and continues to next iteration
                            {list = 2; continue;}                //Checks if current line is a separator/delimiter, changes list, continues to next while-loop iteration 
                        if(list == 1)                            
                            recipes[i].AddIngredient(listItem);  //If list == 1 add ingredient array list
                        else
                            recipes[i].AddDirections(listItem);  //If list == 2 add directions array list
                    } 
                    read.close();
                    i++;                                         //Increments index for next file
                }
                if(onStart == true)                              //onSart is at start of program execution, recieves call from CreateRecipeFile() if user updates recipe which makes onStart false (For now)
                {
                if(i == 1)
                    JOptionPane.showMessageDialog(null, "    Recipe loaded Successfully!\n" + 
                    /*   Just blocking anoying lines   */  "There is curently " + i + " recipe saved.", "Storage", 
                    /*                                 */        JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "    Recipes loaded Successfully!\n" + 
                    /*   Just blocking anoying lines  */"There are curently " + i + " recipes saved.", "Storage", 
                    /*                                */        JOptionPane.INFORMATION_MESSAGE); //Decrement not necessary here
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "There was an issue loading the files");
        }
    }
}