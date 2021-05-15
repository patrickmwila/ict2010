/**
* Author     : 2019037459
* Instructor : Phyela Mbewe
* Data       : 13/05/2021
* Description: Understanding Type Casting
*              Changing a value from one data type into another data type
*              Syntax:
*              variable = (datatype)value;
*              Types of casting:
*              Widening Casting (automatically) - converting a smaller type to a larger type size
*              byte -> short -> char -> int -> long -> float -> double
*              
*              Narrowing Casting (manually) - converting a larger type to a smaller size type
*              double -> float -> long -> int -> char -> short -> byte
*/

public class TypeCasting
{
   public static void main(String[] args)
   {
      // Widening (implicit) casting is done automatically when passing a smaller size type to a larger size type:
      int myInt = 9;
      double myDouble = myInt; // Automatic casting: int to double

      System.out.println(myInt);      // Outputs 9
      System.out.println(myDouble);   // Outputs 9.0
    
      // Narrowing (explicit) casting must be done manually by placing the type in parentheses in front of the value
      // Narrowing casting causes values after the decimal point to be truncated in the case of changing double data type to INT data type
      // note: truncation does not round off the decimal value

      double myDouble2 = 9.78;
      int myInt2 = (int) myDouble2; // Manual casting: double to int
   
      System.out.println(myDouble2);   // Outputs 9.78 
      System.out.println(myInt);      // Outputs 9 
    
       // String to int conversion
       // Numeric built in classes have methods that enables numbers stored as strings to be converted to the equivalent data type
      // Syntax:
      // variable(optional) = dataype.parseType("123...");
      // eg:
      // int i = Integer.parseInt("77");
      // double k = Double.parseDouble("3.142");
    
       String phoneNumber = "0972338617";
       System.out.println(Integer.parseInt(phoneNumber)) ;

//         String name = "rick";
//         System.out.println(name.substring(1));
//         double var_pie = 3.141;
//         String var_str_pie = var_pie; causes a compilation error
//         String var_str_pie = "" + var_pie; // this will work
//         //String var_str_pie = Double.toString(var_pie); // this will work 
//         System.out.println(var_str_pie);
      
       int a  = 1324;
       //String b = "" + a;
       String b = Integer.toString(a);
       System.out.println(b); 
    }
}
