/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 23/06/2021
 * Description: A program that writes data to a file
 */

import java.io.FileWriter;  // used to create a FileWriter object 
import java.io.PrintWriter; // used to create a PrintWriter object

import java.io.IOException;

public class FileOutput
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter output_file = new PrintWriter("employees.txt"); // create  a PrintWriter object to open employees.txt file and prepares to write to it

        String[][] employees = { {"Chief Executive Officer", "1963-03-02"},
                                 {"Full-time Engineer",      "1965-09-01"},
                                 {"Engineering Manager",     "1968-12-13"},
                                 {"Senior Tool Designer",    "1969-01-23"}
                               };

        int var_max = employees.length; // declare variable max and initialize it with length of employees(1D arrays present)

        for (int row = var_max - 1; row >= 0; row--)              // create a row loop starting from (max length - 1) to 0
        {
            for (int col = 0; col < employees[row].length; col++) // create a col loop to iterate from 0 to length of each 1D array
            {
                output_file.print(employees[row][col] + "\t\t") ; // user the PrintWriter object to write employees.txt
            }
            output_file.println();                                // write a blank line to the file after each row

            System.out.println();                                 // display a blank line after col iteration
        }
        output_file.close(); // close employees.txt
    }
}
