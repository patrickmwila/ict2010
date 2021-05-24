/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 23/05/2021
 * Description: Demonstrating how to implement the while loop in java.
 *              A loop is used to execute the same block of code multiple
 *              times based on a given conditional statement.
 *
 *              Syntax: 
 *              While (condition)
 *              {
 *                  // code to be executed
 *                  // while the condition is true;
 *              }
 *              NOTE: While loop check's the condition first, if it evaluates to
 *                    to true then the block of code is executed. This continues
 *                    until the condtion evaluates to false.
 *
 *              // Write a program to print numbers from 1 to 10
 *              Pseudocode:
 *              1. SET var_count = 1
 *              2. WHILE (var_count <= 10)
 *                      DISPLAY var_count
 *                      var_count = var_count + 1;
 */

public class WhileLoop
{
    public static void main(String [] args)
    {
        byte var_count = 1; // declare var_count as byte and set it = 1

        while (var_count <= 10) // check if var_count <= 10
        {
            System.out.println(var_count); // DISPLAY var_count
            var_count++; // Increment var_count by 1
        }

        System.out.println("Blastoff!!");
    }
}
