/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 29/05/2021
 * Description: A program that displays an MxM matrix of 1s and 0s based on
 *              user input
 */

import java.util.Scanner;

public class MxMmatrix
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("========== (MxM) Matrix Calculator ==========\n");

        int user_num; // declare user_num 
        do
        {
            System.out.print("Enter an old number (enter 0 to quit): "); // prompt the user for input
            user_num = keyboard.nextInt();

            if (user_num != 0)
            {
                int row = 1;
                while (row < user_num)
                {
                    for(int col = 1; col < user_num; col++)
                    {
                        if (col == 1)
                        {
                            System.out.print(1); // disp
                        }
                
                        else if (row == col)
                        {
                            System.out.print(1);
                        }
                        else if (col == (user_num - 1))
                        {
                            System.out.print(1);
                        }
                        else 
                        {
                            System.out.print(0);
                        }
                    } // end of loop col

                    System.out.println(); // display a blank line
                    row ++; // increment the value of row

                } // end of loop row
            } // end of major decision block

            else
            {
                continue;
            }

        } while(user_num != 0); // end of do while loop

        System.out.println("\nGoodbye!");

    }// end of method main
} // end of class MxMmatrix
