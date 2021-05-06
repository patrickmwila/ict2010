/**
* Author: 2019037459
* Instructor: Phyela Mbewe
* Description: Understanding the implementation of string concatenation.
*              Concatenation is joining multiple strings together into one
*              string.
*              Java uses the (+) operator for string concatenation.
*              NB: Strings are sequences of charaters enclosed in double quotation
*                  marks
*/

public class StringConcatenation
{
    public static void main(String[] args)
    {
        // Declare a variable firstname and initialise it a value(your firstname)
        String var_firstname = "Patrick ";

        // Display the value of var_firstname to the screen
        System.out.printf("Firstname: %s", var_firstname);

        // Declare a variable lastname and initialise it a value(your lastname)
        String var_lastname = "Mwila"; 

        // Display the value of var_lastname to the screen
        System.out.printf("\nLastname: %s", var_lastname);

        // Declare a variable fullname and initialise it with firstname + lastname
        String var_fullname = var_firstname + var_lastname; // String concatenation on variables

        // Display the value of var_fullname to the screen
        System.out.println("\nFullname: " + var_fullname); // String concatenation on string literal and string variable
        
    }

}
