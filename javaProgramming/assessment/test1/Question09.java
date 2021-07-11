/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: A program that displays a string sperated with spaces and in 
 *              reverse order.
 */
import java.util.Scanner;

public class Question09
{
    public static void main(String[] args)
    {
        // create a Scanner object to read input from the keybaord as it's source
        Scanner keyboard = new Scanner(System.in);

        // prompt for string input
        System.out.print("Enter a word: ");
        String var_input = keyboard.next();

        // get the length of var_input
        int var_max = var_input.length();

        // loop through the string starting at index 0 up to var_max
        for (int index = 0; index < var_max; index++)
        {
            // display character at index position "index" and then a space
            System.out.print(var_input.charAt(index) + " ");
        }

        // loop through the string starting at index var_max decrementing until 0
        for (int index = var_max - 1; index >= 0; index--)
        {
            // display character of var_input starting at the last index position
            System.out.print(var_input.charAt(index) + " ");
        }

        System.out.println(); // display a blank line
        keyboard.close(); // close the Scanner object
    }
}
