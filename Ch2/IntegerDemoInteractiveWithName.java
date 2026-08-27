// Program: IntegerDemoInteractiveWithName.java
// Author: Chase Stephenson
// Date Written 8/26/2026

import java.util.Scanner;
public class IntegerDemoInteractiveWithName
{
    public static void main (String[] args)
    {
        //Declarations
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        String name;
        Scanner input = new Scanner(System.in);

        //Input Statements
        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a Byte integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter a Short integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter a Long integer >> ");
        aLong = input.nextLong();

        //String name input statement
        input.nextLine();
        System.out.print("Please enter your name >> ");
        name = input.nextLine();
        System.out.println("Thank you, " + name);
        
        //Output Statements
        System.out.println("The int is    " + anInt);
        System.out.println("The byte is   " + aByte);
        System.out.println("The short is  " + aShort);
        System.out.println("The long is   " + aLong);
    }
}