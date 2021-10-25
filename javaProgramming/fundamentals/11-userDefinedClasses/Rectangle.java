public class Rectangle
{
    // instance variables 
    private int height;
    private int width;


    /**
     * Default Constructor 
     */
    public Rectangle()
    {
        this.height = 0; 
        this.width  = 0;
    }

    /**
     * Constructor 
     */
    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width  = width;
    }

    /**
     * setHeight() Stores a value in the height field
     * @param height The value to be stored
     */
    public void setHeight(int height)
    {
        this.height = height;
    }

    /**
     * getHeight() retrieves the value stored in the height field
     * @return The height value of the rectangle object
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * setWidth() Stores a value in the width field
     * @param width The value to stored
     */
    public void setWidth(int width)
    {
        this.width = width;
    }

    /**
     * getWidth() retrieves the value stored in the width field
     * @return The width value of the rectangle object
     */
    public int getWidth()
    {
        return width;
    }

}


