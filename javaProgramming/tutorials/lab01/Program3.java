/**
 * Author        : 2019037459
 * Instructor    : Phyela Mbewe
 * Date          : 14/05/2021
 * Description   : A simple program learning error identification
 *
 * Bugs reported :
 *               1. Line 10 has a syntax error, mispelled key word "publi"
 *                  instead of "public". (syntax error)
 *               2. Line 13 ends withe a comma ',' instead of a semi colon ';'
 *                  it's a syntax error.
 *               3. Line 15 uses a comparison operater(==) instead of an 
 *                  assignment operator (=) when assigning the division
 *                  result of a/b to rainfall variable. (compilation error)
 *               4. Line 16 has a syntax error, the class name 'String' starts
 *                  with a lower case letter 's' which should not be the case.
 *               5. Line 17 Should start with upper case 'S' when writing the 
 *                  System class
 */

public class Program3
{
    public static void main(String [] args)
    {
        int a = 20;
        int b = 15;

        double rainfall = a/b; // basic division
        String year = "The year was: " + a + b; // String concatenation
        System.out.println(year);
        String name = "rick";
        System.out.println(name.substring(1));
    }
}
