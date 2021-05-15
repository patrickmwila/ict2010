/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 14/05/2021
 * Description: A program that uses the jOptionPane class 
 *              Used to read keyboard input from the user through the use
 *              of a dialog box (user interface)
 *              Also used to display output through the use of a dialog box
 *
 *              The showInputDialog() reads and returns a string from the
 *              user's keyboard input via the use of a dialog box
 *       
 *              Methods of JOptionPane class are static
 *              i.e the methods are used with the class(datatype) and not with
 *              an object(variable)
 */

import javax.swing.JOptionPane;

public class UserInput
{
    public static void main(String [] args)
    {
        // receive user input with dialog box (using JOptionPane class)
        String userName = JOptionPane.showInputDialog("Enter your name");

        // display output via a dialog box
        // showMessageDialog() takes in takes in 2 or 4 inputs | read more about this
        // 1. use null if the dialog box will not be part of another (parent) frame
        // 2. use a String variable or String "value" for the message to be displayed

        String message = userName + ", Welcome to ICT2010!";
        String messageTitle = "Registration";

        JOptionPane.showMessageDialog(null, message, messageTitle,
                                     JOptionPane.INFORMATION_MESSAGE); 

        // NB: the showMessageDialog() has 5 messge types
        // 1. ERROR_MESSAGE
        // 2. INFORMATION_MESSAGE
        // 3. QUESTION_MESSAGE
        // 4. WARNING_MESSAGE
        // 5. PLAIN_MESSAGE
    }
}
