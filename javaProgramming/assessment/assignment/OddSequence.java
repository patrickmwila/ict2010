/**
 * Authors     : Mwila Patrick - 2019037459
 *             : Banda Esther  - 2019002922
 * Instructor  : Phyela Mbewe
 * Due Date    : 08-10-2021
 * Description : A program that displays all the odd numbers from 1 up to a 
 *               user-entered integer value in a specific format.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class OddSequence
{
    public static void main(String[] args)
    {
        // create a Scanner object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.println(
            "Please enter your number"
        );

        int userNum = 0;

        try
        {
            userNum = keyboard.nextInt();
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Invalid input!");
            System.exit(0);
        }

        do
        {
            // use a loop to get total value of old numbers from 1 up to userNum
            int totalOldNums = 0;
            for (int num = 1; num <= userNum; num++)
            {
                if ( (double)num % 2.0 != 0.0 ) 
                {
                    totalOldNums++;
                }
            }

            // create an integer array of length totalOldNums
            int oldNums[] = new int[totalOldNums];

            // use a loop to store old numbers in oldNums array
            int index = 0;
            for (int num = 1; num <= userNum; num++)
            {
                if ( (double)num % 2.0 != 0.0 ) 
                {
                    {
                        oldNums[index] = num;
                        index++;
                    }
                }
            }

            /*
               use a loop to display all the old numbers stored in oldNums array 
               in a specific format.
               Notation: i --> index and col --> column
             */
            int sumOfOldNums = 0;         // accumulator to hold sum of old numbers
            for (int i = 0, col = 0; i < oldNums.length; i++, col++)
            {
                // the first outer if block ensures that numbers in the last
                // row are displayed without a 'full stop' if col != 10
                if (col == 10)
                {
                    if (i == oldNums.length - 1)
                    {
                        System.out.print(oldNums[i]);
                    }

                    else
                    {
                        System.out.print(
                            oldNums[i] + ", "
                        );
                        col = 0;
                    }

                } 

                // the corresponding outer else block ensures that numbers in 
                // all rows are displayed with a 'full stop' if col == 10
                else 
                {
                    // if col == 10, display number at cursors last position and 
                    // move to the next line
                    if (col == 9)
                    {
                        System.out.print(
                            oldNums[i] + ".\n"
                        );
                    }

                    // make sure that the last number displayed does not hava a ","
                    else if (i == (oldNums.length - 1))
                    {
                        System.out.print(
                            oldNums[i] 
                        );
                    }

                    // as long as col != 10, every number displayed
                    // should end with a comma and a space
                    else
                    {
                        System.out.print(
                            oldNums[i] + ", "
                        );
                    }
                }

                // calculate the sum of old numbers
                sumOfOldNums += oldNums[i];

            } // end of for loop displaying old numbers

            // display the sum of old numbers
            System.out.println(
                "\n\nThe sum of the above numbers is " + sumOfOldNums
            );

            // prompt the user to run the program again
            System.out.println(
                "\nPlease enter your number (or 0 to quit)" 
            );

            try
            {
                userNum = keyboard.nextInt();
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Invalid input!");
                System.exit(0);
            }
      
        }while (userNum != 0);

    } // end of method main
}
