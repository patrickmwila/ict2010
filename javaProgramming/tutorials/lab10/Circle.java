/**
 * Author     : 2019037459
 * Date       : 15-11-2021
 * Description: lab10 question 2
 */

public class Circle
{
    // instance variables
    private double radius;

    /**
     * Constructor
     * @param radius The radius of the instance created
     */
    public Circle(double radius)
    {
        this.radius = radius;
    }

    /**
     * area() calculates and returns the area of the circle
     * @return The area of the circle
     */

    public double area()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

}
