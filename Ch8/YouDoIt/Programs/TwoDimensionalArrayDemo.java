// Program: TwoDimensionalArrayDemo.java -> p.305-306
// Author: Chase Stephenson
// Date Written: 9/15/2026

import java.util.Scanner;
public class TwoDimensionalArrayDemo 
{
    public static void main(String[] args)
    {
        int[][] count = new int[3][3];          //3 rows by 3 columns integer array declaration (Note: all values initialized to zero by default)
        Scanner input = new Scanner(System.in); //Scanner for user input
        int row, column;                        //Declares integer variables for rows and column
        final int QUIT = 99;                    //Constant used as an exit variable

        System.out.print("Enter a row or " + QUIT + " to quit: "); //Promts user to enter row or quit
        row = input.nextInt();                                     //Accepts and assigns user input 

        while(row != QUIT)                                          //While row is not equal to QUIT (99) loop continues
        {
            System.out.print("Enter a column: ");                   //Prompts user to enter column number
            column = input.nextInt();                               //Accepts and assigns user input 
            
            if(row < count.length && column < count[row].length)    //Checks if user input for row is less than amount of rows in the array size 
            {                                                       //Aslo checks if user input for column is less than amount of columns in the array size
                count[row][column]++;                               //If both conditions are true, row and column location is incremented by 1
                                                                    //Ex: if count[1][2] = 3, it is incremented to hold 4 as the new value
                for(int r = 0; r < count.length; ++r)               //Outer loop to locate row
                {
                    for(int c = 0; c < count[r].length; ++c)        //Inner loop to locate column
                        System.out.print(count[r][c] + " ");        //Once found, value is displayed
                    System.out.println();                           //Moves curser to the next line
                }
            }
            else
                System.out.println("Invalid position selected");    //If user enters a row or column, Invalid message is displayed

            System.out.print("Enter a row or " + QUIT + " to quit: "); //Reprompts the user for input of row or quit, if a new row is input, loop goes through another itteration
            row = input.nextInt();                                     //Accepts and assigns user input 
        }
        input.close();
    }
}
