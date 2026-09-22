// Program: DemoIncrement2.java -> p.213
// Author: Chase Stephenson
// Date Written: 9/8/2026


public class DemoIncrement2 
{
    public static void main(String[] args)
    {
        //Declares the v variable and initializes it to a value of 4
        int v = 4;

        //Declares the increment variable plusPlusV that holds the 
        //incremented value of v  
        int plusPlusV = ++v;

        //Resets the value of v to 4
        v = 4;
        
        //Declares the increment variable vPlusPlus that holds the 
        //value of v before increment
        int vPlusPlus = v++;

        //Output statements displaying the results of the above variables 
        System.out.print("v is " + v + "\n" +
                         "++v is " + plusPlusV + "\n" + 
                         "v++ is " + vPlusPlus + "\n");

        //Declares and initializes variables w, x, and y
        int w = 17, x = 17, y = 18;

        //Declares compare1 and compare2 as boolean variables, evaluates the 
        //attached comparison and stores the result (true or false)
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);

        //Output statements that show the outcome of the boolean variable expressions 
        System.out.print("First compare is " + compare1 + "\n" + 
                         "Second compare is " + compare2);
    }    
}
