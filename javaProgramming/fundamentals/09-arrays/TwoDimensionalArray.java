/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 04/06/2021
 * Description: Creating a two dimensional array in java.
 *              Multidimensional Array stores arrays as it's elements
 *              (Nested Arrays)
 *              1D arrays will be the array elements of a 2D array
 *              All values in a 2D array should be the same data type in 'java'.
 */

public class TwoDimensionalArray
{
    public static void main(String[] args)
    {
        // 1D array
        String[] var_names = {"James", "John"};

        // 2D array
        String[][] var_students = {{"John", "2019037459", "code"}, {"Kim", "2019037455"}}; // declare and initialize a 2D array

        // declare a default 2D array
        int[][] var_matrix = new int[10][10]; //3--> three 1D arrays, 2--> two values withing each 1D array

        System.out.println(var_students.length); // returns 2 as we have 2, 1D arrays
        System.out.println(var_students[0].length); // returns 3 as we have 3 elements in the first 1D arrays

        System.out.println();

        String[][] var_users = {{"Name: Jane", "Age: 20", "Sex: F"},
                                {"Name: Bill", "Age: 19", "Sex: M"}};

        for(int row = 0; row < var_users.length; row++) 
        {
            for(int col = 0; col < var_users[row].length; col++)
            {
                System.out.print("| " + var_users[row][col] + " ");
            }

            System.out.println(); // display a blank line after each row
        }
    }
}
