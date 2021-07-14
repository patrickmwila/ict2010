/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 29/05/2021
 * Modified   : 14/07/2021
 * Description: A program that displays an MxM matrix of 1s and 0s based on
 *              user input
 */
import java.util.Scanner;

public class MxMmatrix
{
    public static void main(String [] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("========== (MxM) Matrix ==========\n");
            
        System.out.print("Enter an old number: "); // prompt the user for input
        int user_num = keyboard.nextInt();

        int row = 1;
        while (row < user_num)
        {
            for(int col = 1; col < user_num; col++)
           {
               if (col == 1) // display 1's in the first col
               {
                   System.out.print(1); // disp
               }
               else if (row == col) // display a diagonal of 1's
               {
                   System.out.print(1);
               }
               else if (col == (user_num - 1)) // display the 1's in the last col
               {
                   System.out.print(1);
               }
               else 
               {
                   System.out.print(0);
               }

           } // end of loop col
           System.out.println(); // display a blank line after each row
           row ++; // increment the value of row

        } // end of loop row

    }// end of method main
} // end of class MxMmatrix

