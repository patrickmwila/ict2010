/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: Determining output of a program
 */

public class Question10
{
    public static void main(String[] args)
    {
        int s = 1;
        int n = 1;

        while (n < 4)
        {
            if (n == 3)
            {
                s += n;
                System.out.print(s);

                n++;
            }

            else 
            {
                s += n;
                System.out.print(s + ",");

                n++;
            }
        }

    }
}
