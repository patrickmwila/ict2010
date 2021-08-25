/**
 * Author        : 2019037459
 * Instructor    : Vernon M. Simwinga (BIT)
 * Date          : 21-08-2021
 * Description   : A program that reads a firstname (String) and then displays
                   the name with each character on a separate line.
 */
import javax.swing.JOptionPane;

public class Question_03
{
    public static void main(String[] args)
    {
        String firstname = null,
               output    = "Welcome\n";

        // prompt for user input using a dialog box
        firstname = JOptionPane.showInputDialog(
                        "Please enter firstname"
                    );

        // use a for loop to get each character of firstname
        // concatenating it to output
        for (int i = 0; i < firstname.length(); i++)
        {
            output += firstname.charAt(i) + "\n";
        }

        // display the contents of output
        JOptionPane.showMessageDialog(null, output);
    }
}
