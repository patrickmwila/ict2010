/**
 * Author        : 2019037459
 * Instructor    : Vernon M. Simwinga (BIT)
 * Date          : 06-08-2021
 * Description   : A program that uses the Scanner class to get input.
 */

import java.util.Scanner;

public class Question_01
{
    public static void main(String[] args)
    {
        // create a Scanner object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // declare variables and initialize them with default values
        String first_name  = null,     
               middle_name = null,   
               last_name   = null,
               initials    = null;    

        // prompt for user input
        System.out.print("Please enter your first name: ");
        first_name = keyboard.nextLine();
        
        System.out.print("Please enter your middle name: ");
        middle_name = keyboard.nextLine();
        
        System.out.print("Please enter your last name: ");
        last_name = keyboard.nextLine();

        // generate user's initials
        initials = first_name.substring(0,1) + middle_name.substring(0,1) + 
                   last_name.substring(0,1);

        // display message
        System.out.println("Welcome to the system " + initials.toUpperCase());
    }
}

