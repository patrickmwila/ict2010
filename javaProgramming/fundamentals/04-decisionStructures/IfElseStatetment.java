/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 15/05/2021
 * Description: A program that demonstrates how to implement decision
 *              Structures in java using if else statement(branching).
 *
 *              It is an if statement with an additional code block which is 
 *              only executes when the if statement evaluates to false.
 *              -- 1 of 2 code blocks will be executed whether the if
 *                 statement's condition is true or false.
 */
import javax.swing.JOptionPane; // import the JOptionPane class

public class IfElseStatetment
{
    public static void main(String [] args)
    {
        String message      = "This program will tell you if the number you " +
                              "give it, is an even or old number.",
               messageEven  = " is an even number.",
               messageOld   = " is an old number.",
               messageTitle = "Even-Old Calculator";

        JOptionPane.showMessageDialog(null, message,
                                      messageTitle,
                                      JOptionPane.PLAIN_MESSAGE);

        String userNumStr = JOptionPane.showInputDialog("Enter a number");

        int userNum = Integer.parseInt(userNumStr); // convert userNumStr to int

        // check if userNum is even or old and display the message to the user
        boolean evenFlag = (userNum % 2 == 0);

        if (evenFlag)
        {
            JOptionPane.showMessageDialog(null, userNum + messageEven,
                                         messageTitle,
                                         JOptionPane.PLAIN_MESSAGE);
        }

        else
        {
            JOptionPane.showMessageDialog(null, userNum + messageOld,
                                          messageTitle, 
                                          JOptionPane.PLAIN_MESSAGE);
        }

    }
}
