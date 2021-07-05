/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: Determining output of a program
 */

public class Question07
{
    public static void main(String[] args)
    {
        String student1 = "Jack";
        String student2 = "Jane";

        if ( (student1.compareTo(student2)) % 2 > 0 ) 
        {
            System.out.println("Student 1 was picked");
        }

        else  // this block is executed
        {
            System.out.println("Student 2 was picked");
        }

    }
}
