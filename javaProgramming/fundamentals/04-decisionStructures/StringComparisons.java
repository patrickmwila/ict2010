/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 15/05/2021
 * Description: A program that demonstrates how to implement string
 *              comparisons in java.
 */

public class StringComparisons
{
    public static void main(String [] args)
    {
        // equals() -- used to compare two string variables
        String str1 = "Rob",
               str2 = "Rob";
        
        if (str1.equals(str2))
        {
            System.out.printf("%s = %s\n", str1, str2);
        }

        else
        {
            System.out.printf("%s != %s\n", str1, str2);
        }

        // equalsIgnoreCase() -- compares strings by omitting case sensitivity
        String str3 = "Shadreck",
               str4 = "SHADreck";

        if (str3.equalsIgnoreCase(str4))
        {
            System.out.printf("\n%s = %s regardless of the letter case.\n",
                             str3, str4);
        }
        else
        {
            System.out.printf("\n%s != %s\n", str3, str4);
        }

        // compareTo() -- compares the alphabetical order of two Strings
        // compareTo() method returns an integer value.
        // Read more about it's implementation to understand the code below
        
        if (str1.compareTo(str3) < 0)
        {
            System.out.printf("%s comes before %s in the dictionary.\n",
                              str1, str3);
        }

        else if (str1.compareTo(str3) > 0)
        {
            System.out.printf("%s comes after %s in the dictionary.\n",
                              str1, str3);
        }

        else if (str1.compareTo(str3) == 0)
        {
            System.out.printf("%s and %s are at the same level in the " + 
                             "dictionary.\n", str1, str3);
        }
    }
}
