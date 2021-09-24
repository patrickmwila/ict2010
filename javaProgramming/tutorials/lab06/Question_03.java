/**
 * Author        : 2019037459
 * Instructor    : Vernon M. Simwinga (BIT)
 * Date          : 22-09-2021
 * Description   : A quadratic equation calculator
 */
import java.util.Scanner;

public class Question_03
{
    public static void main(String[] args)
    {
        // a Scanner object for getting input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // variable declarations
        double a, b, c, root1, root2;

        // prompt for user input
        System.out.println(
            "\nQuadratic Equation Calculator" +
            "\n=============================\n"
        );

        System.out.print("Enter the value of a: ");
        a = keyboard.nextDouble();

        System.out.print("Enter the value of b: ");
        b = keyboard.nextDouble();

        System.out.print("Enter the value of c: ");
        c = keyboard.nextDouble();


        // dis for discriminant
        double dis = (b*b - 4*a*c);

        // check if the discriminant is > 0
        if(dis > 0)
        {
            // two real and distinct roots
            root1 = (-b + Math.sqrt(dis)) / (2 * a);
            root2 = (-b - Math.sqrt(dis)) / (2 * a);

            System.out.printf(
                "\nX1 = %.2f" +  
                "\nX2 = %.2f\n", root1, root2  
            );
        }

        else if (dis == 0)
        {
            //two real and equal roots
            root1 = root2 =  -b / (2 * a);
            System.out.printf("\nX1 = X2 = %.2f\n", root1);
        }

        else
            // if discriminant is < 0
        {
            //two complex and distinct roots
            double real      = -b / (2 * a);
            double imaginary = Math.sqrt(-dis) / (2 * a);

            System.out.printf(
                "\nX1 = %.2f + %.2fi" + 
                "\nX2 = %.2f - %.2fi\n", real, imaginary, real, imaginary
            );
        }

    }
}
