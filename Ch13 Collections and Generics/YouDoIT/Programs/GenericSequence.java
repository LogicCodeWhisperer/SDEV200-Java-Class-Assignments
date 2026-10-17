// Program: GenericSequence.java -> p.534
// Author: Chase Stephenson
// Date Written: 10/13/2026

public class GenericSequence 
{
    public static void main(String[] args)
    {
        Character grade = 'A';
        Integer score = 0;
        Double pay = 21.34;
        String word = "Hello";
        
        //Passes the different Variables to duplicate the specified number of times 
        duplicate(grade, 5);
        duplicate(score, 10);
        duplicate(pay, 3);
        duplicate(word, 7);
    }

    public static <T> void duplicate(T obj, int num)
    {
        int x;
        for(x = 0; x < num; ++x)          //Loops until specified number of duplications is complete
            System.out.print(obj + " ");  //Prints variable values, then space between each
        System.out.println();             //Moves curser to next line for the next variable pass
    }
}
