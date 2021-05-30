/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 29/05/2021
 * Description: A program that demonstrates how to implement a nested loops
 *              in java.
 */

public class NestedLoops
{
    public static void main(String [] args)
    {
        // displaying shapes with code
        //
        int row = 1;
        while (row <= 10)
        {
            for (int col = 1; col < 10; col++)
            {
                if (row == 1)
                {
                    System.out.print("*");  // print 9 asterisks on the first line
                }
                else if ( row == col)
                {
                    System.out.print("*");  // print main diagonal asterisks
                }
                else if (row == 10) 
                {
                    System.out.print("*"); // print 9 asterisks on the last line
                }
                else if (row == (10 - col))
                {
                    System.out.print("*"); // print minor diagonal asterisks
                }
                else 
                {
                    System.out.print(" "); // if non of the above are satisfied print a space
                }

            }// end of loop col

            System.out.println();  // move to the next row
            row++; // increment the row by 1

        }// end of loop row

    }// end of method main

}// end of class NestedLoops
