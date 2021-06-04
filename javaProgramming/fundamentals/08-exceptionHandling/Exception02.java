/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 03/06/2021
 * Description: A program that demonstrates the NumberFormatException, By 
 *              calculates the age of the user.
 *
 *              This occurs when an attempt to convert a String into a number 
 *              has taken place, but the String does not contain suitable 
 *              characters (only digits).
 */

// import all the necessary classes 
import javax.swing.JOptionPane;

public class Exception02
{
    public  static void main(String [] args)
    {
        
        String var_prompt1 = "Enter your date of birth (eg 2000)",
               var_prompt2 = "Enter the current year (eg 2021)",
               var_title   = "Age Calculator";
        
        // display prompt to the user
        String var_p1 = JOptionPane.showInputDialog(var_prompt1),
            var_p2 = JOptionPane.showInputDialog(var_prompt2);

        try
        {
            int var_date_of_birth = Integer.parseInt(var_p1),
                var_current_year  = Integer.parseInt(var_p2),
                var_age           = var_current_year - var_date_of_birth;

            String var_disp = "I think you are " + var_age + " years old this year.";
            JOptionPane.showMessageDialog(null, var_disp, var_title, JOptionPane.PLAIN_MESSAGE);

        } 
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "You provided an invalid input! " +
                                        "\nPlease try again.");
        }

    }
}
