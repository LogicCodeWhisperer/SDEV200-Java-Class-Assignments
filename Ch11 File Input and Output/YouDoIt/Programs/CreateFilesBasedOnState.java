// Program: CreateFilesBasedOnState.java -> p.471-475
// Author: Chase Stephenson
// Date Written: 10/2/2026

import java.nio.file.*;                            //Needed for file Path
import java.io.*;                                  //Needed for output stream and BufferedWriter
import java.nio.channels.FileChannel;              //Needed for FileChannel
import java.nio.ByteBuffer;                        //Needed for ByteBuffer wrap()
import static java.nio.file.StandardOpenOption.*;  //Needed for CREATE and WRITE arguments 
import java.util.Scanner;                          //Needed to accept user input
import java.text.*;                                //Needed for DecimalFormat
public class CreateFilesBasedOnState 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  //Accepts user input

        //Two path objects to hold different records /*Path starts from active program project directory*/
        Path inStateFile = 
            Paths.get("CreateFilesBasedOnState\\InStateCusts.txt");
        Path outOfStateFile = 
            Paths.get("CreateFilesBasedOnState\\OutOfStateCusts.txt");

        final String ID_FORMAT = "000";                                    //Account number format (3 digits)
        final String NAME_FORMAT = "          ";                           //Customer name format (10 spaces)
        final int NAME_LENGTH = NAME_FORMAT.length();                      
        final String HOME_STATE = "WI";                                    //Customer state
        final String BALANCE_FORMAT = "0000.00";                           //Customer balance format (allows up to 9999.99)
        String delimiter = ",";                                            //defines the field delimiter as a comma
        String s = ID_FORMAT + delimiter + NAME_FORMAT +                   //Generic assembled customer record string
                   delimiter + HOME_STATE + delimiter +                           /*Defines record format*/
                   BALANCE_FORMAT + System.getProperty("line.separator");
        final int RECSIZE = s.length();                                    //Holds the record size (being consistent with size is important 
        //                                                                 //for record position calculation for random file access
        FileChannel fcIn = null;      //FileChannel In reference
        FileChannel fcOut = null;     //FileChannel Out reference
        String idString;              //String representation of customer account id
        int id;                       //integer representation of customer account id
        String name;                  //String to hold customers name
        String state;                 //String to hold customers state
        double balance;               //String to hold customers balance
        final String QUIT = "999";    //String constant to identify end of data entry

        //Method calls to create empty files that will eventually have random entered records
        //Methods accept file path and the string defining the record format
        createEmptyFile(inStateFile, s);       
        createEmptyFile(outOfStateFile, s); 
        
        //Will handle data entry and file writting for customer records
        try  
        {
            fcIn = (FileChannel)Files.newByteChannel(inStateFile, CREATE, WRITE);
            fcOut = (FileChannel)Files.newByteChannel(outOfStateFile, CREATE, WRITE);

            System.out.print("Enter customer account number: ");
            idString = input.nextLine();                     //Accepts and assigns input to idString
            while(!(idString.equals(QUIT)))
            {
                id = Integer.parseInt(idString);             //Converts entered account number from string to integer

                System.out.print("Enter customer name: ");   
                name = input.nextLine();                     //Accepts and assigns user input to name
                StringBuilder sb = new StringBuilder(name);  //Creates a string builder object
                sb.setLength(NAME_LENGTH);                   //Sets the Stringbuilder object to declared length
                name = sb.toString();                        //Assigns name to the string builder object

                System.out.print("Enter state: ");
                state = input.nextLine();                    //Accepts and assigns input to state

                System.out.print("Enter balance: ");
                balance = input.nextDouble();                        //Accepts and assigns input to balance
                input.nextLine();                                    //Absorbs the enter key value left in the input stream

                //Uses class to ensure that the balance meets the format requirements of the file
                /*Adds necessary zeros to fulfil format requirement*/
                DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);

                s = idString + delimiter + name + delimiter + state + delimiter + //Construction of the String to be written to the file by concatenating  
                    df.format(balance) + System.getProperty("line.separator");    //the entered fields with the comma delimiter and the line separator

                byte data[] = s.getBytes();                //Converts the constructed String to an array of bytes
                ByteBuffer buffer = ByteBuffer.wrap(data); //Wraps the array into a ByteBuffer

                if(state.equals(HOME_STATE))     //Checks if customer is in state and writes to in state FileChannel
                {
                    fcIn.position(id * RECSIZE); //Positions the file pointer to start writing record in correct position based on account number
                    fcIn.write(buffer);          //Writes data string to file 
                }
                else                             //Customer is out of state and writes to out of state FileChannel
                {
                    fcOut.position(id * RECSIZE);//Positions the file pointer to start writing record in correct position based on account number
                    fcOut.write(buffer);         //Writes data string to file
                }

                System.out.print("Enter next customer account number or " + QUIT + " to quit: ");
                idString = input.nextLine();
            }

            //Closes both file channels
            fcIn.close();
            fcOut.close();
        }
        catch (Exception e)
        {
            System.out.println("Error message: " + e);
        }
        input.close();
    }

    //Method creates empty files using default record format string s. 
    //Creates 1000 records with account number 000 
    public static void createEmptyFile(Path file, String s)
    {
        final int NUMRECS = 1000;               //Constant defining number of records to be written

        try
        {
            OutputStream outputstr =                                           //Declares new output stream 
                new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = 
                new BufferedWriter(new OutputStreamWriter(outputstr));         //creats bufferedwriter using declared output stream 
            for(int count = 0; count < NUMRECS; ++count)                       //Loop to write 1000 default records 
                writer.write(s, 0, s.length());                                //using parameter String
            writer.close();                                                    //Closes BufferedWriter
        }
        catch(Exception e)                                                     //Handles thrown Ecception from try block
        {
            System.out.println("Error message: " + e);
        }
    }
}