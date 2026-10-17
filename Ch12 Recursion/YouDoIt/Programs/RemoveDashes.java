//Program: CountingDownDemo.java 
//Author: Chase Stephenson
//Date:10/16/2026

import java.util.Scanner;
public class RemoveDashes 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x;
        String phone;

        System.out.print("Enter phone number: ");
        phone = input.nextLine();
        removeDashes(phone);
        System.out.println();
        input.close();
    }

    public static void removeDashes(String s)
    {
        int dashLoc = s.indexOf('-');                //Used to fine '-' in the string
        if(dashLoc == -1)                            //-1 means no '-' found
            System.out.print(s);                     //Prints string when no dashes are found in each recursive call
        else
        {
            removeDashes(s.substring(0, dashLoc));   //Passes position 0 to location of first '-'
            removeDashes(s.substring(dashLoc + 1));  //Passes position of '-' + 1 
        }
    }
}
