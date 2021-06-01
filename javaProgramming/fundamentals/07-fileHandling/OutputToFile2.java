/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 31/05/2021
 * Description: A program that appends textual data to an existing file.
 *
 */
import java.io.PrintWriter;      // import PrintWriter class
import java.io.IOException;      // import IOException class
import java.io.FileOutputStream; // import FileOutputStream class
import java.io.File;             // import File class

public class OutputToFile2
{
    public static void main(String [] args) throws IOException
    {
        // create a PrintWriter object to append file to text
        PrintWriter var_print_writer = new PrintWriter(
                new FileOutputStream (new File("test_file.md"), true)); // true implies append, fasle implies not to append

        var_print_writer.println("I am appended on this line intentionally.");

        var_print_writer.close();  // stop writing to file 
    }
}

