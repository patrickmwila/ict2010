/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 15/05/2021
 * Description: A program that demonstrates how to implement decision
 *              Structures in java using Nested if statement.
 */
import java.util.Scanner; // import the Scanner class

public class NestedIfStatement
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in); // create a Scanner object
        
        System.out.print("Enter your final test score: "); //prompt for input
        float finalScore = keyboard.nextFloat(); // read the input and store it

        System.out.print("Enter the number of attemps you took: ");
        byte attemps = keyboard.nextByte();

        if(finalScore >= 50)
        {
            if (attemps == 1)
            {
                System.out.printf("Excellent performance!");
            
            }
            else
            {
                System.out.print("Pass");
            }
        }
        else 
        {
            System.out.printf("Fail");
        }

        System.out.printf(" Bye\n");

    }
}
