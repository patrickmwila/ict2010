/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 03/06/2021
 * Description: understanding ArrayIndexOutOfBoundsException
 *             Occurs when trying to use an index number greater than the number
 *             of elements in an array.
 */

public class Exception04
{
    public static void main(String [] args)
    {
        // make an array with 5 elements
        int[] var_numbers = new int[5];

        try
        {
            // changing the element above index 4 will throw an exception
            var_numbers[5] = 45;
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            var_numbers[4] = 45;
            System.out.println(var_numbers[4]);
        }

        // Note: java arrays have a fixed length, this exception can be avoided
        // by the developer keeping track of the array's index values and usually
        // does not have to be checked using try and catch statements.
    }
}
