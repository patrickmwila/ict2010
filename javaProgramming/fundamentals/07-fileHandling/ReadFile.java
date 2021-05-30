/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 29/05/2021
 * Description: Understanding file handling in java.
 *
 *              PrintWriter class: used to create an object which can be used to
 *              write to an external file.
 *              package: java.io.PrintWriter; alternative you can import java.io.*;
 */
import java.io.PrintWriter; // import the PrintWriter class
import java.io.IOException; // import the IOException class 

public class ReadFile
{
    public static void main(String [] args) throws IOException
    {
        // declare and initialize a PrintWriter object
        PrintWriter var_fileWriter = new PrintWriter("Output.md");

        var_fileWriter.println("# Welcome to Kali Linux! \nThe Industry's Most" + 
                               " Advanced Penetration Testing Distribution");

        var_fileWriter.close(); // close var_fileWriter 
    }
}
