/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: A program that prints even numbers from n (variable) down to 1
 *              with a comma between each number (using the same loop)
 */
import java.util.Scanner; // import the Scanner class

public class Question14
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); // create a scanner object to read input from the keyboard

        System.out.print("Enter an integer: ");
        int var_input = keyboard.nextInt();

        for (int count = var_input; count >= 2; count--)
        {
            if (count % 2 == 0)
            {
                if (count == 2)
                {
                    System.out.print(count);
                }
                else 
                {
                    System.out.print(count + ",");
                }
            }
        }
        System.out.println();
    }
}
