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

// import the needed classes
//
import java.io.PrintWriter; 
import java.io.IOException; 

public class OutputToFile1
{
    public static void main(String [] args) throws IOException
    {
        // declare and initialize a PrintWriter object
        PrintWriter var_print_writer = new PrintWriter("test_file.md");

        // write to file Output.md
        var_print_writer.println("# Welcome to Kali Linux! \nThe Industry's Most " + 
                                  "Advanced Penetration Testing Distribution.");


        // behavour of methods of the PrintWriter class
        // if the file does not exist, then it will be created.
        
        // if the file does exist, then it's content will be overwritten
        // e.g: the following statement overites the content of Output.md
        // when you comment out line 25 && 26

        var_print_writer.println("Kali linux, has about 600 preinstalled " +
                "penetration-testing programs(tools).");

        var_print_writer.close(); // close var_print_writer 
    } // end of public main
} // end of class ReadFile
