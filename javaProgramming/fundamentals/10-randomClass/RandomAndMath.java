/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 10-09-2021
 * Description: How to work with the Random and Math Class in Java
 */
import java.util.Random;

public class RandomAndMath
{
    public static void main(String[] args)
    {
        // create a Random object for generating random numbers
        Random rand = new Random();
        
        // use the nextInt() to return numbers between 0(inclusive) and a 
        // specified number (exclusive)

        System.out.println(
            "Random numbers in the range of 0 (included) to 10 (not included)\n"
        );
        for (int counter = 0; counter < 10; counter++)
        {
            int number = rand.nextInt(10);
            System.out.println("Random number = " + number);
        }


        // for random numbers higer than the range 0 to n - 1
        // e.g random numbers between 20 and 30
        // add an integer to the random value this will indicate the new start
        // of the random range.

        System.out.println(
            "\nRandom numbers in the range of 20 to 30 (inclusive)"
        );
        for (int counter = 0; counter < 10; counter++)
        {
            int number = rand.nextInt(11) + 20;
            System.out.println("Random number = " + number);
        }

        System.out.println(
            "\nExploring the Math class in Java"
        );
        System.out.println("Absolute value of -101 = " + Math.abs(-101));
        System.out.println("Square root of 81 = " + Math.sqrt(81));
        System.out.println("Random double value between 0.0 (inclusive) and 1.0 (exclusive) = " + Math.random());
        System.out.println("Arc cosine of -1  = " + Math.acos(-1));
        System.out.println("Closed value to π = " + Math.PI);
    }
}
