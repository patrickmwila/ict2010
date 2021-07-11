// import class needed for handling IOExceptions
import java.io.IOException;       // import the IOException

// import classes needed for input, file writing and reading.
import javax.swing.JOptionPane;   // import the JOptionPane class
import java.io.PrintWriter;       // import the PrintWriter class used to write to a file
import java.io.FileWriter;        // import the FileWriter class
import java.io.FileReader;        // import the FileReader class
import java.util.Scanner;         // import the Scanner class

public class Env 
{
    public static void main(String[] args) //throws IOException
    {
        String var_input,
               var_error = "An error occured!";

        // prompt the user for input
        var_input = JOptionPane.showInputDialog("Enter file name to be written to");

        // create an instance of the PrintWriter and FileWriter class
        try
        {
            // 'true' -- > allows us to append data to a file
            // 'false' --> overites the false
            FileWriter var_fwriter = new FileWriter(var_input, false); 
            PrintWriter var_output_file = new PrintWriter(var_fwriter);

            // write data to var_file_name
            var_output_file.println("BandaR  51231");
            var_output_file.println("SmithK  14587");
            var_output_file.println("MuluweJ 28714");
            var_output_file.println("PetersM 5781");
            
            var_output_file.close(); // stop writing to var_fwriter
            var_fwriter.close();     // close the var_fwriter

        } 
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, var_error, "EnvApp", 
                        JOptionPane.ERROR_MESSAGE);
        }

        finally
        {
            String var_str = String.format("Successfully written to %s", var_input);
            JOptionPane.showMessageDialog(null, var_str, "EnvApp", 
                        JOptionPane.INFORMATION_MESSAGE);
        }

        // prompt the user to enter filename to be read from
        var_input = JOptionPane.showInputDialog("Enter file name to be read from");

        // create a FileReader and Scanner instances
        try
        {
            FileReader var_file = new FileReader (var_input); // holds the filename
            
            Scanner var_input_file = new Scanner(var_file);  // reads from var_file

            // loop as long as var_input_file has lines
            while (var_input_file.hasNext())
            {
                System.out.println(var_input_file.nextLine());
            }


            //var_file.close();       // close the var_file
            var_input_file.close(); // stop reading from var_file
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, var_error, "EnvApp",
                        JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
           String var_str = String.format("Successfully read from %s", var_input);
           JOptionPane.showMessageDialog(null, var_str, "EnvApp",
                       JOptionPane.INFORMATION_MESSAGE); 
        }
    }
}