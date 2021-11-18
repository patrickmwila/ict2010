/**
 * Author     : 2019037459
 * Date       : 15-11-2021
 * Description: lab10 question 1
 */

public class Student
{
    // instance variables
    private String name;
    private int age;

    /**
     * Default constructor
     */
    public Student()
    {
        this.name = "N/a";
        this.age  = 0;
    }

    /**
     *  Constructor
     *  @param name The name of the instance student
     *  @param age  The age of the instance student
     */
    public Student(String name, int age)
    {
        this.name = name;
        this.age  = age;
    }


    // getters

    /**
     * getName() returns the student's name
     * @return The String from the name attribute
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * getAge() returns the student's age
     * @return The integer from the age attribue
     */
    public int getAge()
    {
        return this.age;
    }
    
}
