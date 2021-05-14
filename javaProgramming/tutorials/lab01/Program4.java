/**
 * Author      : 2019037459
 * Instructor  : Phyela Mbewe
 * Date        : 14/05/2021
 * Description : A program which uses string methods to format the output
 *               to be displayed.
 */

public class Program4
{
    public static void main(String [] args)
    {
        // Declare and initialise two string variables
        String fullname = "John Mulenga",
               mall2    = "Levi Shopping Area";

        // Use a String method to display the value of mall2 in all uppercase
        // characters

        System.out.println(mall2.toUpperCase());

        // Use the length method to display the number of characters in the
        // fullname variable

        System.out.println(fullname.length());

        // Use the charAt method to display only the first character from 
        // the fullname variable

        System.out.println(fullname.charAt(0));

        // Using the substring method: display only the text Mulenga from the
        // fullname variable

        System.out.println(fullname.substring(5));

        // Using the substring method: display only the middle text Shopping 
        // from the mall2 variable

        System.out.println(mall2.substring(5, 14));
    }
}
