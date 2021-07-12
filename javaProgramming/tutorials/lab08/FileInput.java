/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: A program that reads data from an external file
 */
import java.io.PrintWriter;
import java.io.IOException;

public class FileInput
{
    public static void main(String[] args) throws IOException
    {
        String[][] var_officials = { {"Chief Executive Officer", "1963-03-02"},
                                     {"Full-time Engineer",      "1965-09-01"},
                                     {"Engineering Manager",     "1968-12-13"},
                                     {"Senior Tool Designer",    "1969-01-23"}
                                   };

        // create a PrintWriter object to write to an external file
        PrintWriter var_output_file = new PrintWriter("Executives.txt");

        // loop through var_officials and store its contents in a text file
        int var_start = var_officials.length - 1; 
        for (int row = var_start; row >= 0; row--)
        {
            for (int col = 0; col < var_officials[row].length; col++)
            {
                var_output_file.print(var_officials[row][col] + "\t");
            }
            // display a blank line after each row
            var_output_file.println();
        }

        // clase the output file
        var_output_file.close();
    }
}
