/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: A program that uses a for loop to find the sum of all old 
 *              numbers betweenn 1 and n.
 *
 *              Pseudocode:
 *              SET var_status = 1;
 *              do{
 *                  DISPLAY "OLD NUM CALCULATOR"
 *                  PROMPT "Enter an integer, (0 to exit)"
 *                  GET var_int
 *                 
 *                  SET var_old_sum = 0; 
 *                  IF (var_int <= 0 && var_int > 0)
 *                  {
 *                      FOR(int var_count = 1; var_count <= var_int; var_count++)
 *                          IF (var_count / 2 != 0)
 *                              var_old_sum += var_count
 *
 *                      DISPLAY "The sum of old numbers between 1 and var_int is: 
 *                      var_old_sum"
 *                  }
 *                  ELSE IF (var_int == 0)
 *                  {
 *                      SET var_status = var_int
 *                  }
 *                  ELSE 
 *                  {
 *                      DISPLAY "Invalid input"
 *                  }
 *              } WHILE (var_status != 0)
 */

import java.util.Scanner;

public class ForLoop
{
    public static void main(String [] arg)
    {
        Scanner keyboard = new Scanner(System.in); // create a scanner object 
        System.out.println("========= OLD NUMBER CALCULATOR ========="); // display purpose of program

        byte var_status = 1; // declare status flag and set it to 1--> controls the while loop
        do {

            System.out.print("Enter a positive integer, (0 to exit): "); // pompt user to enter number
            int var_int = keyboard.nextInt(); // get the input

            int var_sum = 0; // set var_sum = 0 --> will hold the sum of old nums

            if (var_int != 0 && var_int > 0)
            {
                for (int var_count = 1; var_count <= var_int; var_count += 2) // create a loop 
                {
                        var_sum = var_sum + var_count;
                }

                System.out.printf("\nSum of old numbers from 1 - %d is: %d\n",
                        var_int, var_sum);
            }
            else if (var_int == 0)
            {
                var_status = (byte)var_int;
            }
            else 
            {
                System.out.println("Invalid input!");
            }

        } while (var_status != 0);
    }
}
