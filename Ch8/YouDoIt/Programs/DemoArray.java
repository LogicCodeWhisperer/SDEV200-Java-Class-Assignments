// Program: DemoArray.java -> p.270
// Author: Chase Stephenson
// Date Written: 9/13/2026

public class DemoArray 
{
    public static void main(String[] args)
    {
        double[] salaries = new double[4];  //Array declaration and creation in one
        salaries[0] = 16.25;                //Assigns value to element 1 of subscript/index 0
        salaries[1] = 17.55;                //Assigns value to element 2 of subscript/index 1
        salaries[2] = 18.25;                //Assigns value to element 3 of subscript/index 2
        salaries[3] = 19.85;                //Assigns value to element 4 of subscript/index 3

        //Outputs elements into individual rows
        System.out.print("Salaries on by one are:\n" +
                         salaries[0] + "\n" +
                         salaries[1] + "\n" +
                         salaries[2] + "\n" +
                         salaries[3] + "\n");
    }
}
