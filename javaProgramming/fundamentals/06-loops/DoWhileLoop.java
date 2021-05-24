/**
 * Author     : 2019037459
 * Instructor : Phelya Mbewe
 * Date       : 24/05/2021
 * Description: A program that uses a do while loop to print the laters of the
 *              alphabet (A to Z):
 *
 *              A do while loop executes the loop body atleast once and then checks
 *              the condition, if the it(condition) evaluates to true, the 
 *              the execution moves back into the loop body.
 *
 *              Pseudocode:
 *              SET var_char = 65
 *              do {
 *                  DISPLAY var_char;
 *              } (var_char <= 91);
 */

// import java.util.Scanner;

public class DoWhileLoop
{
    public static void main(String [] args)
    {
        char var_char = 65; // declare and set var_char to 65

        do {
            System.out.printf("%s ", var_char); // DISPLAY value of var_char

            var_char++; // increment var_char by 1

        } while (var_char <= 90); // check if we have not execeeded char Z

        System.out.println(); // display a blank line

    } //end of method main
} // end of class DoWhileLoop
