/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 29/05/2021
 * Description: A program that demonstrates how to implement a nested for loop
 *              in java.
 */

public class NestedForLoop
{
    public static void main(String [] args)
    {
        // display a 10 by 10 matrix
        //
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();           // display a blank line
        }
    }
}
