// Program: EvenOdd .java -> p.197
// Author: Chase Stephenson
// Date Written: 9/15/2026

import java.util.*;
public class EvenOdd 
 
{
    public static void main(String[] args)
    {
        int num;                                //Holds user input value
        boolean result = false;                 //Result initialized to false
        Scanner input = new Scanner(System.in); //Accepts user input


        System.out.print("Enter an integer: "); //Prompts user for integer input
        num = input.nextInt();                  //Assigns user input to num
        result = EvenOrOdd(result, num);        //calls EvenOrOdd method with parameters

        if(result == true)                      //If returned value is true(even)
            {System.out.println("The entered integer is even");} //display this message
        else                                    //Else, returned value is false(odd)
            {System.out.println("The entered integer is odd");}  //so display this message
        
            input.close();                          //User input closed
    }

    public static boolean EvenOrOdd(boolean result, int num) //Method with accepted parameters
    {
        if(num % 2 == 0)            //Checks that user input divided by 2 has no remainder 
            return result = true;   //If no remainder, result is true and returned to main
        else
            return result;          //If remainder, result stays false and returned to main   
    }
}


/*Copy and paste this above other code to test this code (above furthest curly brace)
{
    
    public static void main(String[] args)
    {
        int num;                                //Holds user input value
        boolean result;                         //Result initialized to false
        Scanner input = new Scanner(System.in); //Accepts user input
        
        
        System.out.print("Enter an integer: "); //Prompts user for integer input
        num = input.nextInt();                  //Assigns user input to num
        result = EvenOrOdd(num);                //calls EvenOrOdd method with parameters

        if(result == true)                      //If returned value is true(even)
            {System.out.println("The entered integer is even");} //display this message
        else                                    //Else, returned value is false(odd)
            {System.out.println("The entered integer is odd");}  //so display this message

        input.close();                          //User input closed
    }

    public static boolean EvenOrOdd(int num) //Method with accepted parameter
    {
        boolean result = false;       //Result initialized to false
        if(num % 2 == 0)              //Checks that user input divided by 2 has no remainder 
            {return result = true;}   //If no remainder, result is true and returned to main
        else
            {return result;}          //If remainder, result stays false and returned to main
    }
}
Copy and paste this below other code to test this code (above furthest curly brace)*/