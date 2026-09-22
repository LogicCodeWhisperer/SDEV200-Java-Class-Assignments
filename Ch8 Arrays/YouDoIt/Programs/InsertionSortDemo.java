// Program: InsertionSortDemo.java -> p.299-300
// Author: Chase Stephenson
// Date Written: 9/14/2026

import java.util.*;
public class InsertionSortDemo 
{
    public static void main(String[] args)
    {
        //Declarations
        int[] someNums = new int[5];                 //Array of 5 integers
        //int comparisonsToMake = someNums.length - 1; //Control variable for number of comparisons during sort
        Scanner keyboard = new Scanner(System.in);   //Scanner for user input
        int a, b, temp;                              //a and b used as index/subscript - temp holds sort value
    
        for(a = 0; a < someNums.length; ++a)   //Loop that continuously prompts user for integer input until array index is greater than array size
        {
            System.out.print("Enter number " + (a + 1) + ": "); //Prompts the user to enter number 1 then increments while a is less than array siz3 
            someNums[a] = keyboard.nextInt();                   //Accepts and assigns user input for integer
        }

        display(someNums, 0);        //Calls method that accepts the array and sort iterations performed (0)
        
        a = 1;
        while(a < someNums.length)   //Loop controls the number of passes through the list  
        {

            temp = someNums[a];      //temp holds the first element
            b = a -1;                //b is set equal to current value of a - 1
            
            while(b >= 0 && someNums[b] > temp)  //Loop checks if b is greater than or equal to 0 and current element is greater than the element held by temp
            {                                    //If the one or the other condition is false
                someNums[b+1] = someNums[b];     //The first element is set to the second
                --b;                             //Decrements the value of b
            }
            someNums[b+1] = temp;     //The temp held element (in this case someNums[b+1]) is set equal to the second
            display(someNums, a);     //Call to display method with current list arguments 
            ++a;                      //Increments iteration counter 
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
