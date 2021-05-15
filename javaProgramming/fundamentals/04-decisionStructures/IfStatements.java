/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 15/05/2021
 * Description: A program that demonstrates how to implement decision
 *              Structures in java using if statements.
 *              Pre-requiste: You want to be familiar with Conditional 
 *                            Operators(>, <, >=, <=, == and !=) 
 *                            and
 *                            Logical operators[ &&(and), ||(or), 
 *                            ^(Exclusive or) and !(Not) ].
 *
 *              An if statement is a conditional statement whereby:
 *              -- A block of code will only be executed if the specified 
 *                 condition evaluates to true.
 *
 *              The if statement is used to create a decision structure, which
 *              allows a program to have more than one path of execution.
 */

public class IfStatements
{
    public static void main(String [] args)
    {
        // examples 
        byte num1 = 10;

        if (num1 < 20)
            System.out.println(num1);

        byte num2 = 20;
        if (num2 > num1) // check if num2 is greater than num1
        {
            System.out.printf("%d is greater than %d\n", num2, num1);

            System.out.printf("%d + %d = ", num1, num1);
            num1 = (byte)(num1 + num1);
            System.out.println(num1);
        }
        
    }
}

