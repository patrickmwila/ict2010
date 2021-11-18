/**
 * Author     : 2019037459
 * Date       : 15-11-2021
 * Description: lab10 question 2
 */
import java.util.Scanner;

public class CircleTester
{
    public static void main(String[] args)
    {
        // create a Scanner instance
        Scanner keyboard = new Scanner(System.in);

        // prompt for user input
        System.out.println("\nEnter the radius of the circle");
        double radius = keyboard.nextInt();

        // create an instance of the circle class
        Circle circle1 = new Circle(radius);

        // display the area of the circle 
        System.out.printf("It's area is %.2f square meters\n", circle1.area());
    }
}
