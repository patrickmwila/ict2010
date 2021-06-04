/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 03/06/2021
 * Description: A try code block can be associated to multiple catch code blocks
 *              to check for various exceptions.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.IllegalFormatConversionException;

public class Exception03 
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int var_dividend,
            var_divisor = 0;

        System.out.println("========== Division Calculator ==========");
        
        while(var_divisor == 0)
        {
            try
            {
                System.out.print("\nEnter the dividend: ");
                var_dividend = keyboard.nextInt();

                System.out.print("Enter the divisor: ");
                var_divisor = keyboard.nextInt();

                int var_quotient = var_dividend / var_divisor; // look out for the zero division
                try
                {
                    System.out.printf("\n%d/%d = %d", var_dividend, var_divisor, var_quotient);
                }
                catch(IllegalFormatConversionException ex3)
                {
                    System.out.println("There was an error displayling the result! check the source code.");
                    break;
                }
            }
            
            catch(InputMismatchException ex)
            {
                System.out.println("Invalid input! not an number.");
                break;
            }
            
            catch(ArithmeticException ex2)
            {
                System.out.println("divisor can not be zero!");
            }

            // finally keyword associated to try and catch is optional
            // the finally code block will execute everytime regardless of any
            // exceptions found or not
            // its usage depends on the developer

            finally
            {
                if (var_divisor != 0)
                {
                    System.out.println("\nGoodbye!");
                }
                else
                {
                    continue;
                }
            }
        }

        keyboard.nextLine(); // clean the keyboards buffer
    }
        
}
