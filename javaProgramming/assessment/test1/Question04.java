/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: Determining output of a program
 */

public class Question04
{
    public static void main(String[] args)
    {
        int num = 5;
        final int LIMIT = 7;

        for (int i = 5; i <= LIMIT; i++)
        {
            int x = (i + i) - 1;
            num = num + x;
        }

       //  14 + 11 + 13 = 38

        System.out.println(num);
    }
}
