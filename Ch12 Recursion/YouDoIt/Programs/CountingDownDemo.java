//Program: CountingDownDemo.java 
//Author: Chase Stephenson
//Date:10/16/2026

public class CountingDownDemo
{
    public static void main(String[] args)
    {
        countingDown(10);                      //Call to recursive method, sending 10 as argument
        System.out.println("Blastoff!");       //Displays once the count down reaches zero 
    }

    public static void countingDown(int count)
    {
        if(count > 0)                          
        {
            System.out.println(count);         //Displays current count
            countingDown(count - 1);           //Method calls itself using the current number - 1 as the parameter 
        }
    }
}