/**
 * Author     : 2019037459
 * Date       : 15-11-2021
 * Description: lab09 question 1
 */
/**
 * Author     : 2019037459
 * Date       : 15-11-2021
 * Description: lab11 question 1
 */

import java.util.Scanner;

public class MathFunctionsAndKeyboardInput
{
    public static void main(String[] args)
    {
        // create a Scanner instance
        Scanner keyboard = new Scanner(System.in);

        // display info
        System.out.println("\nQuadratic Equation Calculator");

        System.out.print("\nEnter the value of a: ");
        double a = keyboard.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = keyboard.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = keyboard.nextDouble();

        // calculate the discriminant
        double bb = Math.pow(b, 2);
        double fourAc = -4 * a * c;

        // let d = discriminant
        double d = bb - fourAc;
        
        // calculate x1 and x2
        double x1, x2;

        if(d > 0 )
        {
            x1 = ( ((-1.0) * b) + ( Math.sqrt(d)) ) / (2.0 * a);
            x2 = ( ((-1.0) * b) - ( Math.sqrt(d)) ) / (2.0 * a);

            System.out.println(
                "\nX1 = " + x1 + 
                "\nX2 = " + x2
            );
        }
        else if (d == 0)
        {
            x1 = x2 = ( (-1.0) * b ) / (2.0 * a);

            System.out.println(
                "\nX1 = " + x1 + 
                "\nX2 = " + x2
            );
        }
        else 
        {
            double radicand = -1 * (fourAc = -4 * a * c);

            double realPart =  ( (-1.0) * b ) / (2.0 * a);
            double imaginary = radicand / (2.0 * a);

            System.out.println(
                "\nX1 = " + realPart + " + " + imaginary + "i" +
                "\nX2 = " + realPart + " - " + imaginary + "i" 
            );
        }
        
    }
}
