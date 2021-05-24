/**
 * Author     : 2019037459
 * Instructor : Phyela Mbwewe
 * Date       : 24/05/2021
 * Description: A program that calculates the sum of first 10 natural number.
 *
 *              Pseudocode:
 *              1. SET var_count = 0, var_sum = 0;
 *              2. WHILE (var_count <= 10)
 *                      var_sum += var_count
 *                      var_count = var_count + 1
 *              3. DISPLAY var_sum
 */

public class SumNatural
{
    public static void main(String [] args)
    {
        short var_count = 0, // declare var_count and set it = 0
              var_sum   = 0; // declare var_sum and set it = 0

        while (var_count <= 100)
        {
            var_sum += var_count; // set var_sum = var_sum + var_count
            var_count++; // increment var_count by 1
        }

        // display the sum of the first 10 natural numbers
        System.out.printf("The sum of the first 100 natural numbers is: %d\n",
                var_sum);
    }
}
