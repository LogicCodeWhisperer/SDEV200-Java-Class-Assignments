// Program: StringBuilderMethods.java -> p.257
// Author: Chase Stephenson
// Date Written: 9/12/2026


public class StringBuilderMethods
{
    public static void main(String[] args)
    {
        //Used to creat a StringBuilder object then display
        StringBuilder str = new StringBuilder("singing");
        System.out.println(str);

        //Adds characters to the existing StringBuilder and displays again
        str.append(" in the dead of ");
        System.out.println(str);

        //Inserts additional characters in two different locations of the StringBuilder
        //and displays again, separately
        str.insert(0, "Black");
        System.out.println(str);
        str.insert(5, "bird ");
        System.out.println(str);

        //Adds characters to the existing StringBuilder and displays again
        str.append("night");
        System.out.println(str);

    }
}
