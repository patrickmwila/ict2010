/**
 * Author      : 2019037459
 * Instructor  : Phyela Mbewe
 * Date        : 14/05/2021
 * Description : A program that gets input from the user using the Scanner 
 *               class.
 *
 *               To use the Scanner class we write an import statement at the 
 *               beginning of our program.
 *
 *               Syntax: import java.package.className;
 */
 
import java.util.Scanner;  // import the Scanner class 

public class UserInput
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in); // declare and initialise a
                                                   // Scanner object

        // Most methods associated with the Scanner class:
        // nextInt(), nextDouble(), [ nextLine() & next(),-> both read Strings]
        // key differece: next() reads in one word 
        //                nextLine() reads in more than one word.

        // Examples of using methods of the Scanner class through it's object

        System.out.print("Enter your firstname: ");
        String userFirstName = keyboard.next();
        
        keyboard.nextLine(); // clean the keyboards buffer in memory 
        // review page 298 - 301 of startingOutWithJava by Tonny G. 7/edition 

        System.out.printf("Enter your fullname: ");
        String userFullName = keyboard.nextLine();

        System.out.printf("%s, welcome!\n", userFullName);
        System.out.printf("Allow me to be calling you %s\n", userFirstName);

        System.out.print("Enter your age: ");
        byte userAge = keyboard.nextByte();

        System.out.printf("You are %d years old.", userAge);
        System.out.printf("\nNext year you will be %d years old.\n", ++userAge); 

        // note userAge++ will note work as userAge will be printed before 
        // being incremented.
    }
}
