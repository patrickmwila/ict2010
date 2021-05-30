/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 29/05/2021
 * Description: A program that asks a user for a +ve Z (n), and then displays
 *              every number from 1 to n. This continues until the user enters
 *              -1
 */
import java.util.Scanner; // import the scanner class

public class Example1
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        byte statusCode = 0;

        do
        {
            System.out.print("\nEnter a positve integer (enter -1 to quit): ");
            int num = keyboard.nextInt();
            
            if (num != statusCode && num > 0)
            {
                for (int count = 1; count <= num; count++)
                {
                    System.out.print(count + " ");
                }
            }

            else if (num == -1)
            {
                statusCode = (byte)num;
            }

            else 
            {
                System.out.println("\nIvalid Input. Not a positive integer!");
            }

        } while(statusCode != -1);

        System.out.println("Goodbye");
    }
}
