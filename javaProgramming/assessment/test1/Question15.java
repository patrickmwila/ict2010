/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: Determining output of a program
 */

public class Question15
{
    public static void main(String[] args)
    {
        int x = 22, y = 4;
        int i = 0;

        do
        {
            y /= 2;
            x += y;
            i++;

        } while (y > 2);
        
        System.out.println(" i = " + i);
    }
}
