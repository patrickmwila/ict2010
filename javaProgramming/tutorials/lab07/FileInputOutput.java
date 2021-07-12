/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: A program that reads data from an external file and writes to
 *              an external file
 */
import java.io.FileReader;
import java.util.Scanner;

import java.io.PrintWriter;
//import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput
{
    public static void main(String[] args) throws IOException
    {
        // create a Scanner object to get input from keyboard
        Scanner keyboard = new Scanner(System.in);

        // prompt for input
        System.out.print("Enter filename: ");
        String var_input = keyboard.nextLine();

        FileReader var_file = new FileReader(var_input);    // open file names.txt
        Scanner var_input_file = new Scanner(var_file);     // create a Scanner object to read from var_file

        // create a PrintWriter object to write to external file
        PrintWriter var_output_file = new PrintWriter("names2.txt");

        // display the contents of var_file
        String var_str;
        while (var_input_file.hasNext())
        {
            var_str = var_input_file.nextLine();               // read line of var_file
            var_output_file.println(var_str.toUpperCase());    // write var_str to var_output_file
        }


        var_input_file.close();  // stop reading from var_input_file
        var_file.close();        // close var_file
        
        var_output_file.close(); // stop writing to var_output_file
    }
}
