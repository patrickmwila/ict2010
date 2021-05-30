/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 29/05/2021
 * Description: A program that demonstrates how to implement a nested while
 *              loop in java.
 */

public class NestedWhileLoop
{
    public static void main(String [] args)
    {
        // display a 10 by 10 matrix
        int i = 0,
            j = 0;

        while(i <= 10)
        {
            while(j <= 10)                  // row loop
            {
                System.out.print(j + " ");  // display 0 - 10 on one line
                j++;                        // increment j by 1
            }
            System.out.println();           // display a black line
            j = 0;                          // reset the value of j

            i++;                            // increment the value of i
        }
    }
}
