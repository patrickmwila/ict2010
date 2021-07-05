/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: Determining output of a program
 */

public class Question05
{
    public static void main(String[] args)
    {
        int i = 1, j = 1;

        while(i <= j) 
        {
            while ( i < 3) 
            {
                if ( i >= j) 
                {
                    i++;
                }
            }

            j--;
        }

        System.out.println(j);
    }
}
