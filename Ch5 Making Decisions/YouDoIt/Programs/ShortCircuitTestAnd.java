// Program: ShortCircuitTestAnd.java -> p.176-177
// Author: Chase Stephenson
// Date Written: 9/6/2026

public class ShortCircuitTestAnd 
{
    public static void main(String[] args)
    {
        if(falseMethod() && trueMethod())
            System.out.println("Both are true");
        else
            System.out.println("Both are not true");
    }

    //Method for true return
    public static boolean trueMethod()
    {
        System.out.println("Within trueMethod()");
        return true;
    }

    //Method for false return
    public static boolean falseMethod()
    {
        System.out.println("Within falseMethod()");
        return false;
    }
}




