// Program: EvenEntryLoop.java -> p.231
// Author: Chase Stephenson
// Date Written: 9/15/2026

import java.util.*;
public class EvenEntryLoop 
{
    public static void main(String[] args)
    {
        int stop = 999, num;                     //num Holds user input, stop Holds dummy value to quit 
        Scanner input = new Scanner(System.in);  //To accept user input

        System.out.print("Enter an even number or 999 to end program: "); //Propmts user for input
        num = input.nextInt();                                            //accepts and assigns user input
        

        while(num != stop)                               //Loop continues until user enters dummy value to quit
        {
            if(num % 2 == 0)                             //Checks if user input is divisible by 2 and ends with no remainder
                System.out.print("Good job!\n");         //If entered integer is even, display this message
            else
                System.out.print("Error! Try again!\n"); //If intered integer is odd, display this message

            System.out.print("Enter an even number or 999 to end program: "); //Propmts user again for input
            num = input.nextInt();                                            //accepts and assigns user input
        }
        input.close();   //Closes user input
    }   
}
