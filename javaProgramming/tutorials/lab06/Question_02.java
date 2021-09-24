/**
 * Author        : 2019037459
 * Instructor    : Vernon M. Simwinga (BIT)
 * Date          : 22-09-2021
 * Description   : Exploring the Math class 
 */
import java.util.Scanner;

public class Question_02
{
    public static void main(String[] args)
    {
        // a Scanner object for getting input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // variable declarations
        double a, b;

        System.out.print("\nEnter first number: ");
        a = keyboard.nextDouble();

        System.out.print("Enter second number: ");
        b = keyboard.nextDouble();

        // display the results
        System.out.printf(
            "\nThe minimun between %.1f and %.1f = %.1f" +
            "\nThe distance between %.1f and %.1f = %.1f units" +
            "\nThe exponent value of %.1f to the power of %.1f ≈ %.3f\n",

            a, b, Math.min(a, b), a, b, Math.abs(a-b), a, b, Math.pow(a, b)
        );
    }
}
