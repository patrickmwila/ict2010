/**
 * Author     : 2019037459
 * Date       : 15-11-2021
 * Description: lab10 question 1
 */

public class StudentTester
{
    public static void main(String[] args)
    {
        // create an instance of Student class
        Student student1 = new Student();

        Student student2 = new Student("John", 15);

        // display the required output
        System.out.println(
            "Student 1 is " + student1.getName() + 
            "\nStudent 2 is " + student2.getName()
        );

        System.out.println(
            "Student's 1 age is " + student1.getAge() + 
            "\nStudent's 2 age is " + student2.getAge()
        );
    }
}
