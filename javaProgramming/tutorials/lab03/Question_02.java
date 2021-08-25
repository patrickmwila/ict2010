/**
 * Author        : 2019037459
 * Instructor    : Vernon M. Simwinga (BIT)
 * Date          : 21-08-2021
 * Description   : A program that implements a simple quiz
 */
import java.util.Scanner;

public class Question_02
{
    public static void main(String[] args)
    {
        // create a Scanner object for getting input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // prompt the user for input 1
        System.out.print("\n(A) What is 2 + 3? ");
        byte answer = keyboard.nextByte();

        // validate user answer
        while (answer != 5)
        {
            System.out.println(
                "Incorrect answer, please try again"
            );

            System.out.print("\n(A) What is 2 + 3? ");
            answer = keyboard.nextByte();
        }
        System.out.println("Correct");

        // prompt the user for input 2
        System.out.print("\n(B) What is 15 / 5? ");
        answer = keyboard.nextByte();

        // validate user answer
        while (answer != 3)
        {
            System.out.println(
                "Incorrect answer, please try again"
            );

            System.out.print("\n(B) What is 15 / 5? ");
            answer = keyboard.nextByte();
        }
        System.out.println("Correct");
    }
}
