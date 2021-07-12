
/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: A program that reads data from an external file
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputOutput
{
    public static void main(String[] args) throws IOException
    {
        // create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // prompt for input
        System.out.print("Enter name of file: ");
        String var_input = keyboard.nextLine();

        try
        {
            // open the file for reading
            FileReader var_file = new FileReader(var_input);
            Scanner var_input_file = new Scanner(var_file);

            while (var_input_file.hasNext())
            {
                String var_str = var_input_file.nextLine();
                int var_int = var_input_file.nextInt();
                
                int i = var_str.length() - 11, // get the index which which numbers start
                    j = var_str.length() - 1;  // get the last index position 

                System.out.println(var_str.substring(0,1) + var_str.substring(i,j));
                System.out.println(var_int);
           
            }

            // clase and stop reading from the file
            var_file.close(); 
            var_input_file.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File was not found");
        }
    }
}

