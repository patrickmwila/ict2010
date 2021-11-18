/**
 * Author     : 2019037459
 * Description: A program that implements a Caeser cipher 
 *              cryptography algorithm
 */

import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {
        // prompt for user input
        String plainText = JOptionPane.showInputDialog(
            "Enter the message to be encrypted"
        );

        String strShiftValue = JOptionPane.showInputDialog(
            "Enter the shift value"
        );
        int shiftValue = Integer.parseInt(strShiftValue);

        String shiftDirection = JOptionPane.showInputDialog(
            "Enter shift direction (Right/Left)"
        );

        // get the length of plainText
        int plainTextLen = plainText.length();

        // create a char array of size plainTextLen
        char[] chars = new char[plainTextLen];

        // use a loop to store characters from plainText into chars array
        for (int i = 0; i < plainTextLen; i++)
        {
            chars[i] = plainText.charAt(i);
        }

        // use a loop to encrypt the plainText
        String encryptedInf = "";
        for (int i = 0; i < plainTextLen; i++)
        {
            if (shiftDirection.equalsIgnoreCase("right"))
            {
                char charEncrypted = (char)(chars[i] + shiftValue);
                encryptedInf += charEncrypted;
            }

            else if (shiftDirection.equalsIgnoreCase("left"))
            {
                char charEncrypted = (char)(chars[i] - shiftValue);
                encryptedInf += charEncrypted;
            }
        }

        // display the encrypted data
        JOptionPane.showMessageDialog(null, "Encrypted text is:\n" + encryptedInf);
    }
}
