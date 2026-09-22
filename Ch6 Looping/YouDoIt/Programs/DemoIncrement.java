// Program: DemoIncrement.java -> p.213
// Author: Chase Stephenson
// Date Written: 9/8/2026


public class DemoIncrement 
{
    public static void main(String[] args)
    {
        //Declares the v variable and initializes it to  a value of 4
        int v = 4;
        
        //Declares the increment variable ++v that shows the after calculation value of v
        int plusPlusV = ++v;

        //Resets the value of v to 4
        v = 4;
        
        //Declares the increment variable v++ that shows the before calculation value of v
        int vPlusPlus = v++;

        //Output statements show how the above calculations are held in the variable v
        System.out.print("v is " + v + "\n" +
                         "++v is " + plusPlusV + "\n" + 
                         "v++ is " + vPlusPlus);
    }    
}
