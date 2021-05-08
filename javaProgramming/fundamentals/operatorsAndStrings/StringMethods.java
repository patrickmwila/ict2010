/**
* Author: 2019037459
* Instructor: Phyela Mbewe
* Description: Understanding String methods
    
              String data type is a built in class in java
              Variables of type Class are technically called reference variables
              i.e they reference Class objects
              Reference variables hold the address of the memory location of the 
              it's value(object) and not the value(object) itself
      
              One vital difference between a primitive variable and a reference
              variable is that:
              Primitive variables store 1 value
              Reference variables have associated with them, not only the
              object but the methods/functions of the class type used to
              declare them.        
              Refer to any online documentation for more information.
*/

public class StringMethods
{
    public static void main(String[] args)
    {
        String var_username = "Harold Finch";
        System.out.println(var_username.toUpperCase());
        
        byte var_age = 21;
        String var_new_age = var_age.toString();
        System.out.println(var_new_age);

    
    }
}
