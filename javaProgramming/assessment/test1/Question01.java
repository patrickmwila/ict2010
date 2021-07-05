/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: This program implements an if-elseif statement of the 
 *              corresponding switch statement provided in question.
 */

public class Question01
{
    public static void main(String[] args)
    {
        int day = 4; // declare day as int and initialize it with 4

        // implement an if elseif block
        if (day == 3)
        {
            System.out.println("Tuesday special");
        }

        else if (day == 4)
        {
            System.out.println("Wednesday");
        }

        else 
        {
            System.out.println("Not Wednesday");
            System.out.println("Nor Tuesday");
        }

    }
}
