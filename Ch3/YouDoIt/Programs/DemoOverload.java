package Ch3.YouDoIt.Programs;
// Program: DemoOverload.java -> p.106
// Author: Chase Stephenson
// Date Written: 8/31/2026

public class DemoOverload 
{
    public static void main(String[] args)
    {
        // Declared Variables
        int month = 6, day = 24, year = 2023;

        //displayDate method call with different parameters
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    } 
    
    //displayDate() call for month only
    public static void displayDate(int mm)
    {
        System.out.println("Event date " + mm + "/1/2024");
    }

    //displayDate() call for month and day
    public static void displayDate(int mm, int dd)
    {
        System.out.println("Event date " + mm + "/" + dd + "/2024");
    }

    //displayDate() call for month, day, and year
    public static void displayDate(int mm, int dd, int yy)
    {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy);
    }
}
