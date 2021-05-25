/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 25/05/2021
 * Description: A program that displays the multiplication table of a positve
 *              integer.
 */

import java.util.Scanner;

public class MultTable
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int var_int,
            var_count;

        System.out.println("========= Multiplication Table Calculator =========");
        System.out.print("Enter a positive integer: ");
        var_int = keyboard.nextInt();
        
        for(var_count = 0; var_count <= 12; var_count++)
        {
            String var_message = var_count + " x " + var_int + " = ";
            int var_result = var_count * var_int;

            System.out.printf("%s %d\n", var_message, var_result);
        }
    }
}
