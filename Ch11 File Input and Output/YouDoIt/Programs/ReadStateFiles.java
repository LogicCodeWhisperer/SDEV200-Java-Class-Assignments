// Program: ReadStateFiles.java -> p.476-479
// Author: Chase Stephenson
// Date Written: 10/3/2026

import java.nio.file.*;                            //Needed for file Path
import java.io.*;                                  //Needed for output stream and BufferedWriter
import java.nio.channels.FileChannel;              //Needed for FileChannel
import java.nio.file.attribute.*;
import java.nio.ByteBuffer;                        //Needed for ByteBuffer wrap()
import static java.nio.file.StandardOpenOption.*;  //Needed for CREATE and WRITE arguments 
import java.util.Scanner;                          //Needed to accept user input
public class ReadStateFiles 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);                  //Scanner to accept user input
        String fileName;                                      //String to hold user input
        System.out.print("Enter name of file to use: ");
        fileName = kb.nextLine();                             //Accepts and assigns input to fileName
        fileName = "CreateFilesBasedOnState\\" + fileName;    //File path from project directory (Add ".txt" to eleminate need for user to enter it)
        Path file = Paths.get(fileName);                      //Creats path object
        
        final String ID_FORMAT = "000";                                    //Account number format (3 digits)
        final String NAME_FORMAT = "          ";                           //Customer name format (10 spaces)
        //final int NAME_LENGTH = NAME_FORMAT.length();                      
        final String HOME_STATE = "WI";                                    //Customer state
        final String BALANCE_FORMAT = "0000.00";                           //Customer balance format (allows up to 9999.99)
        String delimiter = ",";                                            //defines the field delimiter as a comma
        String s = ID_FORMAT + delimiter + NAME_FORMAT +                   //Generic assembled customer record string
                   delimiter + HOME_STATE + delimiter +                           /*Defines record format*/
                   BALANCE_FORMAT + System.getProperty("line.separator");
        final int RECSIZE = s.length();                                    //Holds the record size (being consistent with size is important 
        //                                                                 //for record position calculation for random file access
        
        byte data[] = s.getBytes();                //Array of bytes used with ByteBuffer
        final String EMPTY_ACCT = "000";           //Account number format (3 digits)
        String[] array = new String[4];            //String array to hold pieces of split record after reading from input file
        double balance;                            //Numeric customer balance
        double total = 0;                          //Total customer balance due for accumulation

        //Displays file creation time of user input fileName in defined path
        try 
        {
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.print("\nAttributes of the file:\n" +
                             "Creation time " + attr.creationTime() + "\n" +
                             "Size " + attr.size() + "\n"); //DONT FORGET NEW LINE CHARACTER WHEN USING print INSEAD OF println
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }

        try
        {
            InputStream iStream = new BufferedInputStream(Files.newInputStream(file));  
            BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
            System.out.println("\nAll non-default records:\n");                         //Displays header before reading first record
            s = reader.readLine();                                                      //reads first record

            while(s != null)                                //Reads file until there is no data on the next line
            {
                array = s.split(delimiter);                 //Splits String using the delimiter
                if(!array[0].equals(EMPTY_ACCT))            //Proceeds only if account number is not "000"
                {
                    balance = Double.parseDouble(array[3]); //Converts array that holds balance from a String to a double
                    System.out.println("ID #" + array[0] +  " " + 
                                      array[1] + " " + array[2] + " $" + array[3]); //Displays the split String elements
                    total += balance;                       //Adds each ballance to the accumulated total
                }
                s = reader.readLine();                      //Reads next record before the next itteration continues, if null, loop exits
            }

            System.out.println("Total of all balances is $" + total);  //Displays the accumulated total
            reader.close();                                            //Closes file reader
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }

        try
        {
            //Declarations of FileChannel, ByteBuffer, and find account variable
            FileChannel fc = (FileChannel)Files.newByteChannel(file, READ);
            ByteBuffer buffer = ByteBuffer.wrap(data);                      //Wraps the array into a ByteBuffer
            int findAcct;                                                   //Holds user input for account number to seek 

            System.out.print("\nEnter account to seek: ");
            findAcct = kb.nextInt();

            fc.position(findAcct * RECSIZE);            //Positions the file pointer to start reading record in correct position based on findAcct variable
            fc.read(buffer);                            //reads selected record into the ByteBufferuffer
            s = new String(data);                       //Converts byte array to String for displaying
            System.out.println("Desired record: " + s); //Displays coverted String 
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}
