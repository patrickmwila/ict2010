/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 23/06/2021
 * Description: A program that reads data from a file
 */
import java.util.Scanner;   // import the Scanner class
import java.io.File;        // import the File class

import java.io.IOException;         // import the IOException class
import java.io.FileNotFoundException;

public class FileInput
{
    public static void main(String[] args) throws IOException
    {
        // create a Scanner object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // prompt the user to enter filename
        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();

        File file = new File(filename);
        try
        {
            Scanner fileInput = new Scanner(file);
            while (fileInput.hasNextLine())
            {
                //System.out.println(fileInput.nextLine());

                String readFile = fileInput.nextLine();
                int length = readFile.length();
                int num_index = length - 12;

                System.out.println(readFile.substring(0, 1) + 
                                   readFile.substring(num_index, length));
            }
        }
            catch (FileNotFoundException EXCEPTION)
            {
                System.out.println("File was not found");
            }

    }
}
