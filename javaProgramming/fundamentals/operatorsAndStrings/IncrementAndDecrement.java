/**
* Author: 2019037459
* Instructor: Phyela Mbewe
* Description: Understanding how the Increment and Decrement works 
*              They are useful during the implementation of loops(more on this later)
*/

public class IncrementAndDecrement
{
    public static void main(String[] args)
    {
        // Increment operator (++) increases a value by 1
        //
        byte var_age = 20;  // declare variable var_age and initialise it a value of 20
        System.out.printf("In 2020 i was %d years old.", var_age);

        // Use the increment operator to increase the value of var_age by 1
        //
        var_age ++; 
        System.out.printf("\nIn 2021 i am %d years old.", var_age);

        // Decrement operator (--) decreases a value by 1
        //
        // use the decrement operator to decrease the value of var_age by 1
        var_age --;
        System.out.printf("\nTaking 2020 as the current year and 20 as my age, my year " +
                  "of birth will be given by (2020 - 20 - 1) = " + (2020 - var_age - 1));

    }

}
