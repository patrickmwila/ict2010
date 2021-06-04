/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 03/06/2021
 * Description: Arrays in java.
 *              Array is an object which can store multiple values.
 *              In java, values must be of the same data types.
 *              Values are called array elements.
 */

public class Arrays
{
    public static void main(String [] args)
    {
        // An array of names
        String [] var_names = {"Ubuntu", "Arch", "Debian", "BSD"};

        for (int i = 0; i < var_names.length; i++) // loop through the items of an array
        {
            if (i == 2) // if the index of an array is 2, print a unique message 
            {
                System.out.printf("I use a %s based distro\n", var_names[i]);
            }

            else // else just display the element corresponding to the index
            {
                System.out.println(var_names[i]);
            }
        }
    }
}
