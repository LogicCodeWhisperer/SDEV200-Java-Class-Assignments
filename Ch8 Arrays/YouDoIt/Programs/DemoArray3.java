// Program: DemoArray3.java -> p.277
// Author: Chase Stephenson
// Date Written: 9/13/2026

public class DemoArray3 
{
    public static void main(String[] args)
    {
        //Declares an array of 4 doubles named salaries
        double[] salaries = {16.25, 17.55, 18.25, 19.85};

        //Outputs elements into individual rows
        System.out.print("Salaries on by one are:\n");
        
        //Loop to display each array element by incrementing the 
        //control variable and comparing it to the arrays length 
        for(int i = 0; i < salaries.length; ++i)
            System.out.println(salaries[i]);
    }
}
