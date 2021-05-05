/**
* Author: 2019037459
* Instructor: Phyela Mbewe
* Description: Understanding how to work with arithmetic operations in java
*/

public class ArithmeticOperations
{
   // main method begins the execution of a java application
   public static void main(String[] args)
   {
      // Java can be used to perform calculations using arithmetic operators( +, -, *, /, %(modulus))
      // The addition (+) operator
      
      int var_num1 = 100;   // declare and initialise var_num1
      int var_num2 = 26;    // declare and initialise var_num2
      
      int var_sum = var_num1 + var_num2; // declare var_sum and initialise it with the result of var_num1 + var_num2
      System.out.println(var_sum);       // display the value of var_sum
      
      // The subtraction (-) operator
      //
      int var_sub = var_num1 - var_num2;
      System.out.println(var_sub);
      
      // The multiplication (*) operator
      //
      int var_mult = var_num1 * var_num2;
      System.out.println(var_mult);
      
      // The multiplication (/) operator
      //
      double var_div = var_num1 / var_num2;
      System.out.println(var_div);
      
      // The modulus (%) operator (returns the reminder of an arithmetic operation)
      // 
      double var_mod = var_num1 % var_num2;
      System.out.println(var_mod);

      // The boolean operator returns true or false
      //
      boolean var_is_windy = true;
      System.out.println("Is it windy today: " + var_is_windy);
      
      var_is_windy = false;

   }

}
