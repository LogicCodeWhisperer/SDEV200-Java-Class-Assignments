// Program: TestedFusedLoopTime.java -> p.184
// Author: Chase Stephenson
// Date Written: 9/9/2026

import java.time.*;
public class TestedFusedLoopTime 
{
    public static void main (String[] args)
    {
        //Declarations for loop time and control variable
        int startTime, endTime, x;
        final int REPEAT = 10_000_000, FACTOR = 5_000_000;

        //Object declaration, initialization, and Nanoseconds extraction for startTime
        LocalDateTime now;
        now = LocalDateTime.now(); //Gets current time 
        startTime = now.getNano(); //extracts the nanoseconds value from current time

        //Loop Fusion for method 1 and 2
        for(x = 0; x < REPEAT; ++x)
            method1(x, REPEAT);
        for(x = 0; x < REPEAT; ++x)
            method2();

        //Gets a current time in Nanoseconds for endTime
        now = LocalDateTime.now();
        endTime = now.getNano();

        //Output statement to show amount of time taken to complete loop execution
        System.out.println("Time for loops executed separately: " +
                         ((endTime - startTime) / FACTOR) + " milliseconds");

        //Gets new current startTime in nanoseconds
        now = LocalDateTime.now(); //Gets current time 
        startTime = now.getNano(); //extracts the nanoseconds value from current time

        //Single loop that performs the same tasks as Loop Fusion
        for(x = 0; x < REPEAT; ++x)
        {
            method1(x, REPEAT);
            method2();
        }  

        //Gets new current endTime in Nanoseconds
        now = LocalDateTime.now();
        endTime = now.getNano();

        //Output statement to show amount of time taken to complete loop execution
        System.out.println("Time for loops executed in a block: " +
                         ((endTime - startTime) / FACTOR) + " milliseconds");
    }

    //Empty method for demonstartion 
    public static void method1(int x, final int REPEAT)
    {
        for(x = 0; x < REPEAT; ++x); //Do-Nothing Loop
    }

    //Empty method for demonstartion 
    public static void method2()
    {

    }
}
