
/**
 * Author        : 2019037459
 * Instructor    : Vernon M. Simwinga (BIT)
 * Date          : 21-08-2021
 * Description   : A program that simulates a simple calculator
 */
import java.util.Scanner;

public class Question_01
{
    public static void main(String[] args)
    {
        // create a Scanner object for getting input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // declare and initialize variables to be used
        double num1 = 0.0;
        double num2 = 0.0;
        String operator = null;

        // prompt the user for input
        System.out.print("\nPlease enter number 1: ");
        num1 = keyboard.nextDouble();

        System.out.print("Please enter number 2: ");
        num2 = keyboard.nextDouble();

        System.out.print(
            "\nPlease enter the operator" + 
            "\n(+, -, /, or *): "
        );
        operator = keyboard.next();

        // implement a Switch statement to carry out a specific operation
        switch(operator)
        {
            case "+":
                System.out.printf(
                        "\n%.1f + %.1f = " + (num1 + num2), num1, num2
                );
                break;

            case "-":
                System.out.printf(
                        "\n%.1f - %.1f = " + (num1 - num2), num1, num2
                );
                break;

            case "/":
                System.out.printf(
                        "\n%.1f / %.1f = " + (num1 / num2), num1, num2
                );
                break;

            case "*":
                System.out.printf(
                        "\n%.1f * %.1f = " + (num1 * num2), num1, num2
                );
                break;

            default:
                System.out.println("\nInvalid operator detected!");
                System.exit(-1);
        }

        // display a blank line for readability
        System.out.println();
    }
}
