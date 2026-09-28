// Program: BookArray.java -> p.387
// Author: Chase Stephenson
// Date Written: 9/27/2026

import javax.swing.JOptionPane;

public class BookArray 
{
    public static void main(String[] args)
    {
        StringBuffer outString = new StringBuffer(); 
        Book[] books = new Book[10];
        int i;

        for(i = 0; i < books.length; ++i)
        {
            String input, title;
            int bookCat;
            input = JOptionPane.showInputDialog(null, "Please Select the primary category\n" +
                                                          "of a book title you want to enter: \n" +
                                                          "1. Fiction\n" +
                                                          "2. NonFiction");
            bookCat = Integer.parseInt(input);         //Converts input string to integer
            if(bookCat == 1)                           //if statment checks user input
            {
                title = JOptionPane.showInputDialog(null, "Enter a Fiction book title");
                books[i] = new Fiction(title);         //Condition == 1 will create new Fiction object 
            }
            else if(bookCat == 2)
            {
                title = JOptionPane.showInputDialog(null, "Enter a NonFiction book title");
                books[i] = new NonFiction(title);      //Condition == 2 will create new NonFiction object
            }
            else
            {
                JOptionPane.showMessageDialog(null, "invalid input Please try again");
                i--;                                   //Entering any other integer will result in an invalid input and decrement the index
            }
        }

        for(i = 0; i < books.length; ++i)
        {
            outString.append("\n#" + (i + 1) + " ");  //for loop fills the string buffer object 
            outString.append(books[i].toString());    //with stored array data
        }
        
        JOptionPane.showMessageDialog(null, "The books entered are:\n" + outString); //Displays StringBuffer object contents
    }
}
