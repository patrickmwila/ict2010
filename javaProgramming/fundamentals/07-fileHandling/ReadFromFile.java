/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 31/05/2021
 * Description: A program that reads textual data from an existing file.
 *
 *              Note: The file to be read from, must be located in the same 
 *                    folder as the java file, otherwise you have to specify
 *                    the file path.
 *
 *                    File Not Found Exception: Is a syntax error which occurs
 *                    when attempting to open a file (for input), when that file
 *                    does not exist (i.e if the wrong filename or file path 
 *                    used).
 */

// import the necessary classes
import java.util.Scanner;  
import java.io.IOException;
import java.io.FileReader;

public class ReadFromFile
{
    public static void main(String [] args) throws IOException
    {
        // create a scanner object to read file
        Scanner var_read_file = new Scanner(new FileReader("test_file.txt"));

        /*
         display the contents of test_file

         Note: hasNext() method checks if a file has a next word or not (returns a boolean)
         hasNextLine() methods checks if a file has a next line
         End of File (EOF)--> is an invisible character that determines the end of a file
         The above methods are used when one does not know in advance the number of lines in a file
         */


        String var_file_content = "The file to be read from is empty!";    // default value initialization
        
        /*
        if (var_read_file.hasNext()) // check if test_file.md has next word 
        {
            var_file_content = var_read_file.next();
            System.out.println(var_file_content); 
        }
        */

        // display the contents of a file using a loop.
        //
        while (var_read_file.hasNextLine()) 
        {
            var_file_content = var_read_file.nextLine();
        System.out.println(var_file_content);
        }

        var_read_file.close(); // stop reading from the file
    }
}
