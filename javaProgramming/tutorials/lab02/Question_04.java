/**
 * Author        : 2019037459
 * Instructor    : Vernon M. Simwinga (BIT)
 * Date          : 06-08-2021
 * Description   : 
 */
import javax.swing.JOptionPane;

public class Question_04
{
    public static void main(String[] args)
    {
        // declare variables and initialize them with default values
        int num_of_tests = 0,
            test_01 = 0,
            test_02 = 0,
            test_03 = 0;
       double average_score = 0.0;

       // prompt for user input
       String str;
       str = JOptionPane.showInputDialog(
                        "Please enter the number of tests written:"
                        );

       // convert the number of tests to int
       num_of_tests = Integer.parseInt(str); 

       // pompt the user based on the following conditions
       // and then display the required results
       if (num_of_tests == 2)
       {
           str = JOptionPane.showInputDialog("Please enter a mark for test 1: ");
           test_01 = Integer.parseInt(str);

           str = JOptionPane.showInputDialog("Please enter a mark for test 2: ");
           test_02 = Integer.parseInt(str);

           average_score = (test_01 + test_02) / 2;
           str = String.format("Your average is %.1f", average_score);
           JOptionPane.showMessageDialog(null, str + "%");
       }

       else if(num_of_tests == 3)
       {
           str = JOptionPane.showInputDialog("Please enter a mark for test 1: ");
           test_01 = Integer.parseInt(str);

           str = JOptionPane.showInputDialog("Please enter a mark for test 2: ");
           test_02 = Integer.parseInt(str);

           str = JOptionPane.showInputDialog("Please enter a mark for test 3: ");
           test_03 = Integer.parseInt(str);

           average_score = (test_01 + test_02 + test_03) / 3; 
           str = String.format("Your average is %.1f", average_score);
           JOptionPane.showMessageDialog(null, str + "%");
       }

       else 
       {
           JOptionPane.showMessageDialog(null, "Sorry, an error was \nencountered goodbye");
       }
   }
}
