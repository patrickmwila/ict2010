/**
 * Author        : 2019037459
 * Instructor    : Vernon M. Simwinga (BIT)
 * Date          : 06-08-2021
 * Description   : A program which uses the Scanner class to get input.
 */

import javax.swing.JOptionPane;

public class Question_02
{
    public static void main(String[] args)
    {
        // declare variables and initialize them with default values
        String first_name  = null,     
               middle_name = null,   
               last_name   = null,
               initials    = null;    

        // prompt for user input
        first_name = JOptionPane.showInputDialog("Please enter your first name");
        
        middle_name = JOptionPane.showInputDialog("Please enter your middle name");
        
        last_name = JOptionPane.showInputDialog("Please enter your last name");

        // generate user's initials
        initials = first_name.substring(0,1) + middle_name.substring(0,1) + 
                   last_name.substring(0,1);

        // display message
        JOptionPane.showMessageDialog(null, "Welcome to the system " + initials.toUpperCase());
    }
}

