/**
* Author: 2019037459
* Instructor: Phyela Mbewe
* Description: Understanding String methods
    
              String data type is a built in class in java
              Variables of type Class are technically called reference variables
              
              Reference variables hold the address of the memory location of the 
              it's value and not the value itself
      
              One vital difference between a primitive variable and a reference
              variable is that:
              Primitive variables store 1 value
              Reference variables have associated with them, the methods of the 
              class type used to declare them.        
              Refer to any online documentation for more information.
*/

public class StringMethods1
{
    public static void main(String[] args)
    {
        String var_username = "Harold Finch";
        String var_new_username = var_username.toUpperCase(); // NB: since var_username acts as an object as it 
                                                              //     references an object in memory, associated with
                                                              //     it are functions of the String class
                                                              
        // note Strings are immutable, hence var_username.toUpperCase returns a string different from var_username
        // i.e the original value of var_username is intact                                               
        System.out.println("User name in title case: " + var_username);
        System.out.println("User name in upper case: " + var_new_username); // Hint: check the java api for more string methods
        
        // Other usefull string methods | length(), 
        System.out.println("Length of " + var_username + " = " + 
                var_username.length());
        System.out.println("Length of " + var_new_username + " = " + 
                var_new_username.length());


        // String comparison ()
        String var_admin = "Adminroot";
        String var_root = "adminroot";

        boolean var_check = var_admin.equals(var_root); // equals() method compares the value contained in the addresses of two strings and returns a boolean
        System.out.println(var_check); // display the value of var_check

        // String comparison using '==' operator
        //boolean var_check2 = var_admin == var_root; // the == operator compares the addresses and not the values stored in them. 
                                                     // value of var_check2 will be true since var_admin and var_root reference the same object
       // System.out.println(var_root == var_admin);
        
        String var_to_lower = var_admin.toLowerCase(); 
        boolean var_check3 = var_to_lower == var_admin;  // variable var_check3 will be false (using the == ) as the string 
                                                        // returned from the toLowerCase() is different though being lowercase
                                                        // i.e a new object is created and it's address is referenced by var_to_lowerCase
        System.out.println(var_check3);
        
        // Using the equals() method to compare var_check4 and var_root returns true
        // because the equals() method compared the String literals
        
        // Always remember this behaviour
        boolean var_check4 = var_to_lower.equals(var_root);
        System.out.println(var_check4);
    }
}
