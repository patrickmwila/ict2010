/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 04/06/2021
 * Description: Create a string array that will store 5 student ID numbers
 *              Assign 5 student ID values into the array elements from user
 *              input using a Scanner class
 *              Use a while or for loop to display only the first three 
 *              student ID values from the arrays.
 */
import java.util.Scanner;

public class Exercise01
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); // create a Scanner object

        String[] var_student_ids =  new String[5]; // Declare a String[] to store 5 elements

        int var_index = 0;
        while(var_index < var_student_ids.length)
        {
            System.out.printf("Enter student ID %d: ", var_index + 1);
            String var_user_input = keyboard.nextLine();

            var_student_ids[var_index] = var_user_input;

            var_index++;
        }

        System.out.println("\nThe first 3 student ID's are: ");
        for(int var_count = 0; var_count < 3; var_count++)
        {
            System.out.println(var_student_ids[var_count]);
        }
    }
}
