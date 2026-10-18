import java.util.*;
public abstract class Recipe 
{
    //Declares variables for placeholders and array list objects
    private String name;
    private ArrayList<String> ingredients = new ArrayList<>();
    private ArrayList<String> directions = new ArrayList<>();

    //Parent class constructor with parameter
    public Recipe(String name)
    {
        this.name = name;
    }

    //Recieves call from within UpdateRecipe() in RecipeBook.java
    public void setNewRecipeName(String newName)
    {
        name = newName;
    }
    
    //Recieves call from within AddRecipe(Recipe[] recipes) and RemoveRecipe(Recipe[] recipes) in RecipeBook.java
    public void AddIngredient(String recipeIngredient)  
    {                                                   
        ingredients.add(recipeIngredient);
    }
    public void AddDirections(String recipeDirections)
    {
        directions.add(recipeDirections);
    }

    //Recieves call from within ViewRecipe() in RecipeBook.java
    public String getRecipeName()//Also within RemoveRecipe() in RecipeBook.java and CreateRecipeFile() in RecipeCard.java
    {
        return name;
    }
    public ArrayList<String> getIngredients() //Also within CreateRecipeFile() in RecipeCard.java
    {
        return ingredients;
    }
    public ArrayList<String> getDirections()  //Also within CreateRecipeFile() in RecipeCard.java
    {
        return directions;
    }

    //Recieves call from within UpdateRecipe() in RecipeBook.java, Uses array of objects with current index to set array list line number to a new value 
    public static void ChangeIngredient(Recipe[] recipes,int i, int num, String newIngredient)
    {
        recipes[i].ingredients.set(num - 1, newIngredient);
    } 
    public static void ChangeDirection(Recipe[] recipes,int i, int num, String newDriection)
    {
        recipes[i].directions.set(num - 1, newDriection);
    }
       
}
