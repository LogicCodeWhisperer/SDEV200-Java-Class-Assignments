package Ch3.YouDoIt;
// Program: DemoBlock.java -> p.103
// Author: Chase Stephenson
// Date Written: 8/31/2026

public class DemoBlock 
{
    //Outer block
    public static void main(String[] args)
    {
        //Outer block variable declaration
        int x = 1111;

        //Output statments
        System.out.println("Demonstrating block scope");
        System.out.println("In first block x is " + x);

        //First inner block
        {
            //First inner block variable declaration
            int y = 2222;
            System.out.println("In second block x is " + x);
            System.out.println("In second block y is " + y);
        }

        //Second inner block
        {
            //Second inner block variable declaration
            int y = 3333;

            //Second inner block output statements before demoMethod
            System.out.println("In third block x is " + x);
            System.out.println("In third block y is " + y);

            //Call to demoMethod()
            demoMethod();

            //Second inner block output statements after demoMethod
            System.out.println("After method x is " + x);
            System.out.println("After method block y is " + y);
        }

        //Last output statement of main()
        System.out.println("At the end x is " + x);
    }

    //demoMethod implemintation
    public static void demoMethod()
    {
        //demoMethod() declared variables
        int x = 8888, y = 9999;

        //demoMethod() output statements
        System.out.println("In demoMethod x is " + x);
        System.out.println("In demoMethod block y is " + y);
    }

}
