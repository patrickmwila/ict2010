/**
* Author: 2019037459
* Instructor: Phyela Mbewe
* Description: Understanding how to use assignment operators in java
*/

public class AssignmentOperators
{
    public static void main(String[] args)
    {
        // Assignment operators include:
        // (=), (+=), (-=), (*=), (/=) and (%=).
        //
        // Note: Mostly, use these operators on initialised variables 
        //
        // Assign means give a new value to a variable
        // Implementation
        // Find the +, -, * , / and % of 1110 and 2010
        // NB: there is a logical error somewhere...find it -)

        short var_num = 1110,
              var_num1 = 2010;

        System.out.printf("We start with the value %d", var_num);

        var_num += var_num1;
        System.out.printf("\nadding %d we get: ", var_num1 );
        System.out.println( "\n"+ var_num);
        
        var_num -= var_num1;
        System.out.printf("Substracting %d from the new value we get: ", var_num1 );
        System.out.println("\n" + var_num);

        var_num *= var_num1;
        System.out.printf("Multiplying the new value by %d we get: ", var_num1 );
        System.out.println("\n" + var_num);

        var_num /= var_num1;
        System.out.printf("Dividing the new value by %d we get: ", var_num1 );
        System.out.println("\n" + var_num);


        var_num %= var_num1;
        System.out.printf("Finding the remainder of %d / %d we get: ", var_num, var_num1);
        System.out.println("\n" + var_num);

    }
    

}
