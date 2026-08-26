// Program: DataDemoInteractive.java
// Author: Chase Stephenson
// Date Written 8/26/2026

import java.util.Scanner;
public class IntegerDemoInteractive
{
    public static void main (String[] args)
    {
        //Declarations
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        Scanner input = new Scanner(System.in);

        //Input Statements
        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter an integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter an integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter an integer >> ");
        aLong = input.nextLong();

        //Output Statements
        System.out.println("The int is    " + anInt);
        System.out.println("The byte is   " + aByte);
        System.out.println("The short is  " + aShort);
        System.out.println("The long is   " + aLong);
    }
}