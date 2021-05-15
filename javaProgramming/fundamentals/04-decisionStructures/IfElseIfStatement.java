/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 15/05/2021
 * Description: A program that demonstrates how to implement decision
 *              Structures in java using if else if statement.
 *              An enhanced if statement which allows excuting one code-block
 *              out of multiple choices.
 */
import java.util.Scanner; // import Scanner class

public class IfElseIfStatement
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in); // create a scanner object

        System.out.print("Enter your name: "); // prompt the user for name input
        String userName = keyboard.nextLine(); // get user input and store it

        // welcome the user and display purpose of the program.
        System.out.printf("%s, welcome!\n", userName);
        System.out.println("This application takes in a month number and \n"+
                           "display's the corresponding name of the month.");

        System.out.print("Enter a number: ");
        byte num = keyboard.nextByte();

        if(num == 1){
            System.out.printf("%d = January", num);
        }

        else if(num == 2){
            System.out.printf("%d = February", num);
        }

        else if(num == 3){
            System.out.printf("%d = March", num);
        }

        else if(num == 4){
            System.out.printf("%d = April", num);
        }

        else if(num == 5){
            System.out.printf("%d = May", num);
        }

        else if(num == 6){
            System.out.printf("%d = June", num);
        }

        else if(num == 7){
            System.out.printf("%d = July", num);
        }

        else if(num == 8){
            System.out.printf("%d = August", num);
        }

        else if(num == 9){
            System.out.printf("%d = September", num);
        }

        else if(num == 10){
            System.out.printf("%d = October", num);
        }

        else if(num == 11){
            System.out.printf("%d = November", num);
        }

        else if(num == 12){
            System.out.printf("%d = December", num);
        }
        
        else {
            System.out.printf("%d is not a month number!", num);
        }

        System.out.println(); // display a blank line

        keyboard.close(); // close the Scanner object
    }
}
