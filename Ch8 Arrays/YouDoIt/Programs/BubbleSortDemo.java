// Program: BubbleSortDemo.java -> p.298
// Author: Chase Stephenson
// Date Written: 9/14/2026

import java.util.*;
public class BubbleSortDemo 
{
    public static void main(String[] args)
    {
        //Declarations
        int[] someNums = new int[6];                 //Array of 6 integers
        int comparisonsToMake = someNums.length - 1; //Control variable for number of comparisons during sort
        Scanner keyboard = new Scanner(System.in);   //Scanner for user input
        int a, b, temp;                              //a and b used as index/subscript - temp holds sort value
    
        for(a = 0; a < someNums.length; ++a)   //Loop that continuously prompts user for integer input until array index is greater than array size
        {
            System.out.print("Enter number " + (a + 1) + ": "); //Prompts the user to enter number 1 then increments while a is less than array siz3 
            someNums[a] = keyboard.nextInt();                   //Accepts and assigns user input for integer
        }

        display(someNums, 0);        //Calls method that accepts the array and sort iterations performed (0)
        
        for(a  = 0; a < someNums.length - 1; ++a)   //Loop controls the number of passes through the list  
        {
            for(b = 0; b < comparisonsToMake; ++b)  //Loop controls comparisons on each pass
            {
                if(someNums[b] > someNums[b+1])     //Checks if elements are out of order
                {
                    temp = someNums[b];             //temp holds one of the elements
                    someNums[b] = someNums[b+1];    //The temp held element is set equal to the second
                    someNums[b+1] = temp;           //The second element is set equal to temp
                }
            }
            display(someNums, (a + 1));   //Call to display method with current list arguments 
            --comparisonsToMake;          //Reduces comparisons to be made on next pass as the first element is now in proper order  
        }

        keyboard.close();
    }

    //Method accepts array and current outer loop index and displays the results of the current sort (per pass)
    public static void display(int[] someNums, int a) //Parameters for array and outer loop index for current list 
    {
        System.out.print("Iteration " + a + ": ");    //Output that says what current iteration holds the following results 
        for(int i = 0; i  < someNums.length; ++i)     //Loop that executes until the indext reaches out of bounds index set by array length
            System.out.print(someNums[i] + " ");      //Prints each element in the current order (per pass)
        System.out.println();                         //After for loop completes, curser moves to the next line
    }
}
