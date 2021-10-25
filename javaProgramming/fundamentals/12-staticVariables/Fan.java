/**
 * Fan class under construction
 */

public class Fan
{
    // instance variables 
    private int speed;
    private boolean isOn;
    private String model;

    // static variables
    private static int numOfFans;

    /**
     * Constructor
     * @param model The model name of the Fan object
     */
    public Fan(String model)
    {
        this.model = model;
    }

    /**
     * setSpeed() Stores the value of speed in the speed field of Fan object 
     * @param speed The value to be stored in the speed field
     */
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    /**
     * getSpeed() Returns the value of speed stored in the speed field
     * @return speed The value of speed to be returned
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
     * setIsOn() Initializes the isOn field of the Fan object to true or false
     * @param isOn The boolean value to be stored in the isOn field
     */
    public void setIsOn(boolean isOn)
    {
        this.isOn = isOn;
    }

    /**
     * The getModel() returns the model name of the Fan object
     * @return model The model name to be returned
     */ 
    public String getModel()
    {
        return model;
    }

    // static methods

    /**
     * The setNumOfFans() Initializes numOfFans field to a value
     * @param num The value to be stored in numOfFans field
    */
    public static void setNumOfFans(int num)
    {
        numOfFans = num;
    }

    /**
     * The getNumOfFans() Returns the value stored in numOfFans field
     * @return numOfFans The value stored in numOfFans field 
     */
    public static int getNumOfFans()
    {
        return numOfFans;
    }
}
