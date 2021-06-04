/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 04/06/2021
 * Description: Arrays in java.
 *              Creating one dimensional arrays.
 *              Two ways of creating an array
 *              1 (Syntax): dataType[] objectName = new dataType[numberOfElements];
 */

public class OneDimensionalArray
{
    public static void main(String[] args)
    {
        // An array to hold 10 values, by default each value will be 0 for INT[] data types
        // null for String[], 0.0 for double[] and float[]
        // Note: elements of an array can be changed later

        int[] var_pins = new int[10];  // declaring an array to hold 10 values

        String[] var_names = {"Patrick", "Wanji", "Shadreck"}; // declare and initialize your array

        byte[] var_nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int index = 0;

        while(index <= var_nums.length)
        {
            if (index == 6) // change 7 to 777
            {
                var_nums[index] = 127;

                System.out.print(var_nums[index] + ", ");
            }
            else
            {
                System.out.print(index + ", ");
            }

            index++;
        }
    }
}


