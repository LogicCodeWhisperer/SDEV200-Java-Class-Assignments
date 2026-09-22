// Program: PreschoolDemo.java -> p.192-193
// Author: Chase Stephenson
// Date Written: 9/6/2026

public class PreschoolDemo 
{
    public static void main(String args[])
    {
        //Objects
        PreschoolStudent ps1 = new PreschoolStudent(2345,5);
        PreschoolStudent ps2 = new PreschoolStudent(67890,8);
        PreschoolStudent ps3 = new PreschoolStudent(2685, 4);

        //Sending to display method
        display(ps1);
        display(ps2);
        display(ps3);              //Added for step 13
        ps1.setAge(6);
        ps2.setAge(5);             //Added for step 13
        ps2.setIdNum(2416);        //Added for step 13
        ps3.setAge(4);             //Added for step 13
        display(ps1);
        display(ps2);              //Added for step 13
        display(ps3);              //Added for step 13
        ps1.setAge(7);
        display(ps1);
    }
    
    //Method to display student information
    public static void display(PreschoolStudent ps) 
    {
        System.out.print("Student ID " + ps.getIdNum());
        System.out.println(" Student age " + ps.getAge());
        System.out.println();
    }
    
}
