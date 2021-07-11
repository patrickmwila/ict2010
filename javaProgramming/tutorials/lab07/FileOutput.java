/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: A program that writes data to an external file
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileOutput
{
    public static void main(String[] args) throws IOException
    {
        FileWriter var_fwriter = new FileWriter("names.txt", false); // open/create names.txt with itent to overwrite it
        PrintWriter var_output_file = new PrintWriter(var_fwriter);

        // write data to names.txt
        var_output_file.println("John  \t Mulenga \t 201501212");
        var_output_file.println("Janet \t Sikala  \t 201503585");
        var_output_file.println("Ken   \t Musonda \t 201500410");

        var_output_file.close();    // stop writing to file
        var_fwriter.close();        // close var_fwriter
    }
}
