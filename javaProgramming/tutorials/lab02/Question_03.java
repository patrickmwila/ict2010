/**
 * Author        : 2019037459
 * Instructor    : Vernon M. Simwinga (BIT)
 * Date          : 06-08-2021
 * Description   : 
 */
import java.util.Scanner;

public class Question_03
{
    public static void main(String[] args)
    {
        // create a Scanner object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // declare variables and initialize them with default values
        int num_of_tests = 0,
            test_01 = 0,
            test_02 = 0,
            test_03 = 0;

       double average_score = 0.0;

        // prompt for user input
        System.out.print("Please enter the number of tests written: ");
        num_of_tests = keyboard.nextInt();

        if (num_of_tests == 2)
        {
            System.out.print("Please enter a mark for test 1: ");
            test_01 = keyboard.nextInt();

            System.out.print("Please enter a mark for test 2: ");
            test_02 = keyboard.nextInt();

            average_score = (test_01 + test_02) / 2;
            System.out.printf("Your average is %.2f\n", average_score);
        }

        else if(num_of_tests == 3)
        {
            System.out.print("Please enter a mark for test 1: ");
            test_01 = keyboard.nextInt();

            System.out.print("Please enter a mark for test 2: ");
            test_02 = keyboard.nextInt();

            System.out.print("Please enter a mark for test 2: ");
            test_03 = keyboard.nextInt();

            average_score = (test_01 + test_02 + test_03) / 3; 
            System.out.printf("Your average is %.2f\n", average_score);
        }

        else 
        {
            System.out.println("Sorry, an error was \nencountered goodbye");
        }
    }
}
