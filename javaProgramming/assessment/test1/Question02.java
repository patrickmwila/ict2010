/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Description: Determining output of a program
 */

public class Question02
{
    public static void main(String[] args)
    {
        String student1 = "John";
        String student2 = "Zulu";

        if (student1.compareTo(student2) < 0)
        {
            System.out.println("Student 1 is " + student1);
        }

        else if (student1.compareTo(student2) > 0)
        {
            System.out.println("Student 2");
        }

        else 
        {
            System.out.println("Possible duplicate!");
        }
    }
}
