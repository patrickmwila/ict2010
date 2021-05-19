/**
 * Author     : 2019037459
 * Date       : 15/05/2021
 * Description: Solutions to questions provided in ThinkJava2 concerning
 *              decision structures.
 */
import java.util.Scanner;

public class ThinkJava
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in); // create a scanner object

        //Exercise 1 solution
        System.out.print("Enter a number: ");
        byte x = keyboard.nextByte();

        if (x > 0 && x < 10)
        {
            System.out.println("positive single digit number.");
        }
        else
        {
            System.out.println("Out of range!");
        }
    }
}
