/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 15/05/2021
 * Description: A program that demonstrates how to implement decision 
 *              structures in java using the switch statement.
 *
 *              It is similar to an if else if statement.
 *              It executes exactly one of many code blocks based on the
 *              value of a given variable.
 */
import java.util.Scanner;

public class SwitchStatement
{
    public static void main(String [] args)
    {
        // Exercise one
        byte day = 5;
        
        switch(day)
        {
            case 3:
                System.out.println("Tuesday special");
                break;
            
            case 4:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Not Tuesday");
                System.out.println("Not Wednesday");
                break;
        }

    }
}
