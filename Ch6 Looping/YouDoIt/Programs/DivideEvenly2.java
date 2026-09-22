// Program: DivideEvenly2.java -> p.222
// Author: Chase Stephenson
// Date Written: 9/8/2026

public class DivideEvenly2 
{
    public static void main(String[] args)
    {
        //Declared variables, LIMIT is initialized here
        final int LIMIT = 100;
        int var, number;

        //for loop with number as the control variable
        for(number = 1; number <= LIMIT; ++number)
        {
            //Start of the output statment for a number (number) that is divisible by 
            //numbers listed when the inner loop completes an iteration 
            System.out.print(number + " is evenly divisible by ");

            //for loop with var as the control variable
            for(var = 1; var <= number; ++var)
                //If statement to add the variable (var) value to the output statement if 
                //there is no remainder as well as a space to separate the values
                if (number % var == 0)
                    System.out.print (var + " ");

            //Prints to a new line after listing all divisible numbers for the current number 
            //(This println() is in the outer loop)
            System.out.println();
        }
    }
}
