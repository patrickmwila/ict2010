/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: A program that reads a file and displays it's content based on
 *              a certain condition.
 */
import java.util.Scanner;   // will be used to read from file
import java.io.FileReader;  // will be used to open the file to be read from
import java.io.IOException;

public class Question12
{
    public static void main(String[] args) throws IOException
    {
        // create an instance of FileReader and Scanner class
        FileReader var_file = new FileReader("names.txt");  // open names.txt
        Scanner var_input_file = new Scanner(var_file);           // read from var_file

        // declare necessary variables
        String var_name = null;
        int var_id = 0;

        // create a loop that enables us to display contents of names.txt
        while (var_input_file.hasNext())
        {
            var_name = var_input_file.next();
            var_id = var_input_file.nextInt();

            if (var_id < 20100)
            {
                System.out.println(var_name + "\t" + var_id);
            }
        }
        
        var_file.close();       // close var_filem
        var_input_file.close(); // stop reading from var_file
    }
}
