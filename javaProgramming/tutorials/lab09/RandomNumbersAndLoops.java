/**
 * Author     : 2019037459
 * Date       : 15-11-2021
 * Description: lab09 question 1
 */
import java.util.Random;

public class RandomNumbersAndLoops
{
    public static void main(String[] args)
    {
        // create a Random object
        Random rand = new Random();

        // create an array of size 5
        int[] randomNums = new int[5];


        // use a loop to store numbers in randomNums[]
        for (int i = 0; i < 5; i++)
        {
            randomNums[i] = rand.nextInt(21) + 10;

            // display the generated random number
            System.out.print(randomNums[i] + " ");
        }

        int largest = randomNums[0];

        for (int k = 0; k < randomNums.length; k++)
        {
            largest = Math.max(randomNums[k], largest);
        }

        System.out.println("\nLargest from the above is " + largest);
    }
}
