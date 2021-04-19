import javax.swing.JOptionPane;
import java.util.Scanner;

// class header 
public class Testing
{
   // main method begins the execution of a java application
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double purchasePrice$ = 234.2042;
      System.out.println(purchasePrice$);
      System.out.println("This is a java application");
      JOptionPane.showMessageDialog(null, "Understanding syntax, semantics and paradigms " +
                                    "is the basics of programming.");

      System.out.print("Enter your studentID: ");
      int userID = keyboard.nextInt();
      JOptionPane.showMessageDialog(null, userID + " Welcome to the " + 
                                    "University of Zambia.");
   }
}
