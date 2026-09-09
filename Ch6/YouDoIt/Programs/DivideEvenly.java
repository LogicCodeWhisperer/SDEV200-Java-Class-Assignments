// Program: DivideEvenly.java -> p.216
// Author: Chase Stephenson
// Date Written: 9/8/2026

public class DivideEvenly 
{
    public static void main(String[] args)
    {
        //Declared variables, LIMIT is initialized here
        final int LIMIT = 100;
        int var;

        //Start of the output statment that says which numbers are divisible by LIMIT
        System.out.print(LIMIT + " is evenly divisible by ");

        //Loop that starts at one and ends once var is greater than LIMIT 
        for(var = 1; var <= LIMIT; ++var)
        {
            //If statement to add the variable value to the output statement if 
            //there is no remainder as well as a space to separate the values
            if (LIMIT % var == 0)
                System.out.print (var + " ");
        }

        //Book says to insert this to advance insertion point to next line, though I am 
        //uncertain why this matters because without it the output is the same.
        System.out.println();
    }
}
