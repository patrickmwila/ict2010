/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: A program that reads data from an external file
 */
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class FileInput
{
    public static void main(String[] args) throws IOException
    {
        FileReader var_file = new FileReader("names.txt");  // open file names.txt
        Scanner var_input_file = new Scanner(var_file);     // create a Scanner object to read from var_file

        int var_count = 0, // used to count line number
            var_max   = 0; // used to hold the length of string

        // display the contents of var_file
        while (var_input_file.hasNext())
        {
            String var_str = var_input_file.nextLine();
            System.out.println(var_str);

            var_max += var_str.length();
            var_count += 1;
        }

        System.out.println("Number of lines      = " + var_count);
        System.out.println("Number of characters = " + var_max);

        var_input_file.close();  // stop reading from var_input_file
        var_file.close();        // close var_file
    }
}
