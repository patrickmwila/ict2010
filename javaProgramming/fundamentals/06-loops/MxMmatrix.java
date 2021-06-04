/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 29/05/2021
 * Description: A program that displays an MxM matrix of 1s and 0s based on
 *              user input
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class MxMmatrix
{
    public static void main(String [] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("========== (MxM) Matrix Calculator ==========\n");
        int user_num = 0;
        boolean var_quit_flag = true;
        
        while (var_quit_flag)
        {
        
            while (true) 
            {
            
                System.out.print("Enter an old number (enter 0 to quit): "); // prompt the user for input
                
                try
                    {
                    
                        user_num = keyboard.nextInt();
                    }

                catch (InputMismatchException ex)
                    {
                        System.out.println("Invalid Input! NOT A NUMBER");
                        continue;
                    }
            }

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

            else if (user_num == 0)
            {
                var_quit_flag = false;
            }
        }
        
        System.out.println("Goodbye!");

    }// end of method main
} // end of class MxMmatrix
