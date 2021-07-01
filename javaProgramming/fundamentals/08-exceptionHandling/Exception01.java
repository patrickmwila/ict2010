/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 01/06/2021
 * Description: A program that reads textual data from an existing file.
 *
 *             IOExceptions
 *             File Not Found Exception: Is a syntax error which occurs
 *             when attempting to open a file (for input), when that file
 *             does not exist (i.e if the wrong filename or file path used).
 *
 *             Other IOExceptions subclasses include:
 *             EOFException, UnsupportedEncodingException, SocketException,
 *             and SSLException
 */

// import all the classes needed for our program
//
import java.util.Scanner;                // will be used to read a file
import javax.swing.JOptionPane;          // will be used to display an error message

import java.io.IOException;              // will be used to throw File Not Found exception
import java.io.FileReader;               // will be used to read a file

public class Exception01
{
    public static void main(String [] args) // throws IOException
    {
        // JOptionPane flags
        String var_message_title = "Error Message",
               var_error_flag    = "There was an error opening the file" + 
                                    "\nCheck your file name!";
        try
        {
            // code which might have a FileNotFoundException
            Scanner var_read_file = new Scanner(new FileReader("test_file.txt"));
            var_read_file.close(); 
            
            while (var_read_file.hasNextLine())
            {
                String var_output_text = var_read_file.nextLine();
                System.out.println(var_output_text);
            }
        } 

        catch (IOException var_ex)
        {
            // code to run if an IOException occured
            JOptionPane.showMessageDialog(null, var_error_flag, var_message_title,
                                         JOptionPane.ERROR_MESSAGE);
        }

    }
}
