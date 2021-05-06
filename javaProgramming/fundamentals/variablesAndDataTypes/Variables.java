/**
* Author: 2019037459
* Instructor: Phyela Mbewe
* Description: Understanding how to use variables and data types in java
*/
public class Variables
{
   // main method begins the execution of a java application
   public static void main(String[] args)
   {
      // Demonstrating integer data types
      byte var_user_age = 89;
      short var_user_id = 23507;
      long var_commit_id = 9223372036854775807L;
      
      // Decimal data types
      float var_float_pi = 3.142F;
      double var_double_pi = 32.141592653589793532;
      
      System.out.println("User age: "+ var_user_age);
      System.out.println("User Id: " + var_user_id);
      System.out.println("Commit Id: " + var_commit_id);
      
      // Boolean data type
      boolean is_registered = true;
      boolean isWindy = false;
      
      // Demonstrating String data types
      char gender = 'M';
      System.out.println(gender);

      System.out.printf("The value of pi upto 3 decimal places accuracy: %1.3f\n", var_float_pi);
      System.out.println("The value of pi upto 15 decimal places accuracy: " + var_double_pi);
      
      short addition = (short)(var_user_age + var_user_id);    // addition will always result into an int value hence
                                                               // the need for casting
      // Display the contents of addition                                               
      System.out.println(addition);
   }
}
